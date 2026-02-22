package com.a.alvarez.library.management.system.validate;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Period;
@Component
public class BirthDateValidate {

    public BirthDateValidate() {
    }

    public static void verifyBirthDate(LocalDate birthDate){



        if(birthDate == null){
            throw new IllegalArgumentException(
                    "Birth date cannot be null."
            );
        }

        if (birthDate.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Birth date cannot be in the future");
        }

        if (birthDate.isBefore(LocalDate.of(1900, 1, 1))) {
            throw new IllegalArgumentException("Birth date is too old");
        }

        int age = Period.between(birthDate, LocalDate.now()).getYears();

        if (age < 18) {
            throw new IllegalArgumentException("User must be at least 18 years old");
        }

    }
}
