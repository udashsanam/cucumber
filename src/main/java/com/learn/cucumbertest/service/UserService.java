package com.learn.cucumbertest.service;

import com.learn.cucumbertest.dto.UserCreatDto;
import com.learn.cucumbertest.entity.User;
import com.learn.cucumbertest.repo.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String userSave(UserCreatDto userCreatDto){
        User user = userRepository.saveuser(userCreatDto);
        return user.getFullname();
    }
}
