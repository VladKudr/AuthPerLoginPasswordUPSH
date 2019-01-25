package com.kurdi.utils;

import org.apache.commons.codec.binary.Base64;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Created by kudrjavtsev on 09/11/16.
 */
public class GeneralUtils {

    public static String getByteArrayToPrintFormat(List<byte[]> values) {
        StringBuilder stringBuilder = new StringBuilder();
        for (byte[] value : values) {
            stringBuilder.append("<return>").append(Base64.encodeBase64String(value))
                    .append("</return>");
        }

        return stringBuilder.toString();
    }

    public static String getDateInFormat(LocalDateTime dateTime) {

        return dateTime.format(DateTimeFormatter.ofPattern("dd_MM_yyyy"));
    }

    public static boolean checkFileExistence(String filePath) {
        try {
            if (filePath != null && filePath.length() > 0 && Files.exists(Paths.get(filePath))) {
                return true;
            }
        } catch (Exception ex) {
            return false;
        }

        return false;
    }
    public static byte[] arrayReverse(byte[] arrayOriginal) {
        byte [] arrayReversed = arrayOriginal;
        for(int i = 0; i < arrayReversed.length / 2; i++)
        {
            byte temp = arrayReversed[i];
            arrayReversed[i] = arrayReversed[arrayReversed.length - i - 1];
            arrayReversed[arrayReversed.length - i - 1] = temp;
        }

        return arrayReversed;
    }


    public static String defineRemovableDevice(String filePath) {
        if (filePath.length()<3){
            throw new RuntimeException("File path cannot be shorter than 3 symbols");
        }
        StringBuilder stringBuilder = new StringBuilder().append(filePath.charAt(0)).append(filePath.charAt(1));

        return stringBuilder.toString();
    }
}
