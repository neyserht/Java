module neyser.ejemplotogglebuttongroup {
    requires javafx.controls;
    requires javafx.fxml;


    opens neyser.ejemplotogglebuttongroup to javafx.fxml;
    exports neyser.ejemplotogglebuttongroup;
}