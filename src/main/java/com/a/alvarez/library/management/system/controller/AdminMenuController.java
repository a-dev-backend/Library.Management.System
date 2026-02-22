package com.a.alvarez.library.management.system.controller;

import com.a.alvarez.library.management.system.domain.model.User;
import com.a.alvarez.library.management.system.util.ConsoleImputUtil;
import org.springframework.stereotype.Controller;

@Controller
public class AdminMenuController {

        public void adminMenu(User user){

                System.out.println ("###########################################################\n");
                System.out.println("                 LIBRARY MANAGEMENT SYSTEM                 \n");
                System.out.println("                        ADMIN MENU                        \n");
                System.out.println("###########################################################\n");
                System.out.println("1.Manage Books\n");
                System.out.println("2.Manage Members\n");
                System.out.println("3.Manage Loans\n");
                System.out.println("4.View My Profile\n");
                System.out.println("5.Logout\n");
                System.out.println("###########################################################\n");
                int option = ConsoleImputUtil.readInt("*Enter your choice:");

        }

}
