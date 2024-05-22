package com.example.uberdeservico.controllers;


import com.example.uberdeservico.models.User;
import com.example.uberdeservico.services.UserService;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.Serializable;

public class UserController implements Serializable {

    private final UserService userService= new UserService();

    @FXML
    TextField textingFieldEmail;
    @FXML
    TextField textingFieldPassword;

    @FXML
    public void onSaveAction(){
        User user = new User(
                textingFieldEmail.getText(),
                textingFieldPassword.getText()
        );
        userService.create(user);
    }
}
