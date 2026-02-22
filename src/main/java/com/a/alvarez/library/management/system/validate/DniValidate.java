package com.a.alvarez.library.management.system.validate;

import org.springframework.stereotype.Component;

@Component
public class DniValidate {

    private static final String DNI_REGEX = "^\\d{7,8}$";

    public DniValidate() {
    }

    public  static  void verifyDni(String dni){

        if(!(dni.matches(DNI_REGEX))){

            throw new IllegalArgumentException(
                    "Invalid DNI. It must contain 7 or 8 digits."
            );

        }

        if(dni == null){

            throw new IllegalArgumentException(
                    "DNI cannot be null."
            );

        }

        if(dni.isBlank()){

            throw new IllegalArgumentException(
                    "Invalid DNI."
            );
        }


    }
}
