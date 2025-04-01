package com.learn.cucumbertest.controller;

import com.learn.cucumbertest.dto.UserCreatDto;
import com.learn.cucumbertest.entity.User;
import com.learn.cucumbertest.repo.UserRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {


    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public String userCreate(@RequestBody UserCreatDto userCreatDto){
        User user =userRepository.saveuser(userCreatDto);
    return "Successfully saved:"+user.getFullname();

    }
}
