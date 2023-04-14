package neyser.tpv;

import javafx.application.Application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application {

    // Creacion de Bebidas
    ArrayList<Bebidas> bebidas = new ArrayList<>();
    Double carrito = 0.0;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 600);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        // Creación del grid y adición al scene
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(5);
        grid.setHgap(5);
        scene.setRoot(grid);

        // Agregar bebidas
        bebidas.add(new Bebidas("Coca Cola",5.0));
        bebidas.add(new Bebidas("Pepsi Cola",10.0));

        // Crear Control comboBox
        ComboBox cb1 = new ComboBox();
        bebidas.forEach(e -> cb1.getItems().add(e.getNombre()));

        // Crear Control Label
        Label l1 = new Label();

        // Crear Boto paa agregar Bebida
        Button b1 = new Button("Agregar");



        // ListView
        ListView<String> list1 = new ListView<>();
        list1.setCellFactory(TextFieldListCell.forListView());
        list1.setEditable(true);

        // Control Total
        Label l2 = new Label();

        // Control Total
        Label l3 = new Label();

        // TextField
        TextField t1 = new TextField();


        // Acciones de los controles

        // Mostrar Precio de Bebida en Label
        cb1.setOnAction((e) -> {
            if (cb1.getSelectionModel().getSelectedIndex()==-1){
                l3.setText("Debe Ingresar una bebida");
                l3.setTextFill(Color.web("#ff0000"));
            } else{
                l1.setText(buscarPrecioBebida(cb1.getValue().toString()).toString());
            }

        });

        ObservableList<String> encabezado = FXCollections.observableArrayList(
                "Producto\t|\tCantidad\t|\tPrecio"
        );
        list1.setItems(encabezado);



        b1.setOnAction((ActionEvent event) -> {
            if (t1.getText().isEmpty()){
                l3.setText("Debe Ingresar una cantidad Valida");
                l3.setTextFill(Color.web("#ff0000"));
            } else{
                l3.setText("");
                String producto = cb1.getValue().toString();
                Integer cantidad = Integer.parseInt(t1.getText());
                Double precio = buscarPrecioBebida(producto)*cantidad;
                list1.getItems().add(producto + "\t|\t" + cantidad + "\t|\t" + precio);
                carrito+=precio;
                l2.setText(carrito.toString());
                t1.clear();
            }
        });


        // Agregar bebida






        // Agregar controles a GridPane
        GridPane.setConstraints(cb1, 0, 1);
        GridPane.setConstraints(l1, 0, 2);
        GridPane.setConstraints(b1, 0, 3);
        GridPane.setConstraints(list1, 0, 4);
        GridPane.setConstraints(t1, 0, 5);
        GridPane.setConstraints(l2, 0, 6);
        GridPane.setConstraints(l3, 0, 0);

        grid.getChildren().addAll(cb1, l1, b1, list1, t1, l2, l3);

    }

    public Double buscarPrecioBebida(String bebida){
        Double precio = 0.0;
        for (Bebidas b: bebidas) {
            if (bebida.equalsIgnoreCase(b.getNombre())){
                precio = b.getPrecio();
            }
        }
        return precio;
    }

    public static void main(String[] args) {
        launch();
    }
}