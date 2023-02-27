package com.example.demo.meetup.patterns.ordered_cof;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements ApplicationRunner {

    @Autowired
    UserInfoService userInfoService;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        testCalculations();

        System.out.println("=============");

    }


    void testCalculations() {
        ExternalUserInfoDto externalUserInfoDto = new
                ExternalUserInfoDto(1, "123", "lalala@ya.ru", null);
        ExternalUserInfoDto externalUserInfoDto1 = new
                ExternalUserInfoDto(1, "1235", "lalala@ya.ru", "+912");
        ExternalUserInfoDto externalUserInfoDto2 = new
                ExternalUserInfoDto(1, "123", null, "+912");
        ExternalUserInfoDto externalUserInfoDto3 = new
                ExternalUserInfoDto(1, "12332567", "lalala@ya.ru", "+912");

        System.out.println(userInfoService.processUserInfo(externalUserInfoDto));
        System.out.println(userInfoService.processUserInfo(externalUserInfoDto1)
        );
        System.out.println(userInfoService.processUserInfo(externalUserInfoDto2));
        System.out.println(userInfoService.processUserInfo(externalUserInfoDto3));
    }

}
