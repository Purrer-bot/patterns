package com.example.demo.meetup.patterns.ordered_cof.refactor;

import com.example.demo.meetup.patterns.ordered_cof.ExternalUserInfoDto;
import com.example.demo.meetup.patterns.ordered_cof.User;
import org.springframework.stereotype.Component;

@Component
public class EmailUserInfoHandler implements UserInfoHandler{

    @Override
    public User handle(ExternalUserInfoDto externalUserInfoDto, User user) {
        if (externalUserInfoDto.getEmail() != null) {
            user.setEmail(externalUserInfoDto.getPhoneNumber());
            user.setEmailVerified(true);
        }
        return user;
    }

    @Override
    public OrderedHandlerType getType() {
        return OrderedHandlerType.EMAIL;
    }
}
