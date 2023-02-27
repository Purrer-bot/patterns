package com.example.demo.meetup.patterns.strategy_candidated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements ApplicationRunner {

    @Autowired
    RecommendationService recommendationService;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        testCalculations();

        System.out.println("=============");

    }


    void testCalculations() {
        UserInfoDto userInfoDto = new UserInfoDto(1, Grade.JUNIOR, Language.PYTHON);
        UserInfoDto userInfoDto1 = new UserInfoDto(1, Grade.JUNIOR, Language.JAVA);
        UserInfoDto userInfoDto2 = new UserInfoDto(1, Grade.SENIOR, Language.JAVA);

        System.out.println(recommendationService.getRecommendations_notAwesome(userInfoDto));
        System.out.println(recommendationService.getRecommendations_notAwesome(userInfoDto1));
        System.out.println(recommendationService.getRecommendations_notAwesome(userInfoDto2));

    }

}
