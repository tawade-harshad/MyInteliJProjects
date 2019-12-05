package com.training.mywebapp.service;

import com.training.mywebapp.exception.UserNotFoundException;
import com.training.mywebapp.model.User;

public interface UserService {
    public boolean registerNewUser(User user);
    public User authenticateUser(String username, String password) throws UserNotFoundException;

}
