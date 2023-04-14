package neyser.demofx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onSaludar() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML
    private Button b2;
    @FXML
    protected void f1()
    {
        b2.setText("Pulsado");
    }
    @FXML
    private Label l2;
    @FXML
    private CheckBox cb1;
    @FXML
    protected void f2()
    {
        if (cb1.isSelected())
        {
            l2.setText("Seleccionado");
        } else{
            l2.setText("No Seleccionado");
        }
    }

}