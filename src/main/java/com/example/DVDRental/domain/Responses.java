package com.example.DVDRental.domain;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMethod;

public class Responses {

    public static final String GENERIC_ERROR_MESSAGE = "An error occurred.";

    public static ResponseEntity ok() {
        return new ResponseEntity(HttpStatus.OK);
    }

    public static ResponseEntity created() {
        return new ResponseEntity(HttpStatus.CREATED);
    }
    public static ResponseEntity notFound() {
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

    public static <T> ResponseEntity<T> ok(T model) {

        return new ResponseEntity<T>(model, HttpStatus.OK);
    }
    public static <T> ResponseEntity<T> created(T model) {

        return new ResponseEntity<T>(model, HttpStatus.CREATED);
    }


    public static <T> ResponseEntity<T> createResponse(RequestMethod requestMethod, T model) {

        return new ResponseEntity<T>(model, HttpStatus.OK);

    }

    public static <T> ResponseEntity<RestResponse> createRestResponse(RequestMethod requestMethod, T model) {

        return new ResponseEntity<RestResponse>(new RestResponse(model), HttpStatus.OK);

    }

    public static <T> ResponseEntity<RestResponse> createRestResponse(RequestMethod requestMethod, HttpStatus httpStatus, T model) {

        return new ResponseEntity<RestResponse>(new RestResponse(model), httpStatus);

    }

    public static <T> ResponseEntity<T> createResponse(RequestMethod requestMethod, HttpStatus httpStatus, T model) {

        return new ResponseEntity<T>(model, httpStatus);

    }

    public static ResponseEntity createGenericErrorMsg(HttpStatus httpStatus) {

        return new ResponseEntity<RestResponse>(new RestResponse(GENERIC_ERROR_MESSAGE), httpStatus);

    }

    public static ResponseEntity createGenericUnauthorized() {

        return new ResponseEntity<RestResponse>(new RestResponse(""), HttpStatus.FORBIDDEN);

    }
}
