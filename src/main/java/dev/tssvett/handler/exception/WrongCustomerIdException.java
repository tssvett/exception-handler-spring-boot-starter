package dev.tssvett.handler.exception;

public class WrongCustomerIdException extends Throwable{

    public WrongCustomerIdException(String message) {
        super(message);
    }
}
