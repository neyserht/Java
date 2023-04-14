package com.example.tareacoches;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 600);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();


        ComboBox comboBox1 = new ComboBox();
        ComboBox comboBox2 = new ComboBox();
        ComboBox comboBox3 = new ComboBox();
        Label l1= new Label();

        ObservableList<String> combustibles = FXCollections.observableArrayList
                (
                        "gasolina","gasoil","electrico"
                );


    comboBox1.setItems(combustibles);

       ObservableList<String> marca = FXCollections.observableArrayList
                (
                        "Ford","Toyota","Tesla"
                );
                //comboBox2.setItems(marca);
       /*
        ObservableList<String> modelo = FXCollections.observableArrayList
                (
                        "gasolina","gasoil","electrico"
                );

        comboBox3.setItems(modelo);
        */


        ArrayList<Coche> coches = new ArrayList<Coche>();
        coches.add(new Coche("gasolina","Ford","Focus",25000));
        coches.add(new Coche("gasoil","Ford","Focus",26000));
        coches.add(new Coche("gasolina","Ford","Mustang",40000));
        coches.add(new Coche("electrico","Ford","Mustang",42000));
        coches.add(new Coche("gasolina","Toyota","Corolla",25000));
        coches.add(new Coche("electrico","Toyota","bz4x",38000));
        coches.add(new Coche("electrico","Tesla","model 3",50000));
        coches.add(new Coche("electrico","Tesla","model y",60000));

        comboBox1.setOnAction(e ->{
            if (comboBox1.getSelectionModel().getSelectedIndex()!=-1){
                comboBox2.getItems().clear();
                comboBox3.getItems().clear();
                ArrayList<String> lista = new ArrayList<>(buscarValor(2,comboBox1.getValue().toString(), coches));
                System.out.println(lista);
                lista.forEach(i->comboBox2.getItems().add(i));
            }

        });
        comboBox2.setOnAction(e->{
            if (comboBox2.getSelectionModel().getSelectedIndex()!=-1){
                comboBox3.getItems().clear();
                ArrayList<String> lista = new ArrayList<>(buscarValor(3,comboBox2.getValue().toString(), coches));
                System.out.println(lista);
                lista.forEach(i->comboBox3.getItems().add(i));
            }
            
        });

        /*comboBox1.setOnAction(e -> {
            comboBox2.getItems().clear();
            comboBox3.getItems().clear();
            for(Coche coche: coches)
            {
                if(coche.combustible.contains(comboBox1.getValue().toString()))
                {
                    System.out.println(comboBox1.getValue().toString() +"|" +coche.marca + "|" + coche.modelo);
                    //comboBox2.getItems().add(coche.marca);
                    comboBox2.getItems().add(coche.marca);
                    if (comboBox2.getSelectionModel().getSelectedIndex()!=-1){
                        if(coche.marca.contains(comboBox2.getValue().toString()))
                        {
                            comboBox3.getItems().add(coche.modelo);
                            System.out.println(comboBox2.getValue() + "|" + coche.marca);
                        }
                    }
                }

            }

            System.out.println("---------------------------------");
        });
        */

        //hacemos la estructura grid
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(15,15,15,15));
        grid.setVgap(5);
        grid.setHgap(5);
        //añadimos los controles
        GridPane.setConstraints(comboBox1, 0,0);
        grid.getChildren().add(comboBox1);
        GridPane.setConstraints(comboBox2, 0,1);
        grid.getChildren().add(comboBox2);
        GridPane.setConstraints(comboBox3, 0,3);
        grid.getChildren().add(comboBox3);
        // Añadir el grid a la escena
        scene.setRoot(grid);




    }

    public ArrayList buscarValor(int tipo, String texto, ArrayList<Coche> coches){
        ArrayList<String> resultado = new ArrayList<>();
        switch (tipo){
            case 1: // Combustible
                coches.stream()
                    .forEach(
                            e -> {
                                if (e.combustible.equalsIgnoreCase(texto)) {
                                    resultado.add(e.combustible);
                                }
                            }
                    );
                break;
            case 2: // Marca
                coches.stream()
                        .forEach(
                                e -> {
                                    if (e.combustible.equalsIgnoreCase(texto)) {
                                        resultado.add(e.marca);
                                    }
                                }
                        );
                break;
            case 3: // Modelo
                coches.stream()
                        .forEach(
                                e -> {
                                    if (e.marca.equalsIgnoreCase(texto)) {
                                        resultado.add(e.modelo);
                                    }
                                }
                        );
                break;
            case 4: // Precio
                coches.forEach(e -> resultado.add(String.valueOf(e.precio)));
                break;
        }
        return resultado;
    }

    public static void main(String[] args)
    {
        launch();
    }
}