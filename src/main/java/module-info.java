module sn.dev.userapp1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens sn.dev.userapp1 to javafx.fxml;
    exports sn.dev.userapp1;
}