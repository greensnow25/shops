package com.greensnow25.services.impl;

import com.greensnow25.User;
import com.greensnow25.repositories.UserRepositoryImpl;
import com.greensnow25.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Class UserServiceImpl.
 *
 * @author Alexandr Nezhelskyi
 * @version 1.0.
 * 01.12.18
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepositoryImpl userRepository;

    @Override
    public void addUserIfNotExist(User user) {

        User existingUser = userRepository.findUserByName(user.getName());

        if(existingUser == null){
            userRepository.save(user);
        }

    }
}
