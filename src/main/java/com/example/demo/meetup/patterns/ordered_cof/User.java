package com.example.demo.meetup.patterns.ordered_cof;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    public User(long id) {
        this.id = id;
    }

    private long id;
    private String passport;
    private String phone;
    private String email;
    private boolean isStronglyVerified;
    private boolean isEmailVerified;
    private boolean isPhoneVerified;
    private boolean isForeignUser;
}
