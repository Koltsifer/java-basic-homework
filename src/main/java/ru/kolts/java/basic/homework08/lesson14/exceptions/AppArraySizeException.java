package ru.kolts.java.basic.homework08.lesson14.exceptions;

public class AppArraySizeException extends RuntimeException{
    public AppArraySizeException(String message) {
        super(message);
    }
}