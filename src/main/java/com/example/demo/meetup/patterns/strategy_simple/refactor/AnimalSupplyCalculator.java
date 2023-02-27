package com.example.demo.meetup.patterns.strategy_simple.refactor;

import com.example.demo.meetup.patterns.strategy_simple.UserVATRequest;
import com.example.demo.meetup.patterns.strategy_simple.VatPaymentType;
import com.example.demo.meetup.patterns.strategy_simple.refactor.VatCalculator;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class AnimalSupplyCalculator implements VatCalculator {

    @Override
    public BigDecimal calculator(UserVATRequest userVATRequest) {
        return BigDecimal.ZERO;
    }

    @Override
    public VatPaymentType getType() {
        return VatPaymentType.ANIMAL_SUPPLY;
    }
}
