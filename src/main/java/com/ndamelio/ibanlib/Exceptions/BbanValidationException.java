package com.ndamelio.ibanlib.Exceptions;

/**
 * Exception indicating validation errors of the basic account number
 */
public class BbanValidationException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * Creates a new exception instance
     *
     * @param message
     */
    public BbanValidationException(String message) {
        super(message);
    }
}
