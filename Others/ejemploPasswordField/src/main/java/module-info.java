module neyser.ejemplopasswordfield {
    requires javafx.controls;
    requires javafx.fxml;


    opens neyser.ejemplopasswordfield to javafx.fxml;
    exports neyser.ejemplopasswordfield;
}