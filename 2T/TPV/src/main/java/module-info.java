module neyser.tpv {
    requires javafx.controls;
    requires javafx.fxml;


    opens neyser.tpv to javafx.fxml;
    exports neyser.tpv;
}