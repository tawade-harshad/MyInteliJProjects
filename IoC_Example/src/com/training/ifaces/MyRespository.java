package com.training.ifaces;

import java.util.*;

public interface MyRespository<T> {

    public int add(T t);
    public List<Map<String, Object>> findAll();
    public T findById(long key);
    public int update(T t);
    public int remove(long key);

}
