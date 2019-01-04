package com.greensnow25.repositories;

import com.greensnow25.User;

/**
 * Interface CustomUserRepository.
 *
 * @author Alexandr Nezhelskyi
 * @version 1.0.
 * 02.12.18
 */
public interface CustomUserRepository {

    User getUserById(Long id);

}
