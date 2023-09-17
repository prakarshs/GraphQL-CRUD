package com.project.GraphqlCRUD.Errors;

import com.project.GraphqlCRUD.Models.ErrorBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ErrorHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler
    private ResponseEntity<ErrorBody> customError(CustomError error){
        return new ResponseEntity<>(ErrorBody.builder()
                .message(error.getMessage())
                .resolution(error.getResolution())
                .build(), HttpStatus.NOT_FOUND );
    }
}
