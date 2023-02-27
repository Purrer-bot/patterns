package com.example.demo.meetup.patterns.strategy_simple;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class AnimalSupplyCalculator implements VatCalculator{

    @Override
    public BigDecimal calculator(UserVATRequest userVATRequest) {
        return BigDecimal.ZERO;
    }

    @Override
    public VatPaymentType getType() {
        return VatPaymentType.ANIMAL_SUPPLY;
    }
}
