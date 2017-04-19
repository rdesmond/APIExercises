package com.apiexercises.utilities;


/**
 * Custom exception to use for API requests
 */
public class HTTPError extends Exception {

    HTTPStatusCode code;
    // Possible types = NO_CONTENT(204), UNAUTHORIZED(401), NOT_FOUND(404), NOT_ACCEPTABLE(406), TEAPOT(418);

    //Constructor that receives a status code
    public HTTPError(HTTPStatusCode code) {
        this.code = code;
    }
}
