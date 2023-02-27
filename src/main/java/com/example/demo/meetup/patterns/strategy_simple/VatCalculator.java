package com.example.demo.meetup.patterns.strategy_simple;

import java.math.BigDecimal;

public interface VatCalculator {

    BigDecimal calculator(UserVATRequest userVATRequest);

    VatPaymentType getType();
}
