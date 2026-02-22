package com.a.alvarez.library.management.system.validate;

import org.springframework.stereotype.Component;

@Component
public class EmailValidate {

    private static final String EMAIL_REGEX =
            "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    public EmailValidate() {
    }

    public static void verifyEmail(String email) {

        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Email cannot be null or empty");
        }

        if (email.length() > 254) {
            throw new IllegalArgumentException("Email too long");
        }

        if (!email.matches(EMAIL_REGEX)) {
            throw new IllegalArgumentException("Invalid email format");
        }
    }
}
