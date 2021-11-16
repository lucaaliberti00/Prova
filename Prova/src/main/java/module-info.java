module it.unisa.prova {
    requires javafx.controls;
    requires javafx.fxml;

    opens it.unisa.prova to javafx.fxml;
    exports it.unisa.prova;
}
