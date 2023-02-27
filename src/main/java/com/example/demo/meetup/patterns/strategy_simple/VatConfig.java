package com.example.demo.meetup.patterns.strategy_simple;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Configuration
public class VatConfig {

    @Bean
    Map<VatPaymentType, VatCalculator> map(
            List<VatCalculator> vatCalculatorList
    ) {
        return vatCalculatorList.stream().collect(Collectors.toMap(VatCalculator::getType, v -> v));
    }
}
