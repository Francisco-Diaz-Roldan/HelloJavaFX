package com.example.hellojavafx;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class SecondaryView implements Initializable
{
    @javafx.fxml.FXML
    private Label info;
    @javafx.fxml.FXML
    private TextField txtNombre;
    @javafx.fxml.FXML
    private Button btnSaludar;
    @javafx.fxml.FXML
    private Button btnDespedir;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @javafx.fxml.FXML
    public void saludar(ActionEvent actionEvent) {
        info.setText("Hola "+ txtNombre.getText());
        var alerta = new Alert(Alert.AlertType.INFORMATION);//Crea una centana de alerta, de información
        alerta.setContentText("Hola "+ txtNombre.getText());
        alerta.showAndWait();
    }

    @javafx.fxml.FXML
    public void despedir(ActionEvent actionEvent) {
        info.setText("Adiós "+ txtNombre.getText());

    }
}