package com.example.demo.meetup.patterns.strategy_simple.refactor;

import com.example.demo.meetup.patterns.strategy_simple.UserVATRequest;
import com.example.demo.meetup.patterns.strategy_simple.VatPaymentType;
import com.example.demo.meetup.patterns.strategy_simple.refactor.VatCalculator;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Component
public class FoodVatCalculator implements VatCalculator {
    @Override
    public BigDecimal calculator(UserVATRequest userVATRequest) {
        return userVATRequest.getPaymentAmount().divide(BigDecimal.valueOf(10), RoundingMode.CEILING);
    }

    @Override
    public VatPaymentType getType() {
        return VatPaymentType.FOOD;
    }
}
