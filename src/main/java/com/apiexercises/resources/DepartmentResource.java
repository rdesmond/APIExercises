package com.apiexercises.resources;

import com.apiexercises.models.Department;
import com.apiexercises.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping ("/departments")
public class DepartmentResource {

    @Autowired
    DepartmentService departmentService;

    public ArrayList<Department> getAllDepartments(){return departmentService.getAllDepartments();}

    @RequestMapping("/id")
    public Department getDepartmentById(@RequestParam(value="id")int id){return departmentService.getDepartmentById(id);}
}
