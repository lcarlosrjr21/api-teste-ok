package com.treasy.apiv2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Apiv2Application {

	public static void main(String[] args) {
		SpringApplication.run(Apiv2Application.class, args);
	}

}

@RestController
class HelloController{
	
	@GetMapping("/")
	String hello() {
		return "Bem vindo a api desenvolvida com spring boot(java), jpa, maven e postgresql --- Teste técnico Luiz Rosa - Treasy";
				
	}
}
