/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders07;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author Arda
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private RadioButton erkek;
    @FXML
    private RadioButton kadin;
    @FXML
    private Button button;
    ToggleGroup tg= new ToggleGroup();
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void tikla(ActionEvent event) {
        erkek.setToggleGroup(tg);
        kadin.setToggleGroup(tg);
//        tg.getToggles().add(erkek);
//        tg.getToggles().add(kadin);
        erkek.setSelected(true);//sadece erkek secili gelir
        if(erkek.isSelected())
            JOptionPane.showMessageDialog(null, "erkek secildi");
        else
            JOptionPane.showMessageDialog(null, "kadın secildi");
    }
    
}
