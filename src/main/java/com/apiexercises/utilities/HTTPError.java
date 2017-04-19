package com.apiexercises.utilities;


/**
 * Demonstrates the use of a custom exception
 */
public class HTTPError extends Exception {

    //Not sure what I'm doing with this yet
    // The idea would be to use a try catch in the HTTP requests and use this to return error codes

    HTTPStatusCode code;
    //NO_CONTENT(204), UNAUTHORIZED(401), NOT_FOUND(404), NOT_ACCEPTABLE(406), TEAPOT(418);

}
