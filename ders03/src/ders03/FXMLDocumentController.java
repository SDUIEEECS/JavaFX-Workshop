/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders03;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Arda
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private TextField tf;
    @FXML
    private Button button;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void tiklandi(ActionEvent event) {
        String a = tf.getText(); // TextFielda girilen değeri getirip string değerine gir..
        System.err.println(a); // Consola yazdırdık..
    }
    
    
}
