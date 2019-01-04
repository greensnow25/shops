package com.greensnow25.listener;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListenerConfigurer;
import org.springframework.amqp.rabbit.listener.RabbitListenerEndpointRegistrar;

/**
 * Class App1Listener.
 *
 * @author Alexandr Nezhelskyi
 * @version 1.0.
 * 09.12.18
 */
@EnableRabbit
public class App1Listener implements RabbitListenerConfigurer {



    @Override
    public void configureRabbitListeners(RabbitListenerEndpointRegistrar rabbitListenerEndpointRegistrar) {

    }
}
