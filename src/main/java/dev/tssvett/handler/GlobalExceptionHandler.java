package dev.tssvett.handler;

import dev.tssvett.handler.ErrorDetails;
import dev.tssvett.handler.exception.*;
import jakarta.validation.ConstraintViolationException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDetails> handleGlobalException(Exception e) {
        ErrorDetails errorDetails = ErrorDetails.builder()
                .exceptionName(e.getClass().getSimpleName())
                .exceptionClass(e.getStackTrace()[0].getClassName())
                .exceptionMessage(List.of(e.getMessage()))
                .exceptionTime(LocalDateTime.now())
                .build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorDetails);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorDetails> handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        ErrorDetails errorDetails = ErrorDetails.builder()
                .exceptionName(e.getClass().getSimpleName())
                .exceptionClass(e.getStackTrace()[0].getClassName())
                .exceptionMessage(e.getBindingResult().getFieldErrors().stream()
                        .map(fieldError -> "Field '" + fieldError.getField() + "': " + fieldError.getDefaultMessage()).toList())
                .exceptionTime(LocalDateTime.now())
                .build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorDetails);
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<ErrorDetails> handleConstraintViolationException(ConstraintViolationException e) {
        ErrorDetails errorDetails = ErrorDetails.builder()
                .exceptionName(e.getClass().getSimpleName())
                .exceptionClass(e.getStackTrace()[0].getClassName())
                .exceptionMessage(List.of(e.getMessage()))
                .exceptionTime(LocalDateTime.now())
                .build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorDetails);
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<ErrorDetails> handleMethodArgumentTypeMismatchException(MethodArgumentTypeMismatchException e) {
        ErrorDetails errorDetails = ErrorDetails.builder()
                .exceptionName(e.getClass().getSimpleName())
                .exceptionClass(e.getStackTrace()[0].getClassName())
                .exceptionMessage(List.of(e.getMessage()))
                .exceptionTime(LocalDateTime.now())
                .build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorDetails);
    }

    @ExceptionHandler(EntityNotFoundException.class)
    protected ResponseEntity<ErrorDetails> handleEntityNotFoundException(EntityNotFoundException e) {
        ErrorDetails errorDetails = ErrorDetails.builder()
                .exceptionName(e.getClass().getSimpleName())
                .exceptionClass(e.getStackTrace()[0].getClassName())
                .exceptionMessage(List.of(e.getMessage()))
                .exceptionTime(LocalDateTime.now())
                .build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorDetails);
    }

    @ExceptionHandler(EntityAlreadyExistsException.class)
    protected ResponseEntity<ErrorDetails> handleEntityAlreadyExistsException(EntityAlreadyExistsException e) {
        ErrorDetails errorDetails = ErrorDetails.builder()
                .exceptionName(e.getClass().getSimpleName())
                .exceptionClass(e.getStackTrace()[0].getClassName())
                .exceptionMessage(List.of(e.getMessage()))
                .exceptionTime(LocalDateTime.now())
                .build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorDetails);
    }

    @ExceptionHandler(EmptyProductException.class)
    protected ResponseEntity<ErrorDetails> handleEmptyProductException(EmptyProductException e) {
        ErrorDetails errorDetails = ErrorDetails.builder()
                .exceptionName(e.getClass().getSimpleName())
                .exceptionClass(e.getStackTrace()[0].getClassName())
                .exceptionMessage(List.of(e.getMessage()))
                .exceptionTime(LocalDateTime.now())
                .build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorDetails);
    }

    @ExceptionHandler(NotFoundByIdException.class)
    protected ResponseEntity<ErrorDetails> handleNotFoundByIdException(NotFoundByIdException e) {
        ErrorDetails errorDetails = ErrorDetails.builder()
                .exceptionName(e.getClass().getSimpleName())
                .exceptionClass(e.getStackTrace()[0].getClassName())
                .exceptionMessage(List.of(e.getMessage()))
                .exceptionTime(LocalDateTime.now())
                .build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorDetails);
    }

    @ExceptionHandler(NotFoundByArticleException.class)
    protected ResponseEntity<ErrorDetails> handleNotFoundByArticleException(NotFoundByArticleException e) {
        ErrorDetails errorDetails = ErrorDetails.builder()
                .exceptionName(e.getClass().getSimpleName())
                .exceptionClass(e.getStackTrace()[0].getClassName())
                .exceptionMessage(List.of(e.getMessage()))
                .exceptionTime(LocalDateTime.now())
                .build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorDetails);
    }

    @ExceptionHandler(SQLUniqueException.class)
    protected ResponseEntity<ErrorDetails> handleSQLUniqueException(SQLUniqueException e) {
        ErrorDetails errorDetails = ErrorDetails.builder()
                .exceptionName(e.getClass().getSimpleName())
                .exceptionClass(e.getStackTrace()[0].getClassName())
                .exceptionMessage(List.of(e.getMessage()))
                .exceptionTime(LocalDateTime.now())
                .build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorDetails);
    }


    @ExceptionHandler(NotEnoughProductsException.class)
    protected ResponseEntity<ErrorDetails> handleNotEnoughProductsException(NotEnoughProductsException e) {
        ErrorDetails errorDetails = ErrorDetails.builder()
                .exceptionName(e.getClass().getSimpleName())
                .exceptionClass(e.getStackTrace()[0].getClassName())
                .exceptionMessage(List.of(e.getMessage()))
                .exceptionTime(LocalDateTime.now())
                .build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorDetails);
    }

    @ExceptionHandler(CustomerIdNullException.class)
    protected ResponseEntity<ErrorDetails> handleCustomerIdNullException(CustomerIdNullException e) {
        ErrorDetails errorDetails = ErrorDetails.builder()
                .exceptionName(e.getClass().getSimpleName())
                .exceptionClass(e.getStackTrace()[0].getClassName())
                .exceptionMessage(List.of(e.getMessage()))
                .exceptionTime(LocalDateTime.now())
                .build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorDetails);
    }

    @ExceptionHandler(UnavailableProductException.class)
    protected ResponseEntity<ErrorDetails> handleUnavailableProductException(UnavailableProductException e) {
        ErrorDetails errorDetails = ErrorDetails.builder()
                .exceptionName(e.getClass().getSimpleName())
                .exceptionClass(e.getStackTrace()[0].getClassName())
                .exceptionMessage(List.of(e.getMessage()))
                .exceptionTime(LocalDateTime.now())
                .build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorDetails);
    }

    @ExceptionHandler(UpdateOrderException.class)
    protected ResponseEntity<ErrorDetails> handleUpdateOrderException(UpdateOrderException e) {
        ErrorDetails errorDetails = ErrorDetails.builder()
                .exceptionName(e.getClass().getSimpleName())
                .exceptionClass(e.getStackTrace()[0].getClassName())
                .exceptionMessage(List.of(e.getMessage()))
                .exceptionTime(LocalDateTime.now())
                .build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorDetails);
    }

    @ExceptionHandler(WrongCustomerIdException.class)
    protected ResponseEntity<ErrorDetails> handleWrongCustomerIdException(WrongCustomerIdException e) {
        ErrorDetails errorDetails = ErrorDetails.builder()
                .exceptionName(e.getClass().getSimpleName())
                .exceptionClass(e.getStackTrace()[0].getClassName())
                .exceptionMessage(List.of(e.getMessage()))
                .exceptionTime(LocalDateTime.now())
                .build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorDetails);
    }


}
