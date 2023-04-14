package neyser.saludardespedir;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class HelloController {
    @FXML
    private Label label1;

    @FXML
    protected void f1()
    {
        label1.setTextFill(Color.web("#FFF000",1.0));
        if (label1.getText().equalsIgnoreCase("Hola"))
        {
            label1.setText("Adios");
            // Cambia el Color a Negro
            label1.setTextFill(Color.web("#000000",1.0));
        }
        else
        {
            label1.setText("Hola");
            // Cambia el Color a Rojo
            label1.setTextFill(Color.web("#FF0000",1.0));
        }
    }
}