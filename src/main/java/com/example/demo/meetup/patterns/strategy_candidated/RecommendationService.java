package com.example.demo.meetup.patterns.strategy_candidated;

import com.example.demo.strategy.choose_strategy.Course;
import org.springframework.stereotype.Service;

@Service
public class RecommendationService {

    Course getRecommendations_notAwesome(UserInfoDto userInfoDto) {
        if (userInfoDto.getGrade() == Grade.JUNIOR && userInfoDto.getLanguage() == Language.JAVA)
            return new Course("Java core");
        if (userInfoDto.getGrade() == Grade.MIDDLE && userInfoDto.getLanguage() == Language.JAVA)
            return new Course("Java EE");
        if (userInfoDto.getGrade() == Grade.SENIOR && userInfoDto.getLanguage() == Language.JAVA)
            return new Course("DevOps for beginners");

        if (userInfoDto.getLanguage() == Language.PYTHON)
            return new Course("Neural net from scratch using 'GOD Framework'");

        return new Course("1000 and 1 explanations what is 'void' in Java");
    }

    Course getRecommendations_aBitBetter(UserInfoDto userInfoDto) {
        switch (userInfoDto.getLanguage()) {
            case JAVA:
                switch (userInfoDto.getGrade()) {
                    case JUNIOR:
                        return new Course("Java core");
                    case MIDDLE:
                        return new Course("Java EE");
                    case SENIOR:
                        return new Course("DevOps for beginners");
                    default:
                        new Course("1000 and 1 explanations what is 'void' in Java");
                }
                break;
            case PYTHON:
                return new Course("Neural net from scratch using 'GOD Framework'");
            default:
                return new Course("1000 and 1 explanations what is 'void' in Java");
        }
        throw new RuntimeException();
    }

}
