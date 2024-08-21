package ru.kolts.java.basic.homework8.lesson14.exceptions;

public class AppArraySizeException extends RuntimeException{
    public AppArraySizeException(String message) {
        super(message);
    }
}