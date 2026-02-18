package com.a.alvarez.library.management.system.controller;

import com.a.alvarez.library.management.system.service.validate.PasswordValidator;
import com.a.alvarez.library.management.system.service.validate.UserNameValidator;

import static com.a.alvarez.library.management.system.util.ConsoleImputUtil.readString;

public class LoginController {

    private final PasswordValidator passwordValidate;
    private final UserNameValidator userNameValidate;

    public LoginController() {
        this.passwordValidate = new PasswordValidator();
        this.userNameValidate = new UserNameValidator();
    }

    public void login(){

        int verification = -1;

        do{

            System.out.println("---------------------------------------------------------");
            System.out.println("---------------------------------------------------------");
            System.out.println("                    LOG IN  ");


            String userName = readString("|#|Username: ");
            String password = readString("\n|#|Password: ");




        }while(verification!=2);

    }
}
