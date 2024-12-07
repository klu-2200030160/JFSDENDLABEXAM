package com.kelf.jfsd.exam.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExamController {

    @Autowired
    private ExamService examService;

    @GetMapping("/products")
    public Object[] viewAllProducts() {
        return examService.getAllProducts();
    }
}
