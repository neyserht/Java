module neyser.ejemplocheckbox {
    requires javafx.controls;
    requires javafx.fxml;


    opens neyser.ejemplocheckbox to javafx.fxml;
    exports neyser.ejemplocheckbox;
}