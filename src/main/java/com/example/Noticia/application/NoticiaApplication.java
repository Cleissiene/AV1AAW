package com.example.Noticia.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = {"com.example"})
@EnableMongoRepositories("com.example.Noticia.repository")
public class NoticiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(NoticiaApplication.class, args);
	}

}
