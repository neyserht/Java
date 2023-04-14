module neyser.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens neyser.demo to javafx.fxml;
    exports neyser.demo;
}