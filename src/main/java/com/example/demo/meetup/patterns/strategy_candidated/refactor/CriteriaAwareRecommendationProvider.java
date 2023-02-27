package com.example.demo.meetup.patterns.strategy_candidated.refactor;

import com.example.demo.meetup.patterns.strategy_candidated.UserInfoDto;

public interface CriteriaAwareRecommendationProvider extends RecommendationProvider{

    boolean isCandidateFor(UserInfoDto userInfoDto);
}
