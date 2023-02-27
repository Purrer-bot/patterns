package com.example.demo.meetup.patterns.ordered_cof;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {

    @Autowired
    UserRepository userRepository;


    public String processUserInfo(ExternalUserInfoDto externalUserInfoDto) {
        User user = userRepository.getUser(externalUserInfoDto.getUserId());

        if (externalUserInfoDto.getPassport() != null) {
            user.setPassport(externalUserInfoDto.getPassport());
            user.setStronglyVerified(true);
            if (externalUserInfoDto.getPassport().length() > 7) {
                user.setPassport(externalUserInfoDto.getPassport());
                user.setForeignUser(true);
            }
        }

        if (externalUserInfoDto.getPhoneNumber() != null) {
            user.setPhone(externalUserInfoDto.getPhoneNumber());
            user.setPhoneVerified(true);
        }
        if (externalUserInfoDto.getEmail() != null) {
            user.setEmail(externalUserInfoDto.getPhoneNumber());
            user.setEmailVerified(true);
        }

        return user.toString();
    }

    private void setUserAsForeigner(ExternalUserInfoDto externalUserInfoDto, User user) {
        user.setPassport(externalUserInfoDto.getPassport());
        user.setForeignUser(true);
    }

    private void updateUserInfo(ExternalUserInfoDto externalUserInfoDto, User user) {
        user.setPassport(externalUserInfoDto.getPassport());
        user.setStronglyVerified(true);

    }

    private void updateUserPhone(ExternalUserInfoDto externalUserInfoDto, User user) {
        user.setPhone(externalUserInfoDto.getPhoneNumber());
        user.setPhoneVerified(true);
    }

    private void updateUserEmail(ExternalUserInfoDto externalUserInfoDto, User user) {
        user.setEmail(externalUserInfoDto.getPhoneNumber());
        user.setEmailVerified(true);
    }

//    @Autowired
//    @Qualifier("ordered")
//    List<UserProcessingService> userProcessingServices;
//
//
//    public String processUser(ExternalUserInfoDto externalUserInfoDto) {
//        User user = userRepository.getUser(externalUserInfoDto.getUserId());
//
//
//        for (UserProcessingService userProcessingService : userProcessingServices) {
//            user = userProcessingService.process(user, externalUserInfoDto);
//        }
//
//        return user.toString();
//    }


    //
////    @Autowired
////    @Qualifier("orderedList")
////    List<UserInfoProcessor> processorList;
//
////    public void processUserInfo(ExternalUserInfoDto externalUserInfoDto) {
////        User user = userRepository.getUser(externalUserInfoDto.getUserId());
////        for (UserInfoProcessor userInfoProcessor : processorList) {
////            userInfoProcessor.processUserInfo(externalUserInfoDto, user);
////        }
////    }
//
}
