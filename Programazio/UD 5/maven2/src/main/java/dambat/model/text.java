package dambat.model;

import java.io.IOException;
import java.util.ArrayList;

import java.util.Iterator;

import dambat.App;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class text {
    private Herriak atzipena = new Herriak();
    private ArrayList<String> datuak= new ArrayList<String>();

    @FXML
    private TextArea area;

    @FXML
    public void initialize(){
    textua();
    }
    @FXML
    public void textua(){
        String te="";
        datuak.add(area.getText());
        Iterator<String> i = datuak.iterator();
        while(i.hasNext()){
            te=i.next();
        }
        String[] info=te.split(",");
        for(int a=0;a<info.length;a++){
            atzipena.txertatu(info[a]);
        }
    
    }
    @FXML
    public void stage() throws IOException{
        App.setRoot("menu");
    }
}
