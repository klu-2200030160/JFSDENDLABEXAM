package com.kelf.jfsd.exam.exam;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ExamService {

    private final String API_URL = "https://fakestoreapi.com/products";

    public Object[] getAllProducts() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(API_URL, Object[].class);
    }
}
