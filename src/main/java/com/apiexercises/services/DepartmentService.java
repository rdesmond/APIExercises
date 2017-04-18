package com.apiexercises.services;

import com.apiexercises.mappers.DepartmentMapper;
import com.apiexercises.models.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DepartmentService {

    @Autowired
    DepartmentMapper departmentMapper;

    public ArrayList<Department> getAllDepartments(){
        return departmentMapper.getAllDepartments();
    }
    public Department getDepartmentById(int id){
        return departmentMapper.getDepartmentById(id);
    }
}
