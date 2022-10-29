package com.example.vphoto.handler;

import com.example.vphoto.dto.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Developed by Rahmonali Yoqubov
 * Email: rahmonaliyoqubov@gmail.com
 * Date: 24.10.2022
 * Project: v-photo
 */
@ControllerAdvice
public class CustomExceptionHandler {
    @ExceptionHandler({RuntimeException.class})
    public ResponseEntity<ApiResponse> handleAll(RuntimeException e) {
        return new ResponseEntity<>(new ApiResponse(false, e.getMessage()), HttpStatus.BAD_REQUEST);
    }
}
