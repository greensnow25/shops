package com.greensnow25.endpoint;

import com.greensnow25.service.MessangerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

/**
 * Class UserEndpoint.
 *
 * @author Alexandr Nezhelskyi
 * @version 1.0.
 * 31.12.18
 */
@RestController
public class UserEndpoint {

    @Autowired
    private MessangerService messangerService;

    @GetMapping("/message")
    public void getUser() {
        messangerService.getUserById(1L);
    }
}
