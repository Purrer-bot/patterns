package com.example.demo.meetup.patterns.ordered_cof;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExternalUserInfoDto {
    private long userId;
    private String passport;
    private String email;
    private String phoneNumber;
}
