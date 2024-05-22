package com.example.uberdeservico.dao;

import com.example.uberdeservico.models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class UserDao implements iUserDao {

    Connection con;
    public UserDao(Connection con){
        this.con = con;
    }
    @Override
    public void insert(User user){
        try {
            PreparedStatement statement = con.prepareStatement("INSERT INTO users(email,password) VALUES (?,?)");
            statement.setString(1, user.getEmail());
            statement.setString(2, user.getPassword());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void findById(Integer id) {

    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
