module neyser.demofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens neyser.demofx to javafx.fxml;
    exports neyser.demofx;
}