package neyser.ejemploradiobutton;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class HelloController {
    @FXML
    private Label label1;
    @FXML
    private RadioButton radioButton1, radioButton2;
    @FXML
    private ToggleGroup group1;

    @FXML
    protected void onF1()
    {
        //Obtener la referencia del radioButon seleccionado
        RadioButton selectedRadioButton = (RadioButton) group1.getSelectedToggle();

        //Obtener el texto del radioButon seleccionado
        String selectedTextRadioButton = selectedRadioButton.getText();

        //Imprimir en la etiqueta el texto del radiobutton seleccionado
        label1.setText(selectedTextRadioButton);

    }
}