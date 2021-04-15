package com.gus.controller;

import com.gus.entity.User;
import com.gus.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Controller {
    UserServiceImpl userService = new UserServiceImpl();

    @RequestMapping("/")
    String main() {
        return "Hello from GUS";

    }


    @RequestMapping("/loginForm")
    ModelAndView loginForm() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("loginForm.html");
        return modelAndView;
    }

    @RequestMapping("/registrationForm")
    ModelAndView registrationForm() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("registrationForm.html");
        return modelAndView;
    }

    @PostMapping("/login")
    String login(@RequestParam String login,@RequestParam String password) {
        User user = new User();
        user.setLogin(login);
        user.setPassword(password);
        return userService.login(user);
    }

    @PostMapping("/registration")
    String registration(@RequestParam String name,@RequestParam String surname, @RequestParam String login,@RequestParam String password) {
        User user = new User();
        user.setName(name);
        user.setSurname(surname);
        user.setLogin(login);
        user.setPassword(password);
        return userService.registration(user);
    }
}
