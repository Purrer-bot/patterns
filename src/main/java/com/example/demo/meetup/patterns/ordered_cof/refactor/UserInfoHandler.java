package com.example.demo.meetup.patterns.ordered_cof.refactor;

import com.example.demo.meetup.patterns.ordered_cof.ExternalUserInfoDto;
import com.example.demo.meetup.patterns.ordered_cof.User;

public interface UserInfoHandler {

    User handle(ExternalUserInfoDto externalUserInfoDto, User user);

    OrderedHandlerType getType();
}
