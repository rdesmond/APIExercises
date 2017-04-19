package com.apiexercises.mappers;

import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
/**
 * Generic interface to be extended by all Mapper interfaces
 * It should be annotated with @Mapper
 * @param <T>
 */
@Mapper
public interface MapperTemplate<T extends Object> {

    //Instance variables should be set with SQL queries
    /**
     * This method will be annotated with @Select which takes a String containing a SQL query as a parameter
     * @return : ArrayList of the object type indicated
     */
    ArrayList<T> getAll();

    /**
     * * This method will be annotated with @Select which takes a String containing a SQL query as a parameter
     * @param id passed down from the URI through the Resource and Service
     * @return Object that matches the id
     */
    Object getById(int id);
}
