package com.example.demo.meetup.patterns.strategy_candidated.refactor;

import com.example.demo.meetup.patterns.strategy_candidated.Course;
import com.example.demo.meetup.patterns.strategy_candidated.Grade;
import com.example.demo.meetup.patterns.strategy_candidated.Language;
import com.example.demo.meetup.patterns.strategy_candidated.UserInfoDto;
import org.springframework.stereotype.Component;

@Component
public class JavaMiddleRecommendationProvider implements CriteriaAwareRecommendationProvider {

    @Override
    public boolean isCandidateFor(UserInfoDto userInfoDto) {
        return userInfoDto.getGrade() == Grade.JUNIOR && userInfoDto.getLanguage() == Language.JAVA;
    }

    @Override
    public Course getCourse() {
        return new Course("Java core");
    }
}
