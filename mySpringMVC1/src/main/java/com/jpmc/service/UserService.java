package com.jpmc.service;

import com.jpmc.model.Login;
import com.jpmc.model.User;

public interface UserService {
    void register(User user);

    User validateUser(Login login);

}
