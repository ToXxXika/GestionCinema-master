package com.example.gestioncinema2.Interfaces;


import com.example.gestioncinema2.Classes.Personne;

import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.List;

public interface IPersonne {
   boolean Login(Personne P) throws SQLException, NoSuchAlgorithmException;
   boolean SignIn(Personne P) throws SQLException, NoSuchAlgorithmException;
   boolean verifUser(String cin) throws SQLException;
   String GetRole(String cin) throws  SQLException ;
   List<Personne> GetAllUsers() throws SQLException;
}
