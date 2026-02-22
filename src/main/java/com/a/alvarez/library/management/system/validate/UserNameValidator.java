package com.a.alvarez.library.management.system.validate;


import org.springframework.stereotype.Component;

@Component
public class UserNameValidator {

    public UserNameValidator() {
    }

    public  void usernameVerifying(String username){

        if(!(username.length() >= 6)){
            throw new IllegalArgumentException(
                    "Number of invalid characters.");

        }
        if(!(username.matches(".*[A-Z].*"))){

            throw new IllegalArgumentException(
                    "Username must contain at least one uppercase letter..");


        }
        if(!(username.matches(".*[a-z].*"))){

            throw new IllegalArgumentException(
                    "Username must contain at least one lowercase letter..");


        }
        if(!(username.matches(".*\\d.*"))){
            throw new IllegalArgumentException(
                    "Username must contain at least one number");
        }
        if(!(username.matches("^[A-Za-z0-9@._-]+$"))){
            throw new IllegalArgumentException(
                    "Password contains invalid characters.");
        }

    }
}
