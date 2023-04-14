module neyser.saludardespedir {
    requires javafx.controls;
    requires javafx.fxml;


    opens neyser.saludardespedir to javafx.fxml;
    exports neyser.saludardespedir;
}