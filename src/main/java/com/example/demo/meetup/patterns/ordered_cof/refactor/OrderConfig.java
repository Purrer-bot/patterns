package com.example.demo.meetup.patterns.ordered_cof.refactor;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Configuration
public class OrderConfig {


    @Bean
    @Qualifier("order")
    List<UserInfoHandler> order(List<UserInfoHandler> handlers) {
        return handlers.stream().sorted(Comparator.comparing(h -> h.getType().ordinal())).collect(Collectors.toCollection(LinkedList::new));
    }
}
