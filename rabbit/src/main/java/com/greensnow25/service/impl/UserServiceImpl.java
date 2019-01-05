package com.greensnow25.service.impl;

import com.greensnow25.User;
import com.greensnow25.config.ApplicationConfigReader;
import com.greensnow25.repository.UserRepository;
import com.greensnow25.service.UserService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Class MessangerServiceImpl.
 *
 * @author Alexandr Nezhelskyi
 * @version 1.0.
 * 09.12.18
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private ApplicationConfigReader applicationConfigReader;

    @Autowired
    private UserRepository userRepository;


    @Override
    public User getUserById(Long Id) {

        User user = new User();
        user.setAge("87");

        rabbitTemplate.convertAndSend(applicationConfigReader.getApplicationExchange()
                , applicationConfigReader.getApplicationRoutingKey()
                , user);

        return null;
    }

    @Override
    public void addUser(User user) {
        userRepository.addUser(user);
    }
}
