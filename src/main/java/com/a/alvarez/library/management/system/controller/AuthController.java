package com.a.alvarez.library.management.system.controller;

import com.a.alvarez.library.management.system.domain.enums.Role;
import com.a.alvarez.library.management.system.domain.model.User;
import com.a.alvarez.library.management.system.service.AuthService;
import com.a.alvarez.library.management.system.util.ConsoleImputUtil;
import org.springframework.stereotype.Controller;

@Controller
public class AuthController {

    private final AuthService authService;
    private final MemberMenuController memberMenuController;
    private final AdminMenuController adminMenuController;

    public AuthController(AuthService authService, MemberMenuController memberMenuController, AdminMenuController adminMenuController) {
        this.authService = authService;
        this.memberMenuController = memberMenuController;
        this.adminMenuController = adminMenuController;
    }

    public void login() {

        try {

            System.out.println("---------------------------------------------------------");
            System.out.println("                        LOG IN");
            System.out.println("---------------------------------------------------------");

            System.out.println("Please enter your credentials.\n");

            String userName = ConsoleImputUtil.readString("|#| Username: ");
            String password = ConsoleImputUtil.readString("|#| Password: ");

            User user = authService.authenticate(userName, password);

            System.out.println("\nAuthentication successful.");
            System.out.println("Welcome " + user.getIdentity().getFirstName());

            if(user.getRole() == Role.ADMIN){

                adminMenuController.adminMenu(user);

            }
            if (user.getRole() == Role.MEMBER){

                memberMenuController.memberMenu(user);


            }


            return;

        } catch (Exception e) {

            System.out.println("\nAuthentication error: " + e.getMessage());

        }

        System.out.println("\nPress Enter to return to main menu...");
        ConsoleImputUtil.readString("");

    }
}
