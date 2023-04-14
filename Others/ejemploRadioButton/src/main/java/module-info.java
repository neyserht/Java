module neyser.ejemploradiobutton {
    requires javafx.controls;
    requires javafx.fxml;


    opens neyser.ejemploradiobutton to javafx.fxml;
    exports neyser.ejemploradiobutton;
}