package com.a.alvarez.library.management.system;


import com.a.alvarez.library.management.system.controller.AccessController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);

	}

	@Bean
	CommandLineRunner run(AccessController accessController) {
		return args -> {
			accessController.menuMain();
		};
	}


}
