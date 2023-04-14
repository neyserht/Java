module neyser.controlesjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens neyser.controlesjavafx to javafx.fxml;
    exports neyser.controlesjavafx;
}