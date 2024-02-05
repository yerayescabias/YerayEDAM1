package dambat;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PrimaryController {
    private int cont=0;
    @FXML
    private Label Kontadorea;
;


    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    @FXML
    private void suma() throws IOException{
        ++cont;
        Kontadorea.setText(String.valueOf(cont));
    }
}
