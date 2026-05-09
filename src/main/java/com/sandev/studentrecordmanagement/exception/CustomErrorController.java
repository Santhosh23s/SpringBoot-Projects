package com.sandev.studentrecordmanagement.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.webmvc.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@RestController
public class CustomErrorController  implements ErrorController {
    @RequestMapping("/error")
    public ResponseEntity<Map<String, Object>> error(HttpServletRequest request) {
        Map<String, Object> response = new HashMap<>();
        String originalPath =
                (String) request.getAttribute(
                        "jakarta.servlet.error.request_uri"
                );
        response.put("error", "Invalid API request");
        response.put("message", "not a valid url");
        response.put("path", originalPath);
        response.put("timestamp", LocalDate.now().toString());
        response.put("status", 404);
        return new  ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
