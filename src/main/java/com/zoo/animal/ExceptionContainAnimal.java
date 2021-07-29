package com.zoo.animal;

public class ExceptionContainAnimal extends Exception{
    public ExceptionContainAnimal() {
    }

    public ExceptionContainAnimal(String message) {
        super(message);
    }

    public ExceptionContainAnimal(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionContainAnimal(Throwable cause) {
        super(cause);
    }

    public ExceptionContainAnimal(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    @Override
    public String toString() {
        return "ExceptionContainAnimal{}";
    }
}
