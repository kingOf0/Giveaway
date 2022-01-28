module com.kingof0.giveaway {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.kingof0.giveaway to javafx.fxml;
    exports com.kingof0.giveaway;
}