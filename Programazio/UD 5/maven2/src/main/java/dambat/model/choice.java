package dambat.model;
import dambat.model.Herriak;
import java.io.IOException;

import dambat.App;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.HBox;

public class choice {
    Herriak atzipena = new Herriak();
    private String[] herriak= atzipena.irakurriDatuAnitzak();
    @FXML
    private HBox nongoa;
    @FXML
    private HBox gustura;
    
    @FXML
    public void initialize(){
    
    create();

    }
    @FXML
    public void create(){
        
        
        ChoiceBox<String> a = new ChoiceBox<String>();
        ChoiceBox<String> b = new ChoiceBox<String>();
        a.getItems().addAll(herriak);
        b.getItems().addAll(herriak);
        nongoa.getChildren().addAll(a);
        gustura.getChildren().addAll(b);
    }
    public void stage() throws IOException{
        App.setRoot("menu");
    }
}
