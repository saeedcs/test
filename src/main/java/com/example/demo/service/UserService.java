package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    private static final String USERS_API_URL = "https://gorest.co.in/public/v2/users";

    public String fetchAllUsers() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(USERS_API_URL, String.class);
    }
}
