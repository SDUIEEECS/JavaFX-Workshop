/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders04;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

/**
 *
 * @author Arda
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private ComboBox<Integer> combobox; // Integer değer alacağımız için içine integer yazdık..
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // 1.Yol..
//        for(int i=0;i<10;i++)
//        {
//            combobox.getItems().add(i);  // İlk olarak comboboxı getirip getItems'la getirip, add fonksiyonuyla elemanı ekliyoruz..
//        }
        // TODO
        
        // İkinci Yol..
        
        ObservableList<Integer> liste = FXCollections.observableArrayList();  // Yeni bir liste oluşturduk..
        for(int i=0;i<10;i++)
        {
            liste.add(i);   // 0-10 arası sayıları listeye ekledik.
            
        }
        
        combobox.setItems(liste); // listemizi comboxa atadık.
        
    }    

    @FXML
    private void değisti(ActionEvent event) {
        int a=combobox.getSelectionModel().getSelectedItem(); // Combobox'ın verisini aldık.  ( int değişkene almamızın nedeni combobox'ı integer almış olmamız )
        label.setText(String.valueOf(a));  // a integer değişkenini stringe çevirip, labela yolladık.
    }
    
}
