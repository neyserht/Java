module neyser.ejemplocombobox {
    requires javafx.controls;
    requires javafx.fxml;


    opens neyser.ejemplocombobox to javafx.fxml;
    exports neyser.ejemplocombobox;
}