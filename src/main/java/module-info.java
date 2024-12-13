module com.projet.controle {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;
    requires java.sql;


    opens com.projet.controle to javafx.fxml;
    exports com.projet.controle;
}