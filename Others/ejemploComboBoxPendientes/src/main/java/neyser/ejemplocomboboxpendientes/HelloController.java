package neyser.ejemplocomboboxpendientes;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class HelloController {
    @FXML
    private Label label1;
    @FXML
    private ComboBox comboBox1, comboBox2;
    @FXML
    private Button button1;
    ArrayList<Cerveza> cervezas = new ArrayList<>();
    @FXML
    protected void onF1()
    {
        // Limpiar el ComboBox
        comboBox2.getItems().clear();
        // Volcar vuelta a vuelta los objetos de la ArrayList cervezas en el Objeto
        // Cerveza paa cargar los elementos en el ComboBox2
        // Dependiendo de lo seleccionado en ComboBox1

        for (Cerveza cerveza: cervezas)
        {
            // Si el atributo tipo cerveza coincide co el elemento seleccionado del
            // comboBox 1 ...
            if (cerveza.tipoCerveza.equalsIgnoreCase(comboBox1.getValue().toString()))
            {
                // añadir a comboBox2 el atributo "nombrecerveza"
                comboBox2.getItems().add(cerveza.nombreCerveza);
                // Establecer el primer elemento del comboBox2 como el valor  po defecto
                comboBox2.getSelectionModel().selectFirst();
            }
        }
    }
    @FXML
    protected void onF2()
    {
        Integer indicador  = comboBox1.getSelectionModel().getSelectedIndex();
            if (indicador == -1)
            {
                label1.setText("Debe Seleccionar un tipo de cerveza");
                label1.setBackground(Background.fill(Color.web("#e74c3c",1.0)));
            }
            else
            {
                for (Cerveza cerveza2: cervezas)
                {
                    // Si el atributo tipo cerveza coincide co el elemento seleccionado del
                    // comboBox 1 ...
                    if (cerveza2.nombreCerveza.equalsIgnoreCase(comboBox2.getValue().toString()))
                    {
                        // añadir a comboBox2 el atributo "nombrecerveza"
                        label1.setText(cerveza2.pvpCerveza + " €");
                        label1.setBackground(Background.fill(Color.web("#3498db",1.0)));
                    }
                }
            }
    }
    @FXML
    protected  void cargarCervezas1()
    {
        cervezas.add(new Cerveza("Rubia","Mahou",1.00));
        cervezas.add(new Cerveza("Rubia","Amstel",1.50));
        cervezas.add(new Cerveza("Rubia","Alambra",1.70));
        cervezas.add(new Cerveza("Tostada","Mahou Maestra",2.00));
        cervezas.add(new Cerveza("Tostada","Amstel Oro",2.50));
        cervezas.add(new Cerveza("Tostada","Alambra Roja",2.70));
        cervezas.add(new Cerveza("Negra","Ginness",3.00));
        cervezas.add(new Cerveza("Negra","Leffe negra",3.50));
        cervezas.add(new Cerveza("Negra","1906 Black",3.70));
    }
    @FXML
    protected void initialize()
    {
        // Cagar las cervezas al iniciar la aplicación a traves del método initialize
        cargarCervezas1();
    }
}