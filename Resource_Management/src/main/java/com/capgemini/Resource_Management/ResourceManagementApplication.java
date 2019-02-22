package com.capgemini.Resource_Management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

@EntityScan(basePackages = {"com.capgemini.Resource_Management.model"})
@EnableJpaRepositories(basePackages = {"com.capgemini.Resource_Management.repository"})
public class ResourceManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResourceManagementApplication.class, args);
		System.out.println("i am in application");
	}

}
