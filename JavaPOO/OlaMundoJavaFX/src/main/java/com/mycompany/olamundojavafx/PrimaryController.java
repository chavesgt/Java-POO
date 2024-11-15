package com.mycompany.olamundojavafx;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class PrimaryController {

    @FXML
    private Label lblMensagem;
    private Button btnClick;
    
   
    
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
