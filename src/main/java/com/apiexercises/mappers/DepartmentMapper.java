package com.apiexercises.mappers;

import com.apiexercises.models.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

@Mapper
public interface DepartmentMapper {

    String GET_ALL_DEPARTMENTS = "select * from departments";
    String GET_DEPARTMENT_BY_ID = "select * from departments where id = #{id}";

    @Select(GET_ALL_DEPARTMENTS)
    ArrayList<Department> getAllDepartments();

    @Select(GET_DEPARTMENT_BY_ID)
    Department getDepartmentById(int id);

}
