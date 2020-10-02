package com.gopal.JokesApp;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class JokesAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(JokesAppApplication.class, args);
 		System.out.println("Version 3.0");
	}

}
