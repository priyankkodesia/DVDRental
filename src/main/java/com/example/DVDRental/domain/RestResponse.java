package com.example.DVDRental.domain;

public class RestResponse<T> {

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    T content;
    public RestResponse( T content ) {
        this.content = content;
    }

}
