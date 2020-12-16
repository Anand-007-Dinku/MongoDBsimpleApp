package com.sampleMongoCRUDapp.com.Utils;

import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;

/**
 * @author Anand SN
 */
@Service
public class StringUtils {

    public long getASCIIofWOrd(String str){

        long ASCII_of_word = 0;

        try {
            for (byte ascii : str.getBytes("US-ASCII")) {

                ASCII_of_word = ASCII_of_word + ascii;
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return ASCII_of_word;
    }
}
