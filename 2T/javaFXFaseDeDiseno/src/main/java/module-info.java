module com.example.javafxfasedediseno {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxfasedediseno to javafx.fxml;
    exports com.example.javafxfasedediseno;
}