package dambat.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import dambat.model.*;

public class a {
    @FXML
    protected  double lehena;
    @FXML
    protected double bigarrena;
    @FXML
    protected double emaitzaa;
    @FXML
    protected TextField lehenzenbakia;
    @FXML
    protected TextField biagarrenzenbakia;
    @FXML
    protected Label emaitza;
    @FXML
    protected Button operator;
    @FXML
    protected TextField zatikizuna1;
    @FXML
    protected TextField zatikizuna2;
    @FXML
    protected TextField zatitzaile1;
    @FXML
    protected TextField zatitzaile2;
    @FXML
    protected Label emaitza1;
    @FXML
    protected Label emaitza2;
    
    @FXML
    public void suma() throws IOException{
        lehena=Integer.parseInt(lehenzenbakia.getText());
        bigarrena=Integer.parseInt(biagarrenzenbakia.getText());
        
        if( operator.getText().equals("+")){
            emaitzaa=lehena+bigarrena;
            emaitza.setText(String.valueOf(emaitzaa)); 

        }else if ( operator.getText().equals("-")){
            emaitzaa=lehena-bigarrena;
            emaitza.setText(String.valueOf(emaitzaa)); 

        }else if ( operator.getText().equals("*")){
            emaitzaa=lehena *bigarrena;
            emaitza.setText(String.valueOf(emaitzaa)); 
        }else if ( operator.getText().equals("/")){
            emaitzaa=lehena/bigarrena;
            emaitza.setText(String.valueOf(emaitzaa)); 
        }
    
    }
    @FXML
    public void change() throws IOException{
        
        if( operator.getText().equals("+")){
            operator.setText("-");

        }else if ( operator.getText().equals("-")){
            operator.setText("*");

        }else if ( operator.getText().equals("*")){
            operator.setText("/");
        }else if ( operator.getText().equals("/")){
        operator.setText("+");
        }
    }
    @FXML
    public void zatikiak() throws IOException{
        Zatikia bat=new Zatikia(Integer.parseInt(zatikizuna1.getText()), Integer.parseInt(zatitzaile1.getText()));
        Zatikia bi= new Zatikia(Integer.parseInt(zatikizuna2.getText()), Integer.parseInt(zatitzaile2.getText()));
        emaitza2.setText(String.valueOf(Zatikia.mkt(bat.getIzendatzaile(),bi.getIzendatzaile())));
        emaitza1.setText(String.valueOf((bat.getZenbakitzaile()+bi.getZenbakitzaile())));
    }
    
}
