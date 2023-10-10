package com.example.hellojavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!"
        );
    }
    @FXML       //Todo lo unido a la centana debe tener esta etiqueta, auunque funciona sin ella al ser public y poner (ActionEvent actionEvent)
    protected void helloConsole(){
        System.out.println("Hola a todos desde JavaFX!!!");
    }
    @FXML
    protected void saludar(ActionEvent actionEvent) {
        System.out.println("holiwi de kiwi");
        System.out.println(actionEvent);
    }
}