package neyser.ejemplotextfield;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label label1;
    @FXML
    private TextField textField1;

    @FXML
    private Button button1;

    @FXML
    protected void onF1()
    {

        // Obtener del Textflied el texto contenido
        String v1 = textField1.getText();
        // Cargar el contenido de la variable en label1
        label1.setText(v1);
        // Asignar al textField un texto
        textField1.setText("Texto asignado");
        // Obtener del textField la longitud del texto contenido
        int v2 = textField1.getLength();
        // Limpia el contenido de textField
        textField1.clear();

    }
}