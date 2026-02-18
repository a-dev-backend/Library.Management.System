package com.a.alvarez.library.management.system;

import com.a.alvarez.library.management.system.controller.AccessController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
		AccessController accessController = new AccessController();
		accessController.menuMain();
	}


}
