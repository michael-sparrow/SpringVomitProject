package com.example.myOwnProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
public class MyOwnProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyOwnProjectApplication.class, args);
	}

}
