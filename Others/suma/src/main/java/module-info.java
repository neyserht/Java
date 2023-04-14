module neyser.suma {
    requires javafx.controls;
    requires javafx.fxml;


    opens neyser.suma to javafx.fxml;
    exports neyser.suma;
}