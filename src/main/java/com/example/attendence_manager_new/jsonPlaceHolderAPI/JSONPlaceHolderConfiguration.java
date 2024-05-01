package com.example.attendence_manager_new.jsonPlaceHolderAPI;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JSONPlaceHolderConfiguration {
    @Bean("jsonplaceholder")
    CommandLineRunner runner(JsonPlaceHolderClient jsonPlaceHolderClient) {
        return args -> {
            System.out.println("https://jsonplaceholder.typicode.com/posts");
            System.out.println(jsonPlaceHolderClient.getPosts().size());
            System.out.println();
            System.out.println("https://jsonplaceholder.typicode.com/posts/1");
            System.out.println(jsonPlaceHolderClient.getPost(1));
        };
    }
}
