package com.tstp.spring.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoModelApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoModelApplication.class, args).close();

    System.out.println("Let's inspect the beans provided by Spring Boot:");
  }

}
