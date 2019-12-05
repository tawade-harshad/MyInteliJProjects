package com.training.mywebapp.model;

import javax.persistence.*;

@Entity
@Table( name="users")
@NamedQuery(name= "findUser", query = "from User where userName=? and password=?")
public class User {

    @Id
    @Column(name="User_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;

    @Column(name="User_Name")
    private String userName;

    @Column(name="Password")
    private String password;

    @Column(name="User_EmailId")
    private String userEmailId;

    @Column(name="User_Contact")
    private long userContact;

    public User() {
    }

    public User(String userName, String password, String userEmailId, long userContact) {
        this.userName = userName;
        this.password = password;
        this.userEmailId = userEmailId;
        this.userContact = userContact;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserEmailId() {
        return userEmailId;
    }

    public void setUserEmailId(String userEmailId) {
        this.userEmailId = userEmailId;
    }

    public long getUserContact() {
        return userContact;
    }

    public void setUserContact(long userContact) {
        this.userContact = userContact;
    }
}
