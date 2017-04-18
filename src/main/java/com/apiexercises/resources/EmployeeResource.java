package com.apiexercises.resources;

import com.apiexercises.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/employees")
public class EmployeeResource {

    @Autowired
    EmployeeService employeeService;
}
