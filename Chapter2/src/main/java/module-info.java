module com.example.chapter2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.json;
    requires org.apache.commons.io;


    opens com.example.chapter2 to javafx.fxml;
    exports com.example.chapter2;
}