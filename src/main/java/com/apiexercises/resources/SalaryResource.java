package com.apiexercises.resources;

import com.apiexercises.models.Response;
import com.apiexercises.models.Salary;
import com.apiexercises.services.SalaryService;
import com.apiexercises.utilities.HTTPStatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
/**
 * Maps the URI to a method that calls the Service methods and returns a Response object with a status code, message,
 * and requested data
 */
@RestController
@RequestMapping("/salaries")
public class SalaryResource extends ResourceTemplate{

    //Uses Spring to control the creation of a service object
    @Autowired
    private SalaryService service;

    //calls the service method and assigns the returned ArrayList to the data parameter in the Response controller
    @Override
    @RequestMapping("/")
    public Response getAll() {
        ArrayList<Salary> salaries = service.getAll();

        if (salaries.size() == 0) {
            return new Response(HTTPStatusCode.NO_CONTENT);
        } else {
            return new Response(HTTPStatusCode.OK, salaries);
        }
    }

    //calls the service method and assigns the returned object to the data parameter in the Response controller
    @RequestMapping("/{id}")
    @Override
    public Response getById(@PathVariable(value="id")int id) {
        ArrayList<Salary> salary = service.getById(id);

        //add in some if statements with errors
        return new Response(HTTPStatusCode.OK, salary);
    }
}

