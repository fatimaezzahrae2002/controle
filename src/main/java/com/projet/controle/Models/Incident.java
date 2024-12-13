package com.projet.controle.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Incident {
    String id;
    Date time;
    String status;
    String idMembre;
}
