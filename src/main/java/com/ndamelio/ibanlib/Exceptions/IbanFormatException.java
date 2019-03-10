package com.ndamelio.ibanlib.Exceptions;

/**
 *
 */
public class IbanFormatException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * Creates a new exception instance
     *
     * @param message huma-readable exception message
     */
    public IbanFormatException(String message) {
        super(message);
    }
}
