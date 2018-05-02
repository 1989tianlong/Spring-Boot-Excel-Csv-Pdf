package com.export.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.export.model.User;
import com.export.service.UserService;

import java.util.List;

/**
 * Created by Philip Kwadwo Appiah
 */

@RestController
public class Api {

    @Autowired
    UserService userService;

    /**
     * Handle request to the default page
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<User> viewHome() {
        return userService.findAllUsers();
    }


}
