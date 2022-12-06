package ru.netology.task1.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.netology.task1.exception.InvalidCredentials;
import ru.netology.task1.exception.UnauthorizedUser;

@RestControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(InvalidCredentials.class)
    public ResponseEntity<String> icHandler(InvalidCredentials e) {
        return new ResponseEntity<>("InvalidCredentials Exception", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(UnauthorizedUser.class)
    public ResponseEntity<String> icHandler(UnauthorizedUser e) {
        return new ResponseEntity<>("UnauthorizedUser Exception", HttpStatus.UNAUTHORIZED);
    }
}
