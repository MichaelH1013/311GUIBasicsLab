module com.example.csc311_gui_basicslab {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.csc311_gui_basicslab to javafx.fxml;
    exports com.example.csc311_gui_basicslab;
}