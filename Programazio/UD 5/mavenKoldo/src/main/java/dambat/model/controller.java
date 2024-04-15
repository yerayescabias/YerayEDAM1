package dambat.model;
import dambat.model.Herriak;
import java.io.IOException;

import dambat.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;



public class controller {
    private Herriak atzipena= new Herriak();
    private String[] herriak= atzipena.irakurriDatuAnitzak();
    @FXML
    private HBox hbo;
    @FXML
    private Label aukeratutakoak;
    @FXML
    private Label gainontzekoak;
    @FXML
    private CheckBox[] chekxbox= new CheckBox[herriak.length];
   

    @FXML
    public void initialize(){

    checkbox();
    textua();
    }
    
    
    @FXML
    private void checkbox(){
        
        
        for(int i=0;i<herriak.length;i++){
            CheckBox x=new CheckBox();
            hbo.getChildren().addAll(x);
            x.setText(herriak[i]+"\t\n");
            x.setOnAction(ActionEvent-> textua());
            chekxbox[i]=x;

        }
    }
    @FXML
    private void textua(){
        int cont=0;
        int count=4;
        for(int i=0;i<4;i++){
            if(chekxbox[i].isSelected() ){
                cont++;
                count--;
                
            }
            if(i>=4){
                i=0;
            }
        }
        aukeratutakoak.setText(String.valueOf(cont));
        gainontzekoak.setText(String.valueOf(count));
    }
    @FXML
    public void stage() throws IOException{
        App.setRoot("menu");
    }
}
