module neyser.conversor {
    requires javafx.controls;
    requires javafx.fxml;


    opens neyser.conversor to javafx.fxml;
    exports neyser.conversor;
}