package com.example.uberdeservico.controllers;


import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.Serializable;

public class UserController implements Serializable {

    @FXML
    TextField textingFieldEmail;
    @FXML
    TextField textingFieldPassword;

    @FXML
    public void onSaveAction(){
        System.out.println(textingFieldEmail.getText());
        System.out.println(textingFieldPassword.getText());
    }
}
