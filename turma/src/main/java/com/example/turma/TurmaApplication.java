package com.example.turma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EntityScan(basePackages = {"construcao.common.Models"})
public class TurmaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TurmaApplication.class, args);
	}

}
