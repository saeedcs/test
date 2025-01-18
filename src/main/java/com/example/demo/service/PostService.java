package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PostService {

    private static final String POSTS_API_URL = "https://gorest.co.in/public/v2/posts";

    public String fetchAllPosts() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(POSTS_API_URL, String.class);
    }
}
