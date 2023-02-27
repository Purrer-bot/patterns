package com.example.demo.meetup.patterns.strategy_simple;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class FuelVatCalculator implements VatCalculator{


    @Override
    public BigDecimal calculator(UserVATRequest userVATRequest) {
        return userVATRequest.getPaymentAmount().multiply(BigDecimal.valueOf(0.02));
    }

    @Override
    public VatPaymentType getType() {
        return VatPaymentType.FUEL;
    }
}
