package com.informatorio.newsapp.exceptions;

import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Data
//@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NewsAppExceptions extends RuntimeException {
    private String message;
    private HttpStatus httpStatus;
    //private static final long serialVersionUID = 1L;


    public NewsAppExceptions(String message, HttpStatus httpStatus) {
        super(message);
        this.message = message;
        this.httpStatus = httpStatus;
    }
}
