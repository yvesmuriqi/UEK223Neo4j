package com.example.uek223neo4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.annotation.EnableNeo4jAuditing;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication
@EnableNeo4jRepositories
public class Uek223neo4jApplication {

	public static void main(String[] args) {
		SpringApplication.run(Uek223neo4jApplication.class, args);
	}

}
