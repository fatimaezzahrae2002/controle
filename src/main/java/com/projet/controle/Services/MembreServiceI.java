package com.projet.controle.Services;

import com.projet.controle.Models.Incident;
import com.projet.controle.Models.Membre;

import java.util.List;

public interface MembreServiceI {
    public String inserer(Membre m);
    public List<Incident> chargerListIncidents();
}
