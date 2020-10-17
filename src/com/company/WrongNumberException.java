package com.company;

public class WrongNumberException extends Exception {
    @Override
    public String toString() {
        return ("Please enter numbers 1-10 or I-X.");
    }
}
