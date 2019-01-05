package com.greensnow25.repository.impl;

import com.greensnow25.User;
import com.greensnow25.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

/**
 * Class UserRepositorMongo.
 *
 * @author Alexandr Nezhelskyi
 * @version 1.0.
 * 04.01.19
 */
@Repository
public class UserRepositoryMongo implements UserRepository {

//    @Autowired
//    private MongoOperations mongoOperations;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void addUser(User user) {
        mongoTemplate.save(user);
    }
}
