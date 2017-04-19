package com.apiexercises.mappers;

import com.apiexercises.models.Salary;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.ArrayList;
/**
 * Executes SQL queries for Salary
 */
@Mapper
public interface SalaryMapper extends MapperTemplate{

    //SQL queries
    String GET_ALL = "select * from salaries";
    String GET_BY_ID = "select * from salaries where emp_no = #{id}";

    //returns an array list of all salaries
    @Select(GET_ALL)
    @Override
    ArrayList<Salary> getAll();

    //returns the Salary that matches the id passed down from the URI through the Resource and Service
    @Select(GET_BY_ID)
    @Override
    ArrayList<Salary> getById(int id);
}
