package com.bk.playground.controller.exceptions;

import com.bk.playground.exceptions.ImmigrantNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RequestExceptionController {

    @ExceptionHandler(value = ImmigrantNotFoundException.class)
    public ResponseEntity<Object> exception(ImmigrantNotFoundException exception) {
        return new ResponseEntity<>("Immigrant not found", HttpStatus.NOT_FOUND);
    }
}
