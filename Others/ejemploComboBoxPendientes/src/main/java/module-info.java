module neyser.ejemplocomboboxpendientes {
    requires javafx.controls;
    requires javafx.fxml;


    opens neyser.ejemplocomboboxpendientes to javafx.fxml;
    exports neyser.ejemplocomboboxpendientes;
}