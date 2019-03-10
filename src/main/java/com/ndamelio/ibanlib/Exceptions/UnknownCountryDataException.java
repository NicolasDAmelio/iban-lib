package com.ndamelio.ibanlib.Exceptions;

/**
 * Indicates that the first two digits of an IBAN are invalid.
 */
public class UnknownCountryDataException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    public UnknownCountryDataException(final String countryCode) {
        super("Unsupported/unknown country code: " + countryCode);
    }
}
