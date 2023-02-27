package com.example.demo.meetup.patterns.strategy_simple.refactor;

import com.example.demo.meetup.patterns.strategy_simple.UserVATRequest;
import com.example.demo.meetup.patterns.strategy_simple.VatPaymentType;
import com.example.demo.meetup.patterns.strategy_simple.refactor.VatCalculator;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class FuelVatCalculator implements VatCalculator {


    @Override
    public BigDecimal calculator(UserVATRequest userVATRequest) {
        return userVATRequest.getPaymentAmount().multiply(BigDecimal.valueOf(0.02));
    }

    @Override
    public VatPaymentType getType() {
        return VatPaymentType.FUEL;
    }
}
