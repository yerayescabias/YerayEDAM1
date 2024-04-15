module dambat {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens dambat to javafx.fxml;
    opens dambat.model to javafx.fxml;
 
    exports dambat;    

    exports dambat.model;

}
