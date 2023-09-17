package com.project.GraphqlCRUD;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log4j2
public class GraphqlCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlCrudApplication.class, args);
		log.info("APPLICATION IS RUNNING...");
	}

}
