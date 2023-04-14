package neyser.combustible;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class HelloController {
    // Declaracion de mapas o diccionarios

    private int selector = 0;

    // Crear Lista
    ArrayList<Combustibles> combustibles = new ArrayList<>();
    ArrayList<String> marcas1 = new ArrayList<>();
    ArrayList<Marcas> marcas = new ArrayList<>();
    ArrayList<Modelos> modelos = new ArrayList<>();

    @FXML
    private Label welcomeText;
    @FXML
    private ComboBox comboBox1, comboBox2, comboBox3;


    @FXML
    protected void f1()
    {
        // Poblar combustible
        combustibles.add(new Combustibles("gasolina"));

        marcas1.add("Ford");
        marcas1.add("Toyota");
        marcas1.add("Tesla");


        modelos.add(new Modelos("Focus",new Marcas("Ford",new Combustibles("gasolina"))));
        modelos.add(new Modelos("Mustang",new Marcas("Ford",new Combustibles("eléctrico"))));
        modelos.add(new Modelos("Corolla",new Marcas("Toyota",new Combustibles("gasolina"))));
        modelos.add(new Modelos("bz4x",new Marcas("Toyota",new Combustibles("eléctrico"))));
        modelos.add(new Modelos("model 3",new Marcas("Tesla",new Combustibles("eléctrico"))));
        modelos.add(new Modelos("model Y",new Marcas("Tesla",new Combustibles("eléctrico"))));

        System.out.println(marcas1);

        comboBox2.setItems(FXCollections.observableArrayList(marcas1));

        if (comboBox1.getValue().toString().equals(comboBox1.getItems().get(0).toString()))
        {
            comboBox2.setItems(FXCollections.observableArrayList(modelos.toArray()));
            // test
            selector = 0;

            
        }


    }
    @FXML
    protected void f2()
    {
    }

}