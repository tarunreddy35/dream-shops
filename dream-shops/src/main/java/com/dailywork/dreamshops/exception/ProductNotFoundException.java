package com.dailywork.dreamshops.exception;

@SuppressWarnings("serial")
public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String message) {
        super(message);
    }
}
