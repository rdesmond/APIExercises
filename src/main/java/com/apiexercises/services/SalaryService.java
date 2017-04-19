package com.apiexercises.services;

import com.apiexercises.mappers.SalaryMapper;
import com.apiexercises.models.Salary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
/**
 * Contains any business logic and calls the mapper methods for Salary
 */
@Service
public class SalaryService implements ServiceTemplate{

    //Uses Spring to control the creation of a mapper object
    @Autowired
    private SalaryMapper mapper;

    //calls the mapper method to return an array list of all Salaries
    public ArrayList<Salary> getAll(){
        return mapper.getAll();
    }

    //calls the mapper method to return the Salary that matches the id passed down from the URI through the Resource
    public Salary getById(int id){
        return mapper.getById(id);
    }
}
