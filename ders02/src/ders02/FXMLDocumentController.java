/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders02;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Arda
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button tikla;
    
    
    private void handleButtonAction(ActionEvent event) {
       
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) // programın ilk çalıştığı an yapılacak işlemler buraya...
    {
        label.setText("0");
        // TODO
    }    

    @FXML
    private void tiklandi(ActionEvent event) {
        int a=Integer.parseInt(label.getText()); // Sayıyı labelden alıp, integera çevir.
        a++; 
        label.setText(Integer.toString(a));  // Sayıyı Stringe girip yolla. 
    }
    
}
