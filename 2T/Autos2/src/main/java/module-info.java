module neyser.autos2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens neyser.autos2 to javafx.fxml;
    exports neyser.autos2;
}