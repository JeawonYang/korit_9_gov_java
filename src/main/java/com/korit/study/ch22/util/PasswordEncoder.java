package com.korit.study.ch22.util;

import com.korit.study.ch22.repository.UserRepository;

import java.util.Objects;

public class PasswordEncoder {

    private static final long secrete = 10;

    public static String encode(String str) {
        if (Objects.isNull(str)) {
            return null;
        }
        long hash = Integer.toUnsignedLong(Objects.hash(str));
        long encodedHash = hash + Objects.hash(secrete);
        return Long.toHexString(encodedHash);
    }

    public static boolean match(String str, String encodedStr) {
        if (Objects.isNull(str) || Objects.isNull(encodedStr)) {
            return false;
        }
        return encode(str).equals(encodedStr);
    }
}

