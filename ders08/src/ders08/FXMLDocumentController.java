/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders08;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Arda
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private GridPane grid;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        char sayac=64;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <6; j++) {
                sayac++;
                Button b=new Button();
                b.setText(String.valueOf(sayac));
                grid.add(b,j,i);
                b.setOnMouseClicked(new EventHandler<MouseEvent>() {

                    @Override
                    public void handle(MouseEvent event) {
                        System.out.println(b.getText());
                    }
                });
                    
            }
            
        }
    }    
    
}
