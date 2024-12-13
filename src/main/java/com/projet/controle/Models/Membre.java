package com.projet.controle.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Membre {
    String identifiant;
    String nom;
    String prenom;
    String email;
    String phone;

    public Membre(String nom, String prenom, String email, String phone) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.phone = phone;
    }


    @Override
    public boolean equals(Object o) {
        if(o instanceof Membre) {
            return identifiant.equals(((Membre)o).identifiant);
        }else{
            return false;
        }
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
