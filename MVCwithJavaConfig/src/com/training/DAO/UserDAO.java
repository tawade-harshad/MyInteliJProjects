package com.training.DAO;

import com.training.beans.User;
import com.training.ifaces.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDAO implements UserRepository<User> {

    @Autowired
    private JdbcTemplate template;

    private static String tableName="users";


    @Override
    public int addUser(User user) {
        String sqlAddUser = "insert into " +tableName+ " values (?,?,?,?,?,?,?)";
        int rowAdded = this.template.update(sqlAddUser,user.getUserName(),user.getPassword(),user.getFirstName()
        ,user.getLastName(),user.getEmail(),user.getAddress(),user.getPhone());
        return rowAdded;
    }

    @Override
    public boolean validateUser(User user) {

        Boolean checkUser = false;

        String sqlvalidateUser = "Select * from " +tableName+ " where username=? and password=?";
        User foundUser = this.template.queryForObject(sqlvalidateUser,new BeanPropertyRowMapper<User>(User.class),user.getUserName(),user.getPassword());
//        System.out.println(foundUser);
        if(foundUser != null){
            checkUser=true;
        }
        return checkUser;
    }
}
