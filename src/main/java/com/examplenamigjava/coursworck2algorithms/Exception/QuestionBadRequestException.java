package com.examplenamigjava.coursworck2algorithms.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class QuestionBadRequestException extends RuntimeException {
    public QuestionBadRequestException(String message) {
        super(message);
    }
}