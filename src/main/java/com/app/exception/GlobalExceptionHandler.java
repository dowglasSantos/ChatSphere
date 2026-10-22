package com.app.exception;

import com.app.dto.exception.ErrorResponseDTO;
import com.app.exception.authexception.EmailNotFoundException;
import com.app.exception.authexception.PasswordNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(EmailNotFoundException.class)
    private ResponseEntity<ErrorResponseDTO> EmailNotFoundException(EmailNotFoundException e) {
        ErrorResponseDTO error = new ErrorResponseDTO(
                HttpStatus.NOT_FOUND.value(),
                e.getMessage()
        );

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(error);
    }

    @ExceptionHandler(PasswordNotFoundException.class)
    private ResponseEntity<ErrorResponseDTO> passwordNotFoundException(PasswordNotFoundException e) {
        ErrorResponseDTO error = new ErrorResponseDTO(
                HttpStatus.NOT_FOUND.value(),
                e.getMessage()
        );

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(error);
    }
}
