package com.training.mywebapp.service.impl;

import com.training.mywebapp.dao.UserDao;
import com.training.mywebapp.dao.impl.UserDaoImpl;
import com.training.mywebapp.exception.UserNotFoundException;
import com.training.mywebapp.model.User;
import com.training.mywebapp.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();

    @Override
    public boolean registerNewUser(User user) {
        return userDao.registerNewUser(user);
    }

    @Override
    public User authenticateUser(String username, String password)throws UserNotFoundException {
        User user = userDao.authenticateUser(username,password);

        if(user == null){
            throw new UserNotFoundException("Invalid username or password");
        }else{
            return user;
        }

    }
}
