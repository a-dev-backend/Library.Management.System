package com.a.alvarez.library.management.system.controller;

import static com.a.alvarez.library.management.system.util.ConsoleImputUtil.readInt;
import static com.a.alvarez.library.management.system.util.ConsoleImputUtil.readString;

public class AccessController {


    private final LoginController  loginController;
    private final RegisterController registerController;

    public AccessController() {
        this.loginController = new LoginController();
        this.registerController = new RegisterController();
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

                    loginController.login();

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
