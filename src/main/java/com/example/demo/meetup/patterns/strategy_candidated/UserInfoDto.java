package com.example.demo.meetup.patterns.strategy_candidated;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfoDto {

    private long userId;

    private Grade grade;

    private Language language;
}
