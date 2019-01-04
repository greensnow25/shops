package com.greensnow25.repositories.impl;

import com.greensnow25.User;
import com.greensnow25.repositories.CustomUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * Class CustomUserRepositoryImpl.
 *
 * @author Alexandr Nezhelskyi
 * @version 1.0.
 * 02.12.18
 */
public class CustomUserRepositoryImpl implements CustomUserRepository {


    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public User getUserById(Long id) {
        return null;
    }
}
