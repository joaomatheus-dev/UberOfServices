package com.example.uberdeservico.controllers;

import com.example.uberdeservico.MainApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    public void onRegisterAction() {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("signup-view.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 700, 534);
            Stage stage = new Stage();
            stage.setTitle("Sign Up User");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}