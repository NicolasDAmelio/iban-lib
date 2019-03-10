package com.ndamelio.ibanlib.Exceptions;

/**
 * Indicates that the checksum of an IBAN is incorrect as per the Modulo97 algorithm.
 */
public class InvalidChecksumException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * @param iban
     */
    public InvalidChecksumException(String iban) {
        super(String.format("Checksum validation for IBAN [%s] failed", iban));
    }
}
