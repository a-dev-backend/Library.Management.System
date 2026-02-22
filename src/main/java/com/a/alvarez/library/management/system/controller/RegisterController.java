package com.a.alvarez.library.management.system.controller;

import com.a.alvarez.library.management.system.service.RegisterService;
import com.a.alvarez.library.management.system.util.ConsoleImputUtil;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;

@Controller
public class RegisterController {

    private  final RegisterService registerService;

    public RegisterController(RegisterService registerService) {
        this.registerService = registerService;
    }

    public void register(){

        boolean verification = false;

        try{

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

            System.out.println("\n" +
                    "successful registration");

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
            System.out.println("\nPress Enter to return to main menu...");
            ConsoleImputUtil.readString("");
        };

    }

}
