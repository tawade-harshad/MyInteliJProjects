package com.jpmc.service;

import com.jpmc.dao.UserDao;
import com.jpmc.model.Login;
import com.jpmc.model.User;
import org.springframework.beans.factory.annotation.*;

public class UserServiceImpl implements UserService {

    @Autowired
    public UserDao userDao;

    public void register(User user) {
        userDao.register(user);
    }

    public User validateUser(Login login) {
        return userDao.validateUser(login);
    }
}
