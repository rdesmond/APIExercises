package com.apiexercises.utilities;

/**
 * Demonstrates an enum that can be used for HTTP status codes
 */
public enum HTTPStatusCode {
    OK(200), NO_CONTENT(204), UNAUTHORIZED(401), NOT_FOUND(404), NOT_ACCEPTABLE(406), TEAPOT(418);

    private int code;

    //Constructor
    HTTPStatusCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
