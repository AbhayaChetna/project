package com.example.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectApplication {

    public static void main(String[] args) {
        //This function creates the application context
        //It scans for beans using component scan
        //Employee controller is a bean
        //It scans for beans in current packages and sub packages but not in super packages
        SpringApplication.run(ProjectApplication.class, args);
    }

}
