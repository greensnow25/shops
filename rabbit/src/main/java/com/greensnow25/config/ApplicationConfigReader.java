package com.greensnow25.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Class ApplicationProperties.
 *
 * @author Alexandr Nezhelskyi
 * @version 1.0.
 * 09.12.18
 */
@Configuration
@PropertySource("classpath:application.yml")
public class ApplicationConfigReader {

    @Value("${application.exchange.name}")
    private String applicationExchange;
    @Value("${application.queue.name}")
    private String applicationQueue;
    @Value("${application.routing.key}")
    private String applicationRoutingKey;

    public String getApplicationExchange() {
        return applicationExchange;
    }

    public void setApplicationExchange(String applicationExchange) {
        this.applicationExchange = applicationExchange;
    }

    public String getApplicationQueue() {
        return applicationQueue;
    }

    public void setApplicationQueue(String applicationQueue) {
        this.applicationQueue = applicationQueue;
    }

    public String getApplicationRoutingKey() {
        return applicationRoutingKey;
    }

    public void setApplicationRoutingKey(String applicationRoutingKey) {
        this.applicationRoutingKey = applicationRoutingKey;
    }
}
