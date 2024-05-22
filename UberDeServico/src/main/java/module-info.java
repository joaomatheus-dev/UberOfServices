module com.example.uberdeservico {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.uberdeservico to javafx.fxml;
    exports com.example.uberdeservico;
    exports com.example.uberdeservico.controllers;
    opens com.example.uberdeservico.controllers to javafx.fxml;
}