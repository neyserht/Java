module neyser.combustible {
    requires javafx.controls;
    requires javafx.fxml;


    opens neyser.combustible to javafx.fxml;
    exports neyser.combustible;
}