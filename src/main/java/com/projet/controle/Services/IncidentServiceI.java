package com.projet.controle.Services;

import com.projet.controle.Models.Incident;
import com.projet.controle.Models.Membre;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;

public interface IncidentServiceI {
    public String inserer(Incident  I) throws SQLException;
    public void inser(Set is)  ;
}
