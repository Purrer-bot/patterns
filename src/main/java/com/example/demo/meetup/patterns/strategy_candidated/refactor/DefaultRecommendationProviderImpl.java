package com.example.demo.meetup.patterns.strategy_candidated.refactor;

import com.example.demo.meetup.patterns.strategy_candidated.Course;
import org.springframework.stereotype.Component;

@Component
public class DefaultRecommendationProviderImpl implements DefaultRecommendationProvider {

    @Override
    public Course getCourse() {
        return new Course("1000 and 1 explanations what is 'void' in Java");
    }
}
