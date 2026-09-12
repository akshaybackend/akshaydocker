package com.javabackend.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerExmpleApplication {

    @GetMapping("/hello")
    public String message(){
        return "Hello from docker now changes";
    }

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerExmpleApplication.class, args);
	}

}
