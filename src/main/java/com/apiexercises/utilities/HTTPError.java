package com.apiexercises.utilities;


/**
 * Demonstrates the use of a custom exception
 */
public class HTTPError extends Exception {

    HTTPStatusCode code;
    //NO_CONTENT(204), UNAUTHORIZED(401), NOT_FOUND(404), NOT_ACCEPTABLE(406), TEAPOT(418);


    public HTTPError() {
        //default
    }
    //Constructor that receives a status code
    public HTTPError(HTTPStatusCode code) {
        this.code = code;
    }
}
