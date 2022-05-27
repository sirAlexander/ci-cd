package com.shikanga.classictodo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@Controller
public class FrontendClassicTodoApplication {

    @Value("${backend.url}")
    String endpoint;
    RestTemplate template = new RestTemplate();


    @PostConstruct
    public void postConstruct(){

        System.out.println(" UI initialized for backend at " + endpoint);
    }


    public static void main(String[] args) {
        SpringApplication.run(FrontendClassicTodoApplication.class, args);
    }

}
