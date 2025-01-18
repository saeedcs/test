package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CommentService {

    private static final String COMMENTS_API_URL = "https://gorest.co.in/public/v2/comments";

    public String fetchAllComments() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(COMMENTS_API_URL, String.class);
    }
}