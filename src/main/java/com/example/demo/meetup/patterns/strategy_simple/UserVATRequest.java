package com.example.demo.meetup.patterns.strategy_simple;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * Represents User Vat Request which is needed to be processed
 * <br>
 * Contains different types of payment and amount of these payments
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserVATRequest {

    private long userId;

    private BigDecimal paymentAmount;

    private VatPaymentType paymentType; //  FOOD, FUEL, ANIMAL_SUPPLY
}
