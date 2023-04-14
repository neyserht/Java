module neyser.textfieldjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens neyser.textfieldjavafx to javafx.fxml;
    exports neyser.textfieldjavafx;
}