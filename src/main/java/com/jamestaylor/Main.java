package com.jamestaylor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Persistence;

@SpringBootApplication
@EnableJpaRepositories(basePackages="com.jamestaylor", entityManagerFactoryRef="emf")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
