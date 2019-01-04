package com.greensnow25.service.impl;

import com.greensnow25.User;
import com.greensnow25.config.ApplicationConfigReader;
import com.greensnow25.service.MessangerService;
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
public class MessangerServiceImpl implements MessangerService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private ApplicationConfigReader applicationConfigReader;


    @Override
    public User getUserById(Long Id) {

        User user = new User();
        user.setAge("87");

         rabbitTemplate.convertAndSend(applicationConfigReader.getApp1Exchange()
                , applicationConfigReader.getApp1RoutingKey()
                , user);

        return null;
    }
}
