package com.greensnow25.repositories;

import com.greensnow25.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Class UserRepositoryImpl.
 *
 * @author Alexandr Nezhelskyi
 * @version 1.0.
 * 01.12.18
 */
@Repository
public interface UserRepositoryImpl extends MongoRepository<User, Long> {

    User findUserByName(String name);

}
