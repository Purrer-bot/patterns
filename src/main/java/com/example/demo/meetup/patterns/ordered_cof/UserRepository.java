package com.example.demo.meetup.patterns.ordered_cof;

import org.springframework.stereotype.Service;

@Service
public class UserRepository {

    User getUser(long userId) {
        return new User(userId);
    }
}
