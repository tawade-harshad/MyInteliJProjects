package com.training.mywebapp.dao.impl;

import com.training.mywebapp.dao.UserDao;
import com.training.mywebapp.model.User;

import javax.persistence.*;
import java.util.List;

public class UserDaoImpl implements UserDao {

    private EntityManagerFactory factory = Persistence.createEntityManagerFactory("mywebapp");

    @Override
    public boolean registerNewUser(User user) {
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();

        entityManager.persist(user);
        tx.commit();
        entityManager.close();

        return true;
    }

    @Override
    public User authenticateUser(String username, String password) {
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();

        Query query = entityManager.createNamedQuery("findUser");
        query.setParameter(1,username);
        query.setParameter(2,password);

        List<User> users = query.getResultList();
        User user = null;

        if(users.size() != 0){
            user = users.get(0);
        }

        return user;
    }
}
