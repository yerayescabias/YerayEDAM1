package dambat.model;



import java.io.IOException;

import dambat.App;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class view {
    Herriak atzipena= new Herriak();
    private String[] herriak= atzipena.irakurriDatuAnitzak();

    @FXML
    private TableView chinito; 
    @FXML
    private TextField txera; 
    
    @FXML
    private void initialize(){
        colum();
        info();
    }
    @FXML
    private void colum(){

    TableColumn<Herriak, String> column1 = new TableColumn<>("Herria");
    column1.setCellValueFactory(new PropertyValueFactory<>("herria"));
        chinito.getColumns().add(column1);
    }

    @FXML
    private void info(){
        for (int index = 0; index < herriak.length; index++) {
            chinito.getItems().add(new Herriak (herriak[index]));
        }
        
        
    }
    @FXML
    private void txertatu(){
        atzipena.txertatu(txera.getText());
        
        
    }
    @FXML
    public void stage() throws IOException{
        App.setRoot("menu");
    }
}
