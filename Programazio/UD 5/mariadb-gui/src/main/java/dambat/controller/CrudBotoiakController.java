package dambat.controller;

import java.io.IOException;

import dambat.model.Herriak;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CrudBotoiakController {
    Herriak atzipena = new Herriak();
    String[] herriak=atzipena.irakurriDatuAnitzak();
    @FXML
    TextField bat,bi,hiru,lau;
    @FXML
    private void select() throws IOException {
        
        for (int index = 0; index < herriak.length; index++) {
            System.out.println(herriak[index]);
        }
    }
    
    @FXML
    private void count() throws IOException {
        atzipena.irakurriDatuBakarra();
    }
    @FXML
    private void insert() throws IOException {
        atzipena.txertatu(bat.getText());
        atzipena.irakurriDatuAnitzak();
    }
    @FXML
    private void update() throws IOException {
        atzipena.ezabatu(bi.getText());
        atzipena.txertatu(hiru.getText());
    }
    @FXML
    private void delete() throws IOException {
        atzipena.ezabatu(lau.getText());
    }
}
