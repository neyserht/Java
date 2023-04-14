package com.example.javafxfasedediseno;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 500);
        // Hojas de estilo del proyecto

        //scene.getStylesheets().add(getClass().getResource("aplication.css").toExternalForm());

        // Grid es la rejilla que estructura los controles
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(5);
        grid.setHgap(5);
        scene.setRoot(grid);


        stage.setTitle("Aplicacion 1");
        stage.setScene(scene);
        stage.show();


        // Crear un campo de Texto
        TextField c1 = new TextField();

        // Añadir el campo de texto al Grid
        GridPane.setConstraints(c1, 0,0);
        grid.getChildren().add(c1);

        // Crear Boton
        Button b1 = new Button("Saludar");

        // Añadir el campo de texto al grid
        GridPane.setConstraints(b1,0,1);
        grid.getChildren().add(b1);
        // ok

        // Añadir el evento







    }

    public static void main(String[] args) {
        launch();
    }
}