module com.zem.javadesktopdemo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.zem.javadesktopdemo to javafx.fxml;
    exports com.zem.javadesktopdemo;
}