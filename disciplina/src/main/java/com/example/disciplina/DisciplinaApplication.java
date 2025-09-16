package com.example.disciplina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EntityScan(basePackages = {"construcao.common.Models"})
public class DisciplinaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisciplinaApplication.class, args);
	}

}
