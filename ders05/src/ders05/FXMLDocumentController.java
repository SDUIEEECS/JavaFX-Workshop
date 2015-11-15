/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders05;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import static javafx.scene.input.KeyCode.T;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author Arda
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private ListView<Integer> lw;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<Integer> liste = FXCollections.observableArrayList();  // Liste oluşturduk.
        for (int i = 0; i < 10; i++) {
            liste.add(i);  // liste elemanlarını ekledik..
        }
        
        lw.setItems(liste);  // ListView'a aldığımz listeyi yolladık.
        // TODO
        
        lw.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE); // Liste'yi çoklu seçilebilir hale getiriyor.. Ctrl'yle basarak
    }    

    @FXML
  
    private void tıklandı(MouseEvent event) {
        ObservableList<Integer> a = lw.getSelectionModel().getSelectedItems(); // Listviewdaki item'ı getirtiyoruz.
        int toplam=0;
        for (int i = 0; i < a.size(); i++) {
            toplam+=a.get(i);
        }
        label.setText(String.valueOf(toplam)); // a değişkenini' ı string olarak alıp labela yollamak.
    }
    
}
