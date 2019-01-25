package com.kurdi.auth.srp;

import com.kurdi.utils.BytesUtil;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public  class SRPService {

    private static BigInteger N, g,a,A;
    private static int gLength;
    private static int NLength;
    static {
        N = new BigInteger(
                "0115B8B692E0E045692CF280B436735C77A5A9E8A9E7ED56C965F87DB5B2A2ECE3",
                16);
        g = new BigInteger("2", 16);
        gLength = g.toByteArray().length;
        NLength = N.toByteArray().length * 8;
        a = new BigInteger("D0F6A2EC715AD49030FB4BECAB68079B614B1B8631B3DC17CEE141BCE0DA8D5D", 16);

        A = g.modPow(a, N);

    }
    public static List<byte[]> getKandAWNew(String login, String password, byte[] Salt, byte[] B_arr) {
        List<byte[]> result = new ArrayList<>();



        BigInteger B = new BigInteger(1, B_arr);

        //Инициализация алгоритма хеширования
        MessageDigest digest;
        try {
            digest = MessageDigest.getInstance("SHA-1");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e.getMessage(), e);
        }


        digest.update(N.toByteArray());

        for (int i = (NLength >>> 3) - gLength; i > 0; i--)
            digest.update((byte) 0);
        digest.update(g.toByteArray());

        byte[] kBytes = digest.digest();
        BigInteger k = new BigInteger(1, kBytes);

        BigInteger vs = new BigInteger(1, Salt);

        digest.reset();


        byte[] vUserPasswordHash = digest.digest(BytesUtil.trimBytePaddingLeft((login + ":" + (password == null ? "" : password.trim())).getBytes(Charset.forName("UTF-8"))));
        digest.reset();

        digest.update(BytesUtil.trimBytePaddingLeft(vs.toByteArray()));
        digest.update(BytesUtil.trimBytePaddingLeft(vUserPasswordHash));
        BigInteger vx = new BigInteger(1, BytesUtil.trimBytePaddingLeft(digest.digest()));

        if (vx.compareTo(N) > 0) {
            vx = vx.mod(N);
        }


        digest.reset();

        for (int i = (NLength >>> 3) - A.toByteArray().length; i > 0; i--)
            digest.update((byte) 0);

        digest.update(A.toByteArray());


        for (int i = (NLength >>> 3) - B.toByteArray().length; i > 0; i--)
            digest.update((byte) 0);

        digest.update(B.toByteArray());
        byte[] uArr = digest.digest();

        BigInteger u = new BigInteger(1, uArr);

        if (u.compareTo(N) > 0) {
            u = u.mod(N);
        }


        BigInteger pGN = g.modPow(vx, N);


        BigInteger kMult = k.multiply(pGN);
        BigInteger base = B.subtract(kMult);


        if (base.signum() < 0) {
            base = base.add(N.multiply(k));
        }


        BigInteger exp = a.add(u.multiply(vx));


        BigInteger Sb = base.modPow(exp, N);


        byte[] SIntByte = BytesUtil.bigIntToBytes(Sb);


        byte[] vk = digest.digest(SIntByte);
        BigInteger K = new BigInteger(vk);


        result.add(BytesUtil.trimBytePaddingLeft(K.toByteArray()));
        result.add(BytesUtil.trimBytePaddingLeft(A.toByteArray()));

        return result;
    }









}



