package com.example.demo.meetup.patterns.strategy_simple.refactor;

import com.example.demo.meetup.patterns.strategy_simple.UserVATRequest;
import com.example.demo.meetup.patterns.strategy_simple.VatPaymentType;

import java.math.BigDecimal;

public interface VatCalculator {

    BigDecimal calculator(UserVATRequest userVATRequest);

    VatPaymentType getType();
}
