module neyser.peliculas {
    requires javafx.controls;
    requires javafx.fxml;


    opens neyser.peliculas to javafx.fxml;
    exports neyser.peliculas;
}