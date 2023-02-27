package com.example.demo.meetup.patterns.simple_cof;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

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
        UserInfoDto userInfoDto = new UserInfoDto(1, "smol", LocalDate.now(), "23");
        UserInfoDto userInfoDto1 = new UserInfoDto(1, "as", LocalDate.now(), "23");
        UserInfoDto userInfoDto2 = new UserInfoDto(1, "acdedb", LocalDate.now(), "12");

        processUserInfo(userInfoDto);
        processUserInfo(userInfoDto1);
        processUserInfo(userInfoDto2);

    }


    private void processUserInfo(UserInfoDto userInfoDto) {
        try {
            System.out.println(userInfoService.processUserInfo(userInfoDto));
        } catch (RuntimeException e) {
            System.out.println("NOPE");
        }
    }

    private void processAndValidateUserInfo(UserInfoDto userInfoDto) {
        try {
            System.out.println(userInfoService.processAndValidateUserInfo(userInfoDto));
        } catch (RuntimeException e) {
            System.out.println("NOPE");
        }
    }
}
