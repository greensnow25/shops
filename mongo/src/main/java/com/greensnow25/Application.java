package com.greensnow25;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Class Application.
 *
 * @author Alexandr Nezhelskyi
 * @version 1.0.
 * 01.12.18
 */
@SpringBootApplication(scanBasePackages = "com.greensnow25")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
