package com.a.alvarez.library.management.system.controller;

import com.a.alvarez.library.management.system.service.RegisterService;
import com.a.alvarez.library.management.system.util.ConsoleImputUtil;

import java.time.LocalDate;

public class RegisterController {

    private RegisterService registerService = new RegisterService();

    public RegisterController() {
    }

    public void register(){

        boolean verification = false;

        do{

            System.out.println("---------------------------------------------------------");
            System.out.println("---------------------------------------------------------");
            System.out.println("                    REGISTRATION USER  ");

            System.out.println("|*|Register Identity data");
            String firstName = ConsoleImputUtil.readString("Enter first name: ");
            String lastName = ConsoleImputUtil.readString("\nEnter last name: ");
            String dni = ConsoleImputUtil.readString("\nEnter DNI: ");
            LocalDate birthDate = ConsoleImputUtil.readLocalDate("\nEnter birth date: ");


            System.out.println("|*|Register Contact data:");
            String email = ConsoleImputUtil.readString("Enter email: ");
            String phoneNumber = ConsoleImputUtil.readString("Enter phone number: ");

            System.out.println("|*|Register Credential");
            System.out.println("Username must be at least 6 characters long and include at least one lowercase letter, \n one uppercase letter, and at least one number or special character (\"_\", \"-\", \"@\", \".\").");
            String userName = ConsoleImputUtil.readString("Enter username: ");
            System.out.println("Password must be at least 8 characters long and include at least one lowercase letter,\n one uppercase letter, and at least one number or special character (\"_\", \"-\",\"#\", \"@\", \"*\").");
            String password = ConsoleImputUtil.readString("Enter password: ");

            registerService.registerMember(firstName,lastName, birthDate, dni, email, phoneNumber,userName, password);

            ConsoleImputUtil.readString("\n" +
                    "successful registration");

        }while(verification != true);

    }

}
