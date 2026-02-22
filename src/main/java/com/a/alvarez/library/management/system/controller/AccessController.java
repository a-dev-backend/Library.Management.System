package com.a.alvarez.library.management.system.controller;

import org.springframework.stereotype.Controller;

import static com.a.alvarez.library.management.system.util.ConsoleImputUtil.readInt;
import static com.a.alvarez.library.management.system.util.ConsoleImputUtil.readString;
@Controller
public class AccessController {


    private final AuthController authController ;
    private final RegisterController registerController;


    public AccessController(AuthController authController, RegisterController registerController) {
        this.authController = authController;
        this.registerController = registerController;
    }



    public void menuMain(){

        int option = 0;
        do {

            System.out.println("----------------------------------------------\n");
            System.out.println("----------------------------------------------\n");


            System.out.println("            WELCOME LIBRARY SYSTEM\n");

            System.out.println("|1|Log in\n");
            System.out.println("|2|Register\n");
            System.out.println("|3|Exit\n");



            System.out.println("----------------------------------------------\n");
            System.out.println("----------------------------------------------\n");

            option = readInt("Enter selected option: ");

            switch (option){

                case 1 :

                    authController.login();

                    break;
                case 2 :

                    registerController.register();

                    break;

                case 3:
                    String message1 = readString("Exiting the system...\n" +
                            "Thank you for using the Library Management System.\n" +
                            "Goodbye!");

                    break;

                default:

                    String message2 = readString("Incorrect options");
            }

        }while(option!=3);

    }



}
