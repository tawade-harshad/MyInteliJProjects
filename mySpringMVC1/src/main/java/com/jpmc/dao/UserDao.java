package com.jpmc.dao;

import com.jpmc.model.Login;
import com.jpmc.model.User;

public interface UserDao {
    void register(User user);

    User validateUser(Login login);

}
