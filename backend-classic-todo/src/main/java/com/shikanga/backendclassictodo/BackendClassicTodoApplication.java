package com.shikanga.backendclassictodo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BackendClassicTodoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendClassicTodoApplication.class, args);
    }

}
