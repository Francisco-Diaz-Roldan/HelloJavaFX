package com.example.hellojavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
//Java FX  es un framework completo basado y estructurado en módulos que no pertenece a JDK
//JavaFX es quien ejecuta l código, no al revés
public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("secondary-view.fxml"));//Devuelve un paremt, parent es el elemento raiz
        Parent p = fxmlLoader.load();//Saco la escena
        Scene scene = new Scene(p, 270, 340);//Creamos la escena con ese contenido
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.setResizable(false);
        //stage.setFullScreen(true);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    } //Lanzamos el metodo main
}