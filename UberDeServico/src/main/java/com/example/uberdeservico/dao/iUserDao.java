package com.example.uberdeservico.dao;

import com.example.uberdeservico.models.User;

import java.util.List;

public interface iUserDao {
    void insert(User user);
    void update(User user);
    void deleteById(Integer id);
    void findById( Integer id);
    List<User> findAll();
}
