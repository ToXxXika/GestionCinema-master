package com.example.gestioncinema2.Classes;

public class Reservation  {
    Integer idPersonne ;
    Integer NumeroSalle ;

    public Reservation() {
    }

    public Reservation(Integer idPersonne, Integer numeroSalle) {
        this.idPersonne = idPersonne;
        NumeroSalle = numeroSalle;
    }

    public Integer getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(Integer idPersonne) {
        this.idPersonne = idPersonne;
    }

    public Integer getNumeroSalle() {
        return NumeroSalle;
    }

    public void setNumeroSalle(Integer numeroSalle) {
        NumeroSalle = numeroSalle;
    }
}
