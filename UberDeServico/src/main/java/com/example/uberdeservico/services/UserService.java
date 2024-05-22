package com.example.uberdeservico.services;

import com.example.uberdeservico.dao.UserDao;
import com.example.uberdeservico.db.DB;
import com.example.uberdeservico.models.User;

public class UserService {

    private final UserDao userDao = new UserDao(DB.getConnection());

    public void create(User user){
        userDao.insert(user);
    }
}
