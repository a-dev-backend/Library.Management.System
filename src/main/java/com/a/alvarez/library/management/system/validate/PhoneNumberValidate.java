package com.a.alvarez.library.management.system.validate;


import org.springframework.stereotype.Component;

@Component
public class PhoneNumberValidate {

    private static final String PHONE_REGEX =
            "^\\+?\\d{10,15}$";

    public PhoneNumberValidate() {
    }

    public static void verifyPhone(String phone) {

        if (phone == null || phone.isBlank()) {
            throw new IllegalArgumentException("Phone cannot be null or empty");
        }

        if (!phone.matches(PHONE_REGEX)) {
            throw new IllegalArgumentException("Invalid phone number");
        }
    }
}
