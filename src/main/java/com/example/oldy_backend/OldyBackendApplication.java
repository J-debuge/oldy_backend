package com.example.oldy_backend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.oldy_backend.mapper")
@SpringBootApplication
public class OldyBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(OldyBackendApplication.class, args);
	}

}
