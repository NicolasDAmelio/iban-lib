package com.ndamelio.ibanlib;

import com.ndamelio.ibanlib.Exceptions.UnknownCountryDataException;

/**
 * IBAN Registry
 *
 * This registry provides detailed information about all ISO 13616-compliant national IBAN formats
 *
 * <p>
 * Release 81 - December 2018
 * IBAN Registry, see https://www.swift.com/standards/data-standards/iban
 * </p>
 *
 * @author Nicolas D'Amelio
 */
public enum CountryData {

    AD(false, "Andorra", 20, "\\d{4}", "\\d{4}", "\\w{12}"),
    AE(false, "United Arab Emirates", 19, "\\d{3}", "\\d{16}"),
    AL(false, "Albania", 24, "\\d{8}", "\\w{16}"), // the spec is unclear about the bank and branch IDs - states 8 as total length, but the spec only notes 7 digits total for these two (Bank: 1-3, Branch: 4-7). We assume the last digit is some sort of check digit, but it's not properly specified - so until that's clear, we can't support separate IDs
    AT(true, "Austria", 16, "\\d{5}", "\\d{11}"),
    AZ(false, "Azerbaijan", 24, "[A-Z]{4}", "\\w{20}"),
    BA(false, "Bosnia", 16, "\\d{3}", "\\d{3}", "\\d{8}\\d{2}"),
    BE(true, "Belgium", 12, "\\d{3}", "\\d{7}\\d{2}"),
    BG(true, "Bulgaria", 18, "[A-Z]{4}", "\\d{4}", "\\d{2}\\w{8}"),
    BH(false, "Bahrain", 18, "[A-Z]{4}", "\\w{14}"),
    BR(false, "Brazil", 25, "\\d{8}", "\\d{5}", "\\d{10}[A-Z]\\w"),
    BY(false, "Belarus", 24, "\\w{4}", "\\d{4}\\w{16}"),
    CH(true, "Switzerland", 17, "\\d{5}", "\\w{12}"),
    CR(false, "Costa Rica", 18, "\\d{4}", "\\d{14}"),
    CY(true, "Cyprus", 24, "\\d{3}", "\\d{5}", "\\w{16}"),
    CZ(true, "Czech Republic", 20, "\\d{4}", "\\d{6}\\d{10}"),
    DE(true, "Germany", 18, "\\d{8}", "\\d{10}"),
    DK(true, "Denmark", 14, "\\d{4}", "\\d{9}\\d{1}"),
    DO(false, "Dominican Republic", 24, "\\w{4}", "\\d{20}"),
    EE(true, "Estonia", 16, "\\d{2}", "\\d{2}\\d{11}\\d"),
    ES(true, "Spain", 20, "\\d{4}", "\\d{4}", "\\d\\d\\d{10}"),
    FI(true, "Finland", 14, "\\d{3}", "\\d{11}"),
    FO(false, "Faroe Islands", 14, "\\d{4}", "\\d{9}\\d"),
    FR(true, "France", 23, "\\d{5}", "\\d{5}\\w{11}\\d{2}"),
    GB(true, "United Kingdom", 18, "[A-Z]{4}", "\\d{6}", "\\d{8}"),
    GE(false, "Georgia", 18, "[A-Z]{2}", "\\d{16}"),
    GI(true, "Gibraltar", 19, "[A-Z]{4}", "\\w{15}"),
    GL(false, "Greenland", 14, "\\d{4}", "\\d{9}\\d"),
    GR(true, "Greece", 23, "\\d{3}", "\\d{4}", "\\w{16}"),
    GT(false, "Guatemala", 24, "\\w{4}", "\\w{20}"),
    HR(true, "Croatia", 17, "\\d{7}", "\\d{10}"),
    HU(true, "Hungary", 24, "\\d{3}", "\\d{4}", "\\d\\d{15}\\d"),
    IE(true, "Ireland", 18, "[A-Z]{4}", "\\d{6}", "\\d{8}"),
    IL(false, "Israel", 19, "\\d{3}", "\\d{3}", "\\d{13}"),
    IQ(false, "Iraq", 19, "[A-Z]{4}", "\\d{3}", "\\d{12}"),
    IS(true, "Iceland", 22, "\\d{2}", "\\d{2}", "\\d{2}\\d{6}\\d{10}"),
    IT(true, "Italy", 23, "[A-Z]", "\\d{5}", "\\d{5}", "\\w{12}"),
    JO(false, "Jordan", 26, "[A-Z]{4}", "\\d{4}\\w{18}"),
    KW(false, "Kuwait", 26, "[A-Z]{4}", "\\w{22}"),
    KZ(false, "Kazakhstan", 16, "\\d{3}", "\\w{13}"),
    LB(false, "Lebanon", 24, "\\d{4}", "\\w{20}"),
    LC(false, "Saint Lucia", 28, "[A-Z]{4}", "\\w{24}"),
    LI(true, "Liechtenstein", 17, "\\d{5}", "\\w{12}"),
    LT(true, "Lithuania", 16, "\\d{5}", "\\d{11}"),
    LU(true, "Luxembourg", 16, "\\d{3}", "\\w{13}"),
    LV(true, "Latvia", 17, "[A-Z]{4}", "\\w{13}"),
    MC(true, "Monaco", 23, "\\d{5}", "\\d{5}", "\\w{11}\\d{2}"),
    MD(false, "Moldova", 20, "\\w{2}", "\\w{18}"),
    ME(false, "Montenegro", 18, "\\d{3}", "\\d{13}\\d{2}"),
    MK(false, "Macedonia", 15, "\\d{3}", "\\w{10}\\d{2}"),
    MR(false, "Mauritania", 23, "\\d{5}", "\\d{5}", "\\d{11}\\d{2}"),
    MT(true, "Malta", 27, "[A-Z]{4}", "\\d{5}", "\\w{18}"),
    MU(false, "Mauritius", 26, "[A-Z]{4}\\d{2}", "\\d{2}", "\\d{12}\\d{3}\\w{3}"),
    NL(true, "Netherlands", 14, "[A-Z]{4}", "\\d{10}"),
    NO(true, "Norway", 11, "\\d{4}", "\\d{6}\\d"),
    PK(false, "Pakistan", 20, "[A-Z]{4}", "\\w{16}"),
    PL(true, "Poland", 24, "\\d{8}", "\\d{16}"),
    PS(false, "Palestine", 25, "[A-Z]{4}", "\\w{21}"),
    PT(true, "Portugal", 21, "\\d{4}", "\\d{4}\\d{11}\\d{2}"),
    QA(false, "Qatar", 25, "[A-Z]{4}", "\\w{21}"),
    RO(true, "Romania", 20, "[A-Z]{4}", "\\w{16}"),
    RS(false, "Serbia", 18, "\\d{3}", "\\d{13}\\d{2}"),
    SA(false, "Saudi Arabia", 20, "\\d{2}", "\\w{18}"),
    SC(false, "Seychelles", 27, "[A-Z]{4}\\d{2}", "\\d{2}", "\\d{16}[A-Z]{3}"),
    SE(true, "Sweden", 20, "\\d{3}", "\\d{16}\\d"),
    SI(true, "Slovenia", 15, "\\d{5}", "\\d{8}\\d{2}"),
    SK(true, "Slovakia", 20, "\\d{4}", "\\d{6}\\d{10}"),
    SM(true, "San Marino", 23, "[A-Z]", "\\d{5}", "\\d{5}", "\\w{12}"),
    ST(false, "Sao Tome and Principe", 21, "\\d{4}", "\\d{4}", "\\d{11}\\d{2}"),
    SV(false, "El Salvador", 24, "[A-Z]{4}", "\\d{20}"),
    TL(false, "East Timor", 19, "\\d{3}", "\\d{14}\\d{2}"),
    TN(false, "Tunisia", 20, "\\d{2}", "\\d{3}", "\\d{13}\\d{2}"),
    TR(false, "Turkey", 22, "\\d{5}", "\\d\\w{16}"),
    UA(false, "Ukraine", 25, "\\d{6}", "\\w{19}"),
    VA(false, "Vatican City", 18, "\\d{3}", "\\d{15}"),
    VG(false, "Virgin", 20, "[A-Z]{4}", "\\d{16}"),
    XK(false, "Kosovo", 16, "\\d{2}", "\\d{2}", "\\d{10}\\d{2}");

    /** Common IBAN check digits pattern. */
    private static final String CHECK_DIGITS_PATTERN = "\\d{2}";

    /** Country-specific BBAN length. */
    private int bbanLength;

    /** Regular Expression of the BBAN pattern for this country code. */
    private String bbanPattern;

    /** Regular Expression of the IBAN pattern for this country code. */
    private String ibanPattern;

    /** Optional BBAN prefix pattern (e.g. checksum in Italy). */
    private String bbanPrefixPattern;

    /** Bank identifier pattern. */
    private String bankIdentifierPattern;

    /** Optional branch identifier pattern. */
    private String branchIdentifierPattern;

    /** Account number pattern for this country code. */
    private String accountNumberPattern;

    /** Country name. */
    private String countryName;

    /** SEPA Country */
    private boolean isSepaCountry;

    /**
     * @param bbanLength
     * @param bankIdentifierPattern
     * @param accountNumberPattern
     */
    private CountryData(boolean isSepaCountry, String countryName, int bbanLength, String bankIdentifierPattern, String accountNumberPattern) {
        this(isSepaCountry, countryName, bbanLength, bankIdentifierPattern, null, accountNumberPattern);
    }

    /**
     * @param bbanLength
     * @param bankIdentifierPattern
     * @param branchIdentifierPattern
     * @param accountNumberPattern
     */
    private CountryData(boolean isSepaCountry, String countryName, int bbanLength, String bankIdentifierPattern, String branchIdentifierPattern,
                        String accountNumberPattern) {
        this(isSepaCountry, countryName, bbanLength, null, bankIdentifierPattern, branchIdentifierPattern, accountNumberPattern);
    }

    /**
     * @param bbanLength
     * @param bbanPrefixPattern
     * @param bankIdentifierPattern
     * @param branchIdentifierPattern
     * @param accountNumberPattern
     */
    private CountryData(boolean isSepaCountry, String countryName, int bbanLength, String bbanPrefixPattern, String bankIdentifierPattern, String branchIdentifierPattern,
                        String accountNumberPattern) {
        this.isSepaCountry = isSepaCountry;
        this.countryName = countryName;
        this.bbanLength = bbanLength;
        this.bbanPrefixPattern = bbanPrefixPattern;
        this.bankIdentifierPattern = bankIdentifierPattern;
        this.branchIdentifierPattern = branchIdentifierPattern;
        this.accountNumberPattern = accountNumberPattern;

        final StringBuilder sb = new StringBuilder();
        if (bbanPrefixPattern != null) {
            sb.append(bbanPrefixPattern);
        }

        sb.append(bankIdentifierPattern);

        if (branchIdentifierPattern != null) {
            sb.append(branchIdentifierPattern);
        }

        sb.append(accountNumberPattern);

        this.bbanPattern = sb.toString();
        this.ibanPattern = name() + CHECK_DIGITS_PATTERN + bbanPattern;
    }

    public int getBbanLength() {
        return bbanLength;
    }

    public String getBbanPattern() {
        return bbanPattern;
    }

    public String getIbanPattern() {
        return ibanPattern;
    }

    public String getBbanPrefixPattern() {
        return bbanPrefixPattern;
    }

    public boolean hasBbanPrefix() {
        return bbanPrefixPattern != null;
    }

    public String getBankIdentifierPattern() {
        return bankIdentifierPattern;
    }

    public String getBranchIdentifierPattern() {
        return branchIdentifierPattern;
    }

    public boolean hasBranchIdentifier() {
        return branchIdentifierPattern != null;
    }

    public String getAccountNumberPattern() {
        return accountNumberPattern;
    }

    public String getCountryName() {
        return countryName;
    }

    public boolean isSepaCountry() {
        return isSepaCountry;
    }

    public static CountryData fromString(String cc) {
        try {
            return valueOf(cc);
        } catch (IllegalArgumentException e) {
            throw new UnknownCountryDataException(cc);
        }
    }
}
