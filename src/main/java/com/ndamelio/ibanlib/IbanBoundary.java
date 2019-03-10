package com.ndamelio.ibanlib;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IbanBoundary {

    private static final Logger LOG = LoggerFactory.getLogger(IbanBoundary.class);

    @GetMapping("/iban/{ibanString}")
    private Object validateIban(@PathVariable String ibanString) {
        LOG.info("Iban Param {}", ibanString);
        Iban iban = new Iban(ibanString);
        LOG.info("Iban -- Country -- {}", iban.getCountryData());
        LOG.info("Iban -- CheckSum -- {}", iban.getChecksum());
        LOG.info("Iban -- BBAN -- {}", iban.getBban());
        LOG.info("Iban -- toString -- {}", iban.toString());
        LOG.info("Iban -- toFormattedString -- {}", iban.toFormattedString());
        LOG.info("Iban -- bankIdentifier -- {}", iban.getBankIdentifier());
        return iban;
    }
}
