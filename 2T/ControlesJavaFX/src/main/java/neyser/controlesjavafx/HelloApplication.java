package neyser.controlesjavafx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 400);

        //Grid
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(5);
        grid.setHgap(5);
        scene.setRoot(grid);


        // Establecer valores de visualización
        //grid.setAlignment(Pos.CENTER);
        //grid.setHalignment(label, HPos.CENTER);

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        // Crear el Control
        Label l1 = new Label("Texto de etiqueta");
        l1.setTextFill(Color.web("#ff0000",0.8));
        // Añadir control al grid
        GridPane.setConstraints(l1, 0,0);
        grid.getChildren().add(l1);

        // Crear el Control
        Button b1 = new Button("Aceptar");

        // Añadir control al grid
        GridPane.setConstraints(b1, 0,1);
        grid.getChildren().add(b1);

        // Crear el Control

        Image img1 = new Image(getClass().getResourceAsStream("/check.png"));
        Label l2 = new Label("Imagen del control", new ImageView(img1));
        GridPane.setConstraints(l2,0,2);
        grid.getChildren().add(l2);



        // Añadir un evento al boton
        b1.setOnAction((ActionEvent event)->{
            b1.setText("Modificado");
        });

        // Crear los controles
        RadioButton rb1 = new RadioButton("Si");
        RadioButton rb2 = new RadioButton("No");
        rb1.setSelected(true);

        // Crear grupo y añadir controles
        final ToggleGroup grupo1 = new ToggleGroup();
        rb1.setToggleGroup(grupo1);
        rb2.setToggleGroup(grupo1);
        // Añadir el grupo al grid
        GridPane.setConstraints(rb1,0,3);
        grid.getChildren().add(rb1);
        GridPane.setConstraints(rb2,0,4);
        grid.getChildren().add(rb2);

        // Crear el Control
        Label l3 = new Label("");
        // Añadir control al grid
        GridPane.setConstraints(l3, 0,5);
        grid.getChildren().add(l3);

        // Crear el Control
        Button b2 = new Button("Aceptar");
        b2.setOnAction((ActionEvent event)->{
            RadioButton rbSeleccionado1 = (RadioButton) grupo1.getSelectedToggle();
            l3.setText(rbSeleccionado1.getText());
        });

        // Añadir control al grid
        GridPane.setConstraints(b2, 0,6);
        grid.getChildren().add(b2);

        //Togglebutton
        ToggleButton tb1 = new ToggleButton("Caso A");
        //Togglebutton
        ToggleButton tb2 = new ToggleButton("Caso B");
        //Togglebutton
        ToggleButton tb3 = new ToggleButton("Caso C");
        ToggleButton tb4 = new ToggleButton("Caso DE");
        // Crear el grupo
        final ToggleGroup tgrupo1 = new ToggleGroup();
        tb1.setToggleGroup(tgrupo1);
        tb2.setToggleGroup(tgrupo1);
        tb3.setToggleGroup(tgrupo1);
        tb1.setSelected(true);
        //Añadir los controles al grid
        GridPane.setConstraints(tb1,0,7);
        grid.getChildren().add(tb1);
        GridPane.setConstraints(tb2,1,7);
        grid.getChildren().add(tb2);
        GridPane.setConstraints(tb3,2,7);
        grid.getChildren().add(tb3);
        GridPane.setConstraints(tb4,3,7);
        grid.getChildren().add(tb4);

        //grear el control
        CheckBox cb1 = new CheckBox();
        cb1.setText("Caso A");
        cb1.setSelected(true);
        CheckBox cb2 = new CheckBox();
        cb2.setText("Caso B");
        Button b3 = new Button("Aceptar");
        Label l4 = new Label();
        Label l5 = new Label();
        GridPane.setConstraints(cb1,0,8);
        grid.getChildren().add(cb1);
        GridPane.setConstraints(cb2,1,8);
        grid.getChildren().add(cb2);
        GridPane.setConstraints(b3,2,8);
        grid.getChildren().add(b3);
        GridPane.setConstraints(l4,3,8);
        grid.getChildren().add(l4);
        GridPane.setConstraints(l5,4,8);
        grid.getChildren().add(l5);

        b3.setOnAction((ActionEvent event)->{
            boolean estadoCb1 = cb1.isSelected();
            l4.setText("Estado de cb1: " + estadoCb1);
            boolean estadoCb2 = cb2.isSelected();
            l5.setText("Estado de cb2: " + estadoCb2);
        });

        ChoiceBox<String> choice1 = new ChoiceBox<String>(FXCollections.observableArrayList("Caso A", "Caso B", "Caso C"));
        GridPane.setConstraints(choice1,0,9);
        grid.getChildren().add(choice1);






    }

    public static void main(String[] args) {
        launch();
    }
}