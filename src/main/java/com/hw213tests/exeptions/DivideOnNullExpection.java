package com.hw213tests.exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus (HttpStatus.BAD_GATEWAY)
public class DivideOnNullExpection extends  RuntimeException{
    public DivideOnNullExpection(String message) {
        super(message);
    }
}
