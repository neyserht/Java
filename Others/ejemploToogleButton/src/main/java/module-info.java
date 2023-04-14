module neyser.ejemplotooglebutton {
    requires javafx.controls;
    requires javafx.fxml;


    opens neyser.ejemplotooglebutton to javafx.fxml;
    exports neyser.ejemplotooglebutton;
}