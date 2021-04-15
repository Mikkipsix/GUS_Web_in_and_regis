package com.gus.dao;

import com.gus.entity.User;

public interface UserDao {
    User findByLogin(String login);
    Boolean save(User user);
}
