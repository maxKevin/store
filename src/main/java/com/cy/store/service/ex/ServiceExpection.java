package com.cy.store.service.ex;

public class ServiceExpection extends RuntimeException{
    public ServiceExpection() {
        super();
    }

    public ServiceExpection(String message) {
        super(message);
    }

    public ServiceExpection(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceExpection(Throwable cause) {
        super(cause);
    }

    protected ServiceExpection(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
