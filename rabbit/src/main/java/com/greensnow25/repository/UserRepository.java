package com.greensnow25.repository;

import com.greensnow25.User;

/**
 * Interface UserRepositor.
 *
 * @author Alexandr Nezhelskyi
 * @version 1.0.
 * 04.01.19
 */
public interface UserRepository {

    /**
     * add user to mongo db.
     *
     * @param user user,
     */
    public void addUser(User user);
}
