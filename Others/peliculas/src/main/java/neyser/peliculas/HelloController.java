package neyser.peliculas;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HelloController {
    @FXML
    private Label label1, label2, label3, label4;
    @FXML
    private Button button1, button2;
    private List<List<String>> peliculas = new ArrayList<>();
    private List<String> titulos = new ArrayList<>();
    @FXML
    private ChoiceBox choiceBox1;
    @FXML
    protected void onF1()
    {
        agregarPeliculas();
    }
    @FXML
    protected void onF2()
    {
        int posicion = choiceBox1.getSelectionModel().selectedIndexProperty().getValue();
        label1.setText("Pelicula: "+ peliculas.get(posicion).get(0));
        label2.setText("Director: "+ peliculas.get(posicion).get(1) );
        label3.setText("Protagonista: "+ peliculas.get(posicion).get(2) );
        label4.setText("Año: "+ peliculas.get(posicion).get(3) );
    }
    protected void agregarPeliculas()
    {
        peliculas.add(Arrays.stream(new String[]{"Avatar","James Cameron","Sam Worthington","2009"}).toList());
        peliculas.add(Arrays.stream(new String[]{"Avengers","Anthony Russo","Chris Evans","2019"}).toList());
        peliculas.add(Arrays.stream(new String[]{"Black Panther","Ryan Coogler","Chadwick Boseman","2018"}).toList());
        peliculas.add(Arrays.stream(new String[]{"The Pink Panter","concert","Detectiv","2000"}).toList());

        obtenerTitulos();

        choiceBox1.setItems(FXCollections.observableArrayList(titulos));
        choiceBox1.getSelectionModel().selectFirst();
        choiceBox1.setVisible(true);
        button1.setVisible(false);
        button2.setVisible(true);
    }

    protected void obtenerTitulos(){
        for (int i = 0; i < peliculas.size(); i++) {
            titulos.add(peliculas.get(i).get(0));
        }
    }
}