package com.example.estudantes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EntityScan(basePackages = {"construcao.common.Models"})
public class EstudantesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstudantesApplication.class, args);
	}

}
