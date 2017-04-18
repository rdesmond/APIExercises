package com.apiexercises.resources;

import com.apiexercises.services.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/salaries")
public class SalaryResource {

    @Autowired
    SalaryService salaryService;
}
