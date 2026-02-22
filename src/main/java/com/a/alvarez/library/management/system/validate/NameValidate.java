package com.a.alvarez.library.management.system.validate;


import org.springframework.stereotype.Component;

@Component
public class NameValidate {

    public NameValidate() {
    }

    public static void verifyName(String firstName, String lastName) {

        if (firstName == null){
            throw new IllegalArgumentException(
                    "null first name."
            );


        }

        if (firstName.isBlank()) {

            throw new IllegalArgumentException(
                    "Invalid first name."
            );


        }
        if (lastName == null){
            throw new IllegalArgumentException(
                    "null last name."
            );


        }


        if (lastName.isBlank()) {

            throw new IllegalArgumentException(
                    "Invalid last name."
            );

        }
    }
}
