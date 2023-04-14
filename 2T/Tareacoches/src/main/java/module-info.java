module com.example.tareacoches {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tareacoches to javafx.fxml;
    exports com.example.tareacoches;
}