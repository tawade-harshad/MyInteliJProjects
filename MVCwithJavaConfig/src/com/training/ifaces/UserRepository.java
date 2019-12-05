package com.training.ifaces;

import com.training.beans.User;

public interface UserRepository<T> {

    public int addUser(T t);
    public boolean validateUser(T t);
}
