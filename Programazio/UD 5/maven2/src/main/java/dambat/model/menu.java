package dambat.model;

import java.io.IOException;

import dambat.App;
import javafx.application.Platform;
import javafx.fxml.FXML;


public class menu {
    @FXML
    public void checkbox() throws IOException{
        App.setRoot("checkbox");

    }

    @FXML
    public void choice() throws IOException{
        App.setRoot("choice");

    }
    @FXML
    public void text() throws IOException{
        App.setRoot("text");

    }
    @FXML
    public void table() throws IOException{
        App.setRoot("table");

    }
    @FXML
    public void bye() throws IOException{
        Platform.exit();

    }

}
