package com.example.gestioncinema2.Interfaces;

import com.example.gestioncinema2.Classes.Salle;

import java.sql.SQLException;
import java.util.List;

public interface ISalle {
    Salle RechercherSalle(int idSalle) throws SQLException;
    boolean AjouterSalle(Salle S) throws  SQLException;
    boolean updateSalle(int idSalle,int NbrPlaces) throws SQLException;
    List<Salle> GetSalles() throws SQLException ;
}
