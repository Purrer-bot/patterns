package com.example.demo.meetup.patterns.ordered_cof.refactor;

import com.example.demo.meetup.patterns.ordered_cof.ExternalUserInfoDto;
import com.example.demo.meetup.patterns.ordered_cof.User;
import org.springframework.stereotype.Component;

@Component
public class PassportUserInfoHandlerImpl implements UserInfoHandler {

    @Override
    public User handle(ExternalUserInfoDto externalUserInfoDto, User user) {
        user.setPassport(externalUserInfoDto.getPassport());
        user.setStronglyVerified(true);
        return user;
    }

    @Override
    public OrderedHandlerType getType() {
        return OrderedHandlerType.PASSPORT;
    }
}
