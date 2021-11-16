package it.unisa.prova;

import java.io.IOException;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        // mario puzza
        App.setRoot("primary");
        
    }
}