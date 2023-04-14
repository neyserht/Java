package neyser.conversor;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);

        // Crear Grid
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(5);
        grid.setHgap(5);
        scene.setRoot(grid);

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        // Crear Control Label
        Label l1 = new Label();
        l1.setText("Indicar la emperatura en ºC");
        GridPane.setConstraints(l1,0,1);
        grid.getChildren().add(l1);

        // Crear Control TextField
        TextField t1 = new TextField();
        t1.setPromptText("Test");
        GridPane.setConstraints(t1,0,2);
        grid.getChildren().add(t1);

        // Crear Control Button
        Button b1 = new Button("Convertir");
        GridPane.setConstraints(b1,0,3);
        grid.getChildren().add(b1);

        // Crear Control Label Resultado
        Label l2 = new Label();
        GridPane.setConstraints(l2,0,4);
        grid.getChildren().add(l2);

        // Acción del Boton
        b1.setOnAction((ActionEvent event)->{
            String dato = t1.getText();
            Double d1 = conversion(Double.parseDouble(dato));
            l2.setText(d1.toString()+" ºF");
        });

    }

    public Double conversion(Double temperatura){
        Double v1;
        v1 = ((temperatura*9)/5)+32;
        return v1;
    }

    public static void main(String[] args) {
        launch();
    }


}