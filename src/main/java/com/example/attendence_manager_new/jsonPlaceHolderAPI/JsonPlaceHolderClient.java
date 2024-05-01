package com.example.attendence_manager_new.jsonPlaceHolderAPI;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "jsonlacehoder", url = "https://jsonplaceholder.typicode.com/")
public interface JsonPlaceHolderClient {

    @GetMapping("/posts")
    List<Post> getPosts();

    @GetMapping("posts/{postID}")
    Post getPost(@PathVariable("postID") Integer id);
}
