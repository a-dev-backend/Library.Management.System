package com.a.alvarez.library.management.system.controller;

import com.a.alvarez.library.management.system.domain.model.User;
import com.a.alvarez.library.management.system.util.ConsoleImputUtil;
import org.springframework.stereotype.Controller;


@Controller
public class MemberMenuController {

    public  void memberMenu(User user){

        System.out.println("###########################################################\n");
        System.out.println("                 LIBRARY MANAGEMENT SYSTEM                 \n");
        System.out.println("                        MEMBER MENU                        \n");
        System.out.println("###########################################################\n");
        System.out.println("1. Search Books\n");
        System.out.println("2.View My Profile\n");
        System.out.println("3.Borrow a Book\n");
        System.out.println("4.View My Loans\n");
        System.out.println("5.Return a Book\n");
        System.out.println("6. Logout\n");
        System.out.println("###########################################################\n");
        int option = ConsoleImputUtil.readInt("*Enter your choice:");







    }
}
