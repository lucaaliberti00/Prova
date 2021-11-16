package it.unisa.prova;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PrimaryController {

    @FXML
    private Button primaryButton;

    @FXML
    private void switchToSecondary() throws IOException {
        /*mario è orribile*/
        App.setRoot("secondary");
    }
}
