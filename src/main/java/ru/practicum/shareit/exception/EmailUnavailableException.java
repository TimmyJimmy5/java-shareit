package ru.practicum.shareit.exception;

public class EmailUnavailableException extends RuntimeException {
    public EmailUnavailableException(String message) {
        super(message);
    }
}
