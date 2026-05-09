package com.sandev.studentrecordmanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(StudentNotFound.class)
    public ResponseEntity<Map<String, Object>> handleStudentNotFound(StudentNotFound exception) {
        Map<String, Object> response = new HashMap<>();
        response.put("error", exception.getMessage());
        response.put("status", 404);
        response.put("message", "Invalid Operation");
        response.put("timestamp", LocalDate.now().toString());

        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
