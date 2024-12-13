package com.projet.controle.Controller;

import com.projet.controle.Models.Membre;
import com.projet.controle.Services.MembreService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MembreController {
    @FXML
    private TextField nom;
    @FXML
    private TextField prenom;
    @FXML
    private TextField email;
    @FXML
    private TextField phone;
    public void ajoutMembre(ActionEvent event) {

        Membre membre = new Membre(nom.getText(), prenom.getText(),email.getText(),phone.getText());
        MembreService e=new MembreService();
        String res=e.inserer(membre);
        System.out.println(res);
    }
}
