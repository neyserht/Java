package neyser.ejemplotogglebuttongroup;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;

public class HelloController {
    @FXML
    private Label label1;
    @FXML
    private ToggleButton toggleButton1, toggleButton2, toggleButton3;
        @FXML
    protected void onF1()
    {
        if (toggleButton1.isSelected())
        {
            label1.setText(toggleButton1.getText());
        } else if (toggleButton2.isSelected())
        {
            label1.setText(toggleButton2.getText());
        } else if (toggleButton3.isSelected())
        {
            label1.setText(toggleButton3.getText());
        } else
        {
            label1.setText("Turno no seleccionado");
        }
    }
}