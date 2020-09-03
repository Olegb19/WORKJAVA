package edu.javacourse.studentorder.exception;

public class TransportExeption extends Exception{
    public TransportExeption() {
    }

    public TransportExeption(String message) {
        super(message);
    }

    public TransportExeption(String message, Throwable cause) {
        super(message, cause);
    }
}
