package com.apiexercises.mappers;

import com.apiexercises.utilities.HTTPError;
import com.apiexercises.utilities.HTTPStatusCode;
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
     *
     * @return : ArrayList of the object type indicated
     */
    ArrayList<T> getAll();

    /**
     * * This method will be annotated with @Select which takes a String containing a SQL query as a parameter
     *
     * @param id passed down from the URI through the Resource and Service
     * @return HTTPError Exception - These methods are overridden in the implementation, based on String vs int id
     */
    default Object getById(int id) {
        return new HTTPError(HTTPStatusCode.TEAPOT);
    }

    default Object getByIdString(String id) {
        return new HTTPError(HTTPStatusCode.TEAPOT);
    }

    /**
     * This method will be annotated with @Select which takes a String containing a SQL query as a parameter
     *
     * @param id
     */
    default void deleteById(int id) {}
    default void deleteByIdString(String id) {}
}
