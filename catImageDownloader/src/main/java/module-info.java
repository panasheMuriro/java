module com.example.catimagedownloader {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.net.http;

    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;

//    requires com.fasterxml.jackson.core
//    requires com.fasterxml.jackson.databind; // Jackson Databind dependency


//    requires javafx.fxml;
//    requires com.fasterxml.jackson.annotation; // Add this line
//    requires java.net.http;

    opens com.example.catimagedownloader to javafx.fxml;
    exports com.example.catimagedownloader;
}