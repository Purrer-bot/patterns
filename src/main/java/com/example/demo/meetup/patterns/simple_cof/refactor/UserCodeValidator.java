package com.example.demo.meetup.patterns.simple_cof.refactor;

import com.example.demo.meetup.patterns.simple_cof.UserInfoDto;
import com.example.demo.meetup.patterns.simple_cof.helper.ValidationResult;
import org.springframework.stereotype.Component;

@Component
public class UserCodeValidator implements UserInfoValidator{
    @Override
    public ValidationResult validate(UserInfoDto validationEntity) {
        if(validationEntity.getUserCode().length() < 5 || validationEntity.getUserCode().length() > 7)
            return ValidationResult.notValid("OMG!");
        return ValidationResult.valid();
    }
}
