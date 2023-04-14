package neyser.ejemplocheckbox;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class HelloController
{
    @FXML
    private Label label1;
    @FXML
    private CheckBox checkBox1;

    @FXML
    protected void onF1()
    {
        if (checkBox1.isSelected())
        {
            label1.setText("Seleccionado");
        } else
        {
            label1.setText("No Seleccionado");
        }
    }
}