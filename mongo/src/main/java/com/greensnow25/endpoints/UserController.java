package com.greensnow25.endpoints;

import com.greensnow25.User;
import com.greensnow25.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class UserController.
 *
 * @author Alexandr Nezhelskyi
 * @version 1.0.
 * 01.12.18
 */

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/users")
    public void addUserIfNotExist(@RequestBody User user){
        userService.addUserIfNotExist(user);

    }
}
