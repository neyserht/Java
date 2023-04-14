package neyser.autos2;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 600);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        //Grid
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(5);
        grid.setHgap(5);
        scene.setRoot(grid);

        // ComboBox Tipo de Combustible
        ObservableList<String> opciones1 = FXCollections.observableArrayList
                ("gasolina", "gasoil", "eléctrico");
        final ComboBox cb1 = new ComboBox(opciones1);

        // ComboBox Maca de Vehiculos
        ObservableList<String> opciones2 = FXCollections.observableArrayList
                ("Ford", "Toyota", "Tesla");
        final ComboBox cb2 = new ComboBox(opciones2);








        // Posicionamiento de los controles en el GridPane
        GridPane.setConstraints(cb1, 0, 0);
        GridPane.setConstraints(cb2, 0, 1);

        // Adición de los controles al grid
        grid.getChildren().addAll(cb1, cb2);

        // Evento del botón
        /*b1.setOnAction((ActionEvent e) -> {

        });*/







    }

    public static void main(String[] args) {
        launch();
    }
}