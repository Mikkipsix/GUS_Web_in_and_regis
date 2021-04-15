package com.gus.service;

import com.gus.entity.User;

public interface UserService {
    String login(User user);
    String registration(User user);
}
