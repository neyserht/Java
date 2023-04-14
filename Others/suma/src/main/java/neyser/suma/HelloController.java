package neyser.suma;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class HelloController {
    @FXML
    private Label label1;

    @FXML
    private TextField textField1, textField2;
    @FXML
    private Button button1;

    @FXML
    protected void onSumar()
    {
        if (isNumeric(textField1.getText()) && isNumeric(textField2.getText())){
            Double resultado = Double.parseDouble(textField1.getText())+Double.parseDouble(textField2.getText());
            label1.setText(resultado.toString());
            label1.setTextFill(Color.web("#000000",1.0));
            limpiarTextfield();
        }
    }

    @FXML
    protected boolean isNumeric(String texto)
    {
        boolean validacion = true;
        Double numero;

        try
        {
            numero = Double.parseDouble(texto);
        } catch (Exception e)
        {
            label1.setText("Error al convertir: "+texto);
            label1.setTextFill(Color.web("#FF0000",1.0));
            limpiarTextfield();
            validacion  = false;
        }
        return  validacion;
    }

    protected void limpiarTextfield()
    {
        textField1.clear();
        textField2.clear();
    }

}