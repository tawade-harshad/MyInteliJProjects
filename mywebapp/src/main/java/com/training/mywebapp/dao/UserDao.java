package com.training.mywebapp.dao;

import com.training.mywebapp.model.User;

public interface UserDao {
    public boolean registerNewUser(User user);
    public User authenticateUser(String username, String password);
}
