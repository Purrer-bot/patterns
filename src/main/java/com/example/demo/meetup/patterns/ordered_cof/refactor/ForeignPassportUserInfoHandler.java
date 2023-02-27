package com.example.demo.meetup.patterns.ordered_cof.refactor;

import com.example.demo.meetup.patterns.ordered_cof.ExternalUserInfoDto;
import com.example.demo.meetup.patterns.ordered_cof.User;
import org.springframework.stereotype.Component;

@Component
public class ForeignPassportUserInfoHandler implements UserInfoHandler{
    @Override
    public User handle(ExternalUserInfoDto externalUserInfoDto, User user) {
        if (externalUserInfoDto.getPassport().length() > 7) {
            user.setPassport(externalUserInfoDto.getPassport());
            user.setForeignUser(true);
        }
        return user;
    }

    @Override
    public OrderedHandlerType getType() {
        return OrderedHandlerType.FOREIGN_PASSPORT;
    }
}
