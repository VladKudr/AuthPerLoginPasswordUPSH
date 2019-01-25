package com.kurdi.utils;

import java.math.BigInteger;

public interface BytesUtil {
     static byte[] trimBytePaddingLeft(byte[] toTrimArray) {
        int count = 0;
        for (byte buf : toTrimArray) {
            if (buf != 0) {
                break;
            } else {
                count++;
            }
        }

        byte[] trimmed = new byte[toTrimArray.length - count];
        System.arraycopy(toTrimArray, count, trimmed, 0, trimmed.length);
        return trimmed;
    }

    static byte[] bigIntToBytes(BigInteger v) {
        byte[] b = v.toByteArray();
        int k;
        for (k = 0; k < b.length; k++) {
            if (b[k] != 0) {
                break;
            }
        }
        if (k > 0) {
            byte[] b2 = new byte[b.length - k];
            System.arraycopy(b, 1, b2, 0, b2.length);
            b = b2;
        }
        return b;
    }
}
