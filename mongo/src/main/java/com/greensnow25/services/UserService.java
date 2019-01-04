package com.greensnow25.services;

import com.greensnow25.User;

/**
 * Interface UserService.
 *
 * @author Alexandr Nezhelskyi
 * @version 1.0.
 * 01.12.18
 */
public interface UserService {

    void addUserIfNotExist(User user);

}
