package com.example. demo. exception;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity <?> hello(MethodArgumentNotValidException ex) {
        Map<String, String> map=new HashMap<>();
        ex.getBlindingResult().getFieldError().forEach(error -> map.put(error.getField(),error.getDefaultMessage()));
        return new ResponseEntity<>(map,HttpStatus.Bad_REQUEST);
    }
    @ExceptionHandler(PasswordhotwatchCri.class)
    public String hi(){
        return "Hi";
           
}
}