package com.projet.controle.Services;

import com.projet.controle.Models.Incident;
import com.projet.controle.Models.Membre;

import java.util.List;

public class MembreService implements MembreServiceI{
    @Override
    public String inserer(Membre m) {
        return "";
    }

    @Override
    public List<Incident> chargerListIncidents() {
        return List.of();
    }
}
