package com.example.demo.meetup.patterns.simple_cof;

import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class UserInfoService {

    String processUserInfo(UserInfoDto userInfoDto) {
        this.validateUserCode(userInfoDto);
        this.validateUserCodeDate(userInfoDto);
        this.validateCompanyCode(userInfoDto);

        return userInfoDto.toString();
    }

    private void validateUserCode(UserInfoDto userInfoDto) {
        if (userInfoDto.getUserCode().length() < 5 || userInfoDto.getUserCode().length() > 7) {
            throw new RuntimeException();
        }
    }

    private void validateCompanyCode(UserInfoDto userInfoDto) {
        if (userInfoDto.getCompanyCode().length() != 2) {
            throw new RuntimeException();
        }
    }

    private void validateUserCodeDate(UserInfoDto userInfoDto) {
        if (userInfoDto.getUserCodeDate().compareTo(LocalDate.now()) < 0) throw new RuntimeException();
    }

    public String processAndValidateUserInfo(UserInfoDto userInfoDto) {
        /// Code goes here
        return userInfoDto.toString();
    }
    //.........
}
