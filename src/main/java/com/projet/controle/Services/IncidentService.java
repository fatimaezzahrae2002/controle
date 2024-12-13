package com.projet.controle.Services;

import com.projet.controle.Models.Incident;
import com.projet.controle.Utils.GestionDB;

import lombok.NoArgsConstructor;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Set;


public class IncidentService implements IncidentServiceI {
    private GestionDB Pilot = new GestionDB();
    @Override
    public void inser(Set is) {

    }

    @Override
    public String inserer(Incident I) throws SQLException {
        String mess="";
        String sql = "INSERT INTO user(I.getTime(),I.getStatus()) VALUES(?,?)";
        try {
            Pilot.connecte("membre", "root", "");
            PreparedStatement stmt = Pilot.connexion.prepareStatement(sql);
            stmt.setString(1, String.valueOf(I.getTime()));
            stmt.setString(2, String.valueOf(I.getStatus()));
            stmt.execute();
            Pilot.close();
            mess="l'Ajout est effectuer avec Success";

        } catch (SQLException e) {
            mess="Erreur lors L'Ajout de nouveau membre";
      }
        return mess;






    }
}
