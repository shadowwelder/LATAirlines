module hashim.seventh.latairlines {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens hashim.seven.seven to javafx.fxml;
    exports hashim.seven.seven;
    exports hashim.seven;
    opens hashim.seven to javafx.fxml;
}