package com.greensnow25.service;

import com.greensnow25.User;

/**
 * Interface MessangerService.
 *
 * @author Alexandr Nezhelskyi
 * @version 1.0.
 * 09.12.18
 */
public interface UserService {

    User getUserById(Long Id);

    void addUser(User user);

}
