package com.apiexercises.models;

import com.apiexercises.utilities.HTTPStatusCode;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Generic class that is used as a return type for methods in the Resource class
 * This allows the HTTP request to return an object, a status, and a message
 * @param <T>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Response<T extends Object> {

    private Object data;
    private HTTPStatusCode status;
    private String message;

    //Method that takes in an HTTPStatusCode and determines the message accordingly.
    public String setMessage(HTTPStatusCode status) {
        switch (status){
            case OK: return "Success";
            case TEAPOT: return "I'm a little teapot, short and stout. There's an error in your URI";
            case NOT_FOUND: return "The requested resource could not be found";
            case NO_CONTENT: return "The server successfully processed the request and is not returning any content";
            case UNAUTHORIZED: return "Authentication is required and has failed or has not yet been provided";
            case NOT_ACCEPTABLE: return "The requested resource is capable of generating only content not " +
                    "acceptable according to the Accept headers sent in the request.";
            default: return null;
        }
    }
    //Constructor used when data is retrieved
    public Response(HTTPStatusCode status, T data) {
        this.status = status;
        this.data = data;
        this.message = setMessage(status);
    }
    //Constructor used when only status and message are needed
    public Response(HTTPStatusCode status){
        this.status = status;
        this.message = setMessage(status);
    }
    public HTTPStatusCode getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public Object getData() {
        return data;
    }
}


