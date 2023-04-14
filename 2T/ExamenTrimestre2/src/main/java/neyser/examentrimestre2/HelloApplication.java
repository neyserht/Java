package neyser.examentrimestre2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application {

    private String marcaSeleccionada;
    private String saborSeleccionado;
    private Integer cantidadHelados;
    private Double precioFinal = 0.0;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 600);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        // Creación del grid y adición al scene
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(5);
        grid.setHgap(5);
        scene.setRoot(grid);

        // Crear Helados
        //ingresarHelados();

        // Imagenes de Helados
        Image img1 = new Image(getClass().getResourceAsStream("/images/h01.png"));
        Image img2 = new Image(getClass().getResourceAsStream("/images/h02.png"));
        Image img3 = new Image(getClass().getResourceAsStream("/images/s01.png"));
        Image img4 = new Image(getClass().getResourceAsStream("/images/s02.png"));


        // Control Togglebutton Para elegir Marca de Helado
        //Togglebutton
        ToggleButton tbh1 = new ToggleButton("Häagen-Dazs", new ImageView(img1));
        //Togglebutton
        ToggleButton tbh2 = new ToggleButton("Ben & Jerry's", new ImageView(img2));
        // Crear el grupo Togglebutton
        final ToggleGroup tgrupo1 = new ToggleGroup();
        // Agrupamieno de ToggleButton
        tbh1.setToggleGroup(tgrupo1);
        tbh2.setToggleGroup(tgrupo1);

        // Mostrar Helado Elegido
        Label lblHelado = new Label("Marca sin elegir");


        // Control Togglebutton Para elegir Sabor de Helado
        //Togglebutton
        ToggleButton tbs1 = new ToggleButton("fresa", new ImageView(img3));
        //Togglebutton
        ToggleButton tbs2 = new ToggleButton("chocolate", new ImageView(img4));
        // Crear el grupo Togglebutton
        final ToggleGroup tgrupo2 = new ToggleGroup();
        // Agrupamieno de ToggleButton
        tbs1.setToggleGroup(tgrupo2);
        tbs2.setToggleGroup(tgrupo2);

        // Mostrar Helado Elegido
        Label lblSabor = new Label("Sabor sin elegir");

        // Boton Para agregar Helados
        Button btnAgregar = new Button("Agregar");

        // Lista de Helados Elegidos
        ListView<String> listHelados = new ListView<>();
        listHelados.setCellFactory(TextFieldListCell.forListView());
        listHelados.setEditable(true);
        listHelados.setMinWidth(450.0);
        listHelados.getItems().add("Marca\t\tSabor\t\tTamanio\t\tPrecio\t\tCantidad");

        // Label de Alerta
        Label mensaje = new Label();

        // Cantidad de Helados
        Spinner spCantidad = new Spinner();
        SpinnerValueFactory<Integer> valSpinnerCantidad = new SpinnerValueFactory.IntegerSpinnerValueFactory(1,20,1);
        spCantidad.setValueFactory(valSpinnerCantidad);

        // Label de Alerta
        Label lblPrecioFinal = new Label();



        // Acciones de Controles

        tbh1.setOnAction((ActionEvent e)->{
            mensaje.setText("");
            marcaSeleccionada = tbh1.getText();
            lblHelado.setText("Marca: "+marcaSeleccionada);
            System.out.println("Marca: "+marcaSeleccionada + "\tSabor: " +saborSeleccionado);
            mensaje.setText("Precio: "+buscarPrecioHelado(ingresarHelados(),marcaSeleccionada,saborSeleccionado));
        });
        tbh2.setOnAction((ActionEvent e)->{
            mensaje.setText("");
            marcaSeleccionada = tbh2.getText();
            lblHelado.setText("Marca: "+marcaSeleccionada);
            System.out.println("Marca: "+marcaSeleccionada + "\tSabor: " +saborSeleccionado);
            mensaje.setText("Precio: "+buscarPrecioHelado(ingresarHelados(),marcaSeleccionada,saborSeleccionado));
        });

        tbs1.setOnAction((ActionEvent e)->{
            mensaje.setText("");
            saborSeleccionado = tbs1.getText();
            lblSabor.setText("Sabor: "+saborSeleccionado);
            System.out.println("Marca: "+marcaSeleccionada + "\tSabor: " +saborSeleccionado);
            mensaje.setText("Precio: "+buscarPrecioHelado(ingresarHelados(),marcaSeleccionada,saborSeleccionado));
        });

        tbs2.setOnAction((ActionEvent e)->{
            mensaje.setText("");
            saborSeleccionado = tbs2.getText();
            lblSabor.setText("Sabor: "+saborSeleccionado);
            System.out.println("Marca: "+marcaSeleccionada + "\tSabor: " +saborSeleccionado);
            mensaje.setText("Precio: "+buscarPrecioHelado(ingresarHelados(),marcaSeleccionada,saborSeleccionado));
        });

        // Agregar Helado Seleccionado
        btnAgregar.setOnAction((ActionEvent event) -> {
            mensaje.setText("");
            if (!tbh1.isSelected() && !tbh2.isSelected()){
                mensaje.setText("Debe Seleccioar una marca de Helado");
                mensaje.setTextFill(Color.web("#ff0000"));
            } else if(!tbs1.isSelected() && !tbs2.isSelected()){
                mensaje.setText("Debe Seleccioar un Sabor de Helado de Helado");
                mensaje.setTextFill(Color.web("#ff0000"));
            } else{
                cantidadHelados = (Integer)spCantidad.getValue();
                Double precio = cantidadHelados * buscarPrecioHelado(ingresarHelados(),marcaSeleccionada, saborSeleccionado);
                Integer tamanio = buscarTamanioHelado(ingresarHelados(),marcaSeleccionada, saborSeleccionado);
                listHelados.getItems().add(marcaSeleccionada + "\t\t" + saborSeleccionado +"\t\t"+ tamanio+"\t\t\t" + Math.round(precio)+"\t\t\t"+cantidadHelados);
                precioFinal+=precio;
                lblPrecioFinal.setText("Precio Total: "+ precioFinal.toString());

                System.out.println("Marca: "+marcaSeleccionada + "\tSabor: " +saborSeleccionado + "\tTamaño: "+tamanio+"\tPrecio: "+precio);

                spCantidad.setValueFactory(valSpinnerCantidad);
                tbh1.setSelected(false);
                tbh2.setSelected(false);
                tbs1.setSelected(false);
                tbs2.setSelected(false);
                lblHelado.setText("");
                lblSabor.setText("");
                spCantidad.setValueFactory(valSpinnerCantidad);
            }
        });




        // Agregar controles a GridPane
        GridPane.setConstraints(tbh1, 0, 0);
        GridPane.setConstraints(tbh2, 0, 1);
        GridPane.setConstraints(lblHelado, 0, 2);
        GridPane.setConstraints(tbs1, 0, 3);
        GridPane.setConstraints(tbs2, 0, 4);
        GridPane.setConstraints(lblSabor, 0, 5);
        GridPane.setConstraints(mensaje, 0, 6);
        GridPane.setConstraints(btnAgregar, 0, 7);
        GridPane.setConstraints(listHelados, 0, 8);
        GridPane.setConstraints(spCantidad, 0, 9);
        GridPane.setConstraints(lblPrecioFinal, 0, 10);




        grid.getChildren().addAll(tbh1, tbh2, lblHelado, tbs1, tbs2, lblSabor, mensaje, btnAgregar, listHelados, spCantidad, lblPrecioFinal);



    }


    public ArrayList<Helados>  ingresarHelados(){
        ArrayList<Helados> helados = new ArrayList<>();
        helados.add(new Helados("Häagen-Dazs","fresa",250,2.5));
        helados.add(new Helados("Häagen-Dazs","chocolate",250,2.6));
        helados.add(new Helados("Ben & Jerry's","fresa",250,2.7));
        helados.add(new Helados("Häagen-Dazs","chocolate",250,2.8));

        return helados;
    }

    public Double buscarPrecioHelado(ArrayList<Helados> helados, String marca, String sabor){
        Double precio = 0.0;
        for (Helados helado: helados) {
            if (helado.getMarca().equalsIgnoreCase(marca) && helado.getSabor().equalsIgnoreCase(sabor)){
                precio = helado.getPrecio();
            }
        }
        return precio;
    }

    public Integer buscarTamanioHelado(ArrayList<Helados> helados, String marca, String sabor){
        Integer tamanio = 0;
        for (Helados helado: helados) {
            if (helado.getMarca().equalsIgnoreCase(marca) && helado.getSabor().equalsIgnoreCase(sabor)){
                tamanio = helado.getTamanio();
            }
        }
        return tamanio;
    }

    public static void main(String[] args) {
        launch();
    }
}