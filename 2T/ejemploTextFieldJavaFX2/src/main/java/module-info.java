module neyser.ejemplotextfieldjavafx2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens neyser.ejemplotextfieldjavafx2 to javafx.fxml;
    exports neyser.ejemplotextfieldjavafx2;
}