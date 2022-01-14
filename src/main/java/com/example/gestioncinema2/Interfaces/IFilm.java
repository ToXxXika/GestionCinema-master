package com.example.gestioncinema2.Interfaces;

import com.example.gestioncinema2.Classes.Film;

import java.sql.SQLException;
import java.util.List;

public interface IFilm {
    boolean AjouterFilm(Film F) throws SQLException;
    boolean SupprimerFilm(String titre) throws SQLException;
    boolean ModifierFilm(Film FS)throws SQLException;
    List<Film> TousLesFilms() throws SQLException;
    Film RechercherFilm(String titre) throws SQLException;
}
