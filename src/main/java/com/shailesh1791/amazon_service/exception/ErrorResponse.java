package com.shailesh1791.amazon_service.exception;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ErrorResponse {
    private String error;
    private String message;
    private LocalDateTime timestamp = LocalDateTime.now();
}
