package neyser.ejemplocombobox;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label label1;
    @FXML
    private ChoiceBox choiseBox1;
    @FXML
    private Button button1;
    @FXML
    protected void onF1()
    {
        // Obtener el elemento seleccionado
        // label1.setText(choiseBox1.getValue().toString());
        // Obtener la lista completa
        // label1.setText(choiseBox1.getItems().toString());
        // Añadir 1 nuevo elemento
        // choiseBox1.getItems().add("Jueves");
        // Obtener un elemento desde su posición
        // label1.setText(choiseBox1.getItems().get(1).toString());
        // Añadir un grupo de elementos y quitar los anteriores
        String months1[] = {"Enero","Febrero","Marzo"};
        choiseBox1.setItems(FXCollections.observableArrayList(months1));
        // label1.setText(choiseBox1.getItems().toString());
        // choiseBox1.getSelectionModel().select(0);
        // choiseBox1.getSelectionModel().selectFirst();
        // choiseBox1.setValue(choiseBox1.getItems().get(2));
        choiseBox1.setValue("Seleccione un elemento");

    }
}