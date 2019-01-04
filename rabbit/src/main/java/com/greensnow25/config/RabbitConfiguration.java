package com.greensnow25.config;

import org.apache.log4j.Logger;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Class RabbitConfiguration.
 *
 * @author Alexandr Nezhelskyi
 * @version 1.0.
 * 08.12.18
 */
@Configuration
@EnableRabbit
public class RabbitConfiguration {

    private Logger logger = Logger.getLogger(RabbitConfiguration.class);

    @Autowired
    private ApplicationConfigReader applicationConfig;


    /* This bean is to read the properties file configs */
    @Bean
    public ApplicationConfigReader applicationConfig() {
        return new ApplicationConfigReader();
    }

    /* Creating a bean for the Message queue Exchange */
    @Bean
    public TopicExchange getApp1Exchange() {
        return new TopicExchange(applicationConfig().getApp1Exchange());
    }

    /* Creating a bean for the Message queue */
    @Bean
    public Queue getApp1Queue() {
        return new Queue(applicationConfig().getApp1Queue());
    }

    /* Binding between Exchange and Queue using routing key */
    @Bean
    public Binding declareBindingApp1() {
        return BindingBuilder.bind(getApp1Queue()).to(getApp1Exchange()).with(applicationConfig().getApp1RoutingKey());
    }

    /* Bean for rabbitTemplate */
    @Bean
    public RabbitTemplate rabbitTemplate(final ConnectionFactory connectionFactory) {
        final RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
//        rabbitTemplate.setConnectionFactory(getConnectionFactory());
        rabbitTemplate.setMessageConverter(producerJackson2MessageConverter());
        return rabbitTemplate;
    }

    @Bean
    public Jackson2JsonMessageConverter producerJackson2MessageConverter() {
        return new Jackson2JsonMessageConverter();
    }

}
