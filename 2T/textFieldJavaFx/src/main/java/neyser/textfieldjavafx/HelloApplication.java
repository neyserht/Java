package neyser.textfieldjavafx;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException

    {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 600);
        stage.setTitle("Ejemplo TextField");
        stage.setScene(scene);
        stage.show();

        // Creación del grid y adición al scene
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(5);
        grid.setHgap(5);
        scene.setRoot(grid);

        // Creación de los controles
        Label l1 = new Label("Texto etiqueta");
        Label l2 = new Label();
        TextField t1 = new TextField();
        Button b1 = new Button("Aceptar");
        HBox h1 = new HBox();

        // Campo de texto para contraseñas
        PasswordField p1 = new PasswordField();
        // Barra de desplazamiento
        ScrollBar s1 = new ScrollBar();
        s1.setMin(0);
        s1.setMax(100);
        s1.setValue(50);
        // Separador
        // Separador horizontal
        Separator sep1 = new Separator();
        // Separador vertical
        Separator sep2 = new Separator();
        sep2.setOrientation(Orientation.VERTICAL);

        // Slider NOS HEMOS QUEDADO POR AQUÍ
        Slider sl1 = new Slider();

        // ListView
        ListView<String> list1 = new ListView<>();
        list1.setEditable(true);

        ObservableList<String> elementos1 = FXCollections.observableArrayList(
                "Caso A",
                "Caso B",
                "Caso C"
        );
        list1.setItems(elementos1);

        // ComboBox
        ObservableList<String>opciones1 = FXCollections.observableArrayList
                (
                        "Caso A", "Caso B", "Caso C"
                );
        final ComboBox cb1 = new ComboBox(opciones1);

        // Adición de l1 y t1 a h1
        h1.getChildren().addAll(l1, t1);
        h1.setSpacing(10);

        // ProgresBar
        ProgressBar pb1 = new ProgressBar(0.5);
        //System.out.println(sl1.getValue());
        // ProgresIndicator
        ProgressIndicator pi1 = new ProgressIndicator(0.5);


        // hiperlink
        Hyperlink enlace1 = new Hyperlink();
        enlace1.setText("htps://www.google.com");
        enlace1.setOnAction((ActionEvent event)->{
            System.out.println("Ha sido pulsado");
        });

        // TitlePane 1
        TitledPane tp1 = new TitledPane("Opciones 1", new Button("Opcion A"));

        // TitlePane 2
        TitledPane tp2 = new TitledPane();
        tp2.setText("Opciones 2");
        tp2.setContent(new Button("Opcion B"));
        tp2.setContent(new Button("Opcion C"));

        // Posicionamiento de los controles en el GridPane
        GridPane.setConstraints(h1, 0, 0);
        GridPane.setConstraints(b1, 1, 0);
        GridPane.setConstraints(l2, 0, 1);

        GridPane.setConstraints(p1, 2, 0);
        GridPane.setConstraints(s1, 3, 0);
        GridPane.setConstraints(list1, 0, 2);
        GridPane.setConstraints(sep1, 0, 3);
        GridPane.setConstraints(sep2, 0, 4);

        GridPane.setConstraints(cb1, 0, 5);
        GridPane.setConstraints(pb1, 0, 6);
        GridPane.setConstraints(pi1, 0, 7);
        GridPane.setConstraints(enlace1, 0, 8);
        GridPane.setConstraints(tp1, 0, 9);
        GridPane.setConstraints(tp2, 0, 10);

        // Adición de los controles al grid
        grid.getChildren().addAll(h1,b1, l2, p1, s1, list1, sep1, sep2, cb1, pb1, pi1, enlace1, tp1, tp2);

        // Evento del botón
        b1.setOnAction((ActionEvent e) -> {
            if(t1.getText() != null && t1.getText().isEmpty())
            {
                // t1 está vacío
                l1.setTextFill(Color.web("#ff0000"));
            }
            else
            {
                // t1 no está vacío
                l1.setTextFill(Color.web("#000000"));
                l2.setText(t1.getText());
                t1.setText("");
            }
        });

    }

    public static void main(String[] args) {
        launch();
    }
}