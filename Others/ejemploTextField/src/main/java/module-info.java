module neyser.ejemplotextfield {
    requires javafx.controls;
    requires javafx.fxml;


    opens neyser.ejemplotextfield to javafx.fxml;
    exports neyser.ejemplotextfield;
}