package neyser.ejemplotextfieldjavafx2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(5);
        grid.setHgap(5);
        scene.setRoot(grid);

        Label l1 = new Label("Indique un valor");
        GridPane.setConstraints(l1,0,0);
        grid.getChildren().add(l1);
        Label l2 = new Label();
        GridPane.setConstraints(l2,0,3);
        grid.getChildren().add(l2);

        TextField tf1 = new TextField();
        GridPane.setConstraints(tf1,0,1);
        grid.getChildren().add(tf1);


        Button b1 = new Button("Aceptar");
        GridPane.setConstraints(b1,0,2);
        grid.getChildren().add(b1);

        b1.setOnAction((ActionEvent event) ->
        {
            if (tf1.getText() != null && tf1.getText().isEmpty())
            {
                l1.setTextFill(Color.web("#ff0000", 1.0));
            }
            else
            {
                l2.setText(tf1.getText());
                tf1.clear();
                l1.setTextFill(Color.web("#000000", 1.0));
            }
        });

    }

    public static void main(String[] args) {
        launch();
    }
}