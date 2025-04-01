package com.learn.cucumbertest.repo;

import com.learn.cucumbertest.dto.UserCreatDto;
import com.learn.cucumbertest.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserRepository {

    public User saveuser(UserCreatDto userCreatDto){
        User user = new User();
        user.setFullname(userCreatDto.getFullName());
        user.setUsername(userCreatDto.getUsername());
        return user;
    }
}
