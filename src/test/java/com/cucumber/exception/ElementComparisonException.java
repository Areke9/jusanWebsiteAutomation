package com.cucumber.exception;

public class ElementComparisonException extends RuntimeException{
    public ElementComparisonException(){
        super("Element does not match!");
    }
}
