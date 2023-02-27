package com.example.demo.meetup.patterns.strategy_simple;

import com.example.demo.meetup.patterns.strategy_simple.refactor.VatCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;

@Service
public class UserVatService {

    public BigDecimal calculateVatForUser_BadWay(UserVATRequest userVATRequest) {
        switch (userVATRequest.getPaymentType()) {
            case FOOD:
                return userVATRequest.getPaymentAmount().divide(BigDecimal.valueOf(10), RoundingMode.CEILING);
            case FUEL:
                return userVATRequest.getPaymentAmount().multiply(BigDecimal.valueOf(0.02));
            case ANIMAL_SUPPLY:
//            case ORGANIC_FUEL:
                return BigDecimal.ZERO;
//            case FOOD_DELIVERY:
//                return userVATRequest.getPaymentAmount().compareTo(BigDecimal.valueOf(10)) > 0 ? BigDecimal.valueOf(0.01) : BigDecimal.ZERO;
        }

        throw new RuntimeException(); // TODO i will add exception here i promise!
    }

    @Autowired
    private Map<VatPaymentType, VatCalculator> calculatorMap;

    public BigDecimal calculate(UserVATRequest userVATRequest){
        return calculatorMap.get(userVATRequest.getPaymentType()).calculator(userVATRequest); //TODO null-check
    }
}
