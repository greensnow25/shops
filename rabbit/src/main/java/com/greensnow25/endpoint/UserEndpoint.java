package com.greensnow25.endpoint;

import com.greensnow25.User;
import com.greensnow25.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

/**
 * Class UserEndpoint.
 *
 * @author Alexandr Nezhelskyi
 * @version 1.0.
 * 31.12.18
 */
@RestController("/users")
public class UserEndpoint {

    private final UserService userService;

    @Autowired
    public UserEndpoint(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/message")
    public void getUser() {
        userService.getUserById(1L);
    }

    @PostMapping
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }
}
