package com.apiexercises.services;

import com.apiexercises.utilities.HTTPError;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
/**
 * Generic interface to be implemented by all Service classes
 * It should be annotated with @Service
 * @param <T>
 */
@Service
public interface ServiceTemplate<T extends Object> {

    //An instance variable of the mapper class should be declared with the @Autowired annotation
    /**
     * This method calls the getAll method on the autowired mapper object
     * @return ArrayList of the object type indicated
     */
    public ArrayList<T> getAll();

    /**
     * This method calls the getById method on the autowired mapper object
     * @param id passed down from the URI through the Resource
     * @return Object that matches the id
     */
    default Object getById(int id){
        return new HTTPError();
    }
    default Object getByIdString(String id){
        return new HTTPError();
    }
}
