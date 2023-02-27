package com.example.demo.meetup.patterns.simple_cof;

import com.example.demo.meetup.patterns.simple_cof.refactor.UserInfoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

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

    @Autowired
    List<UserInfoValidator> validatorList;

    public String processAndValidateUserInfo(UserInfoDto userInfoDto) {

        for (UserInfoValidator userInfoValidator : validatorList) {
            if(!userInfoValidator.validate(userInfoDto).isValid())
                throw new RuntimeException();
        }
        return userInfoDto.toString();
    }
    //.........
}
