module eu.markurion.enchancedtodolist {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires java.sql;
    requires java.desktop;
    requires javafx.graphics;

    opens eu.markurion.enchancedtodolist to javafx.fxml;
    exports eu.markurion.enchancedtodolist;
}