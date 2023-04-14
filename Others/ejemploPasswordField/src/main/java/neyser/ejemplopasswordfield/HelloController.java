package neyser.ejemplopasswordfield;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label labelResultado;

    @FXML
    private Button button1;

    @FXML
    private TextField val1, val2;

    @FXML
    protected void onSumar() {
        Double resultado = 0.0;
        resultado = Double.parseDouble(val1.getText())+Double.parseDouble(val2.getText());
        labelResultado.setText(resultado.toString());
        val1.clear();
        val2.clear();
    }

    public boolean isNumeric(String texto)
    {
        boolean r1 = true;
        try{
            Double.parseDouble(texto);
        }catch (Exception e){
            r1=false;
        }
        return r1;
    }
    
}