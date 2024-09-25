package dev.tssvett.handler.exception;

public class EntityAlreadyExistsException extends Throwable{

    public EntityAlreadyExistsException(String message) {
        super(message);
    }
}
