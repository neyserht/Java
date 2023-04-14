package neyser.ejemplotooglebutton;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;

public class HelloController {
    @FXML
    private Label label1;
    @FXML
    ToggleButton toggleButton1;

    @FXML
    protected void onF1()
    {
        if (toggleButton1.isSelected()){
            label1.setText("Opción seleccionada");
        } else
        {
            label1.setText("Opción no seleccionada");
        }
    }
}