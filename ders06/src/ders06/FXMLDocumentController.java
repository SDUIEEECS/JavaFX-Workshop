/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders06;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javax.swing.JOptionPane;

/**
 *
 * @author Arda
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button button;
    @FXML
    private CheckBox elma;
    @FXML
    private CheckBox armut;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        
    }    

    @FXML
    private void yazdir(ActionEvent event) {
        String yaz="";
        if(elma.isSelected())   // isSelected, Seçili olup olmadığını döndürür.
        {
            yaz+="Elma Seçildi";
        }
        if(armut.isSelected())
        {
            yaz+="Armut seçildi..";
        }
        JOptionPane.showMessageDialog(null, yaz);
        
    }
    
}
