package com.example.demo.meetup.patterns.strategy_simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class DemoApplication implements ApplicationRunner {

    @Autowired
    UserVatService userVatService;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        testCalculations();

        System.out.println("==========");

        testCalculations1();
    }


    void testCalculations() {
        UserVATRequest userVATRequest = new UserVATRequest(1, BigDecimal.valueOf(1), VatPaymentType.ANIMAL_SUPPLY);
        UserVATRequest userVATRequest1 = new UserVATRequest(1, BigDecimal.valueOf(1), VatPaymentType.FOOD);
        UserVATRequest userVATRequest2 = new UserVATRequest(1, BigDecimal.valueOf(1), VatPaymentType.FUEL);


        System.out.println(userVatService.calculateVatForUser_BadWay(userVATRequest));
        System.out.println(userVatService.calculateVatForUser_BadWay(userVATRequest1));
        System.out.println(userVatService.calculateVatForUser_BadWay(userVATRequest2));

    }

    void testCalculations1() {
        UserVATRequest userVATRequest = new UserVATRequest(1, BigDecimal.valueOf(1), VatPaymentType.ANIMAL_SUPPLY);
        UserVATRequest userVATRequest1 = new UserVATRequest(1, BigDecimal.valueOf(1), VatPaymentType.FOOD);
        UserVATRequest userVATRequest2 = new UserVATRequest(1, BigDecimal.valueOf(1), VatPaymentType.FUEL);


        System.out.println(userVatService.calculate(userVATRequest));
        System.out.println(userVatService.calculate(userVATRequest1));
        System.out.println(userVatService.calculate(userVATRequest2));

    }


}
