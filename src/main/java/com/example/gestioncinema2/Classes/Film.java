package com.example.gestioncinema2.Classes;

public class Film {
    String  Titre;
    String  NomRealisateur;
    String  AnneeRealisation;
    String  Description ;
    float  Prix;
    float  Duree;

    public float getPrix() {
        return Prix;
    }

    public void setPrix(float prix) {
        Prix = prix;
    }


    public Film(String titre, String nomRealisateur, String anneeRealisation, String description, float prix, float duree) {
        Titre = titre;
        NomRealisateur = nomRealisateur;
        AnneeRealisation = anneeRealisation;
        Description = description;
        Prix = prix;
        Duree = duree;
    }

    public float getDuree() {
        return Duree;
    }

    public void setDuree(float duree) {
        Duree = duree;
    }

    public String getTitre() {
        return Titre;
    }

    public void setTitre(String titre) {
        Titre = titre;
    }

    public String getNomRealisateur() {
        return NomRealisateur;
    }

    public void setNomRealisateur(String nomRealisateur) {
        NomRealisateur = nomRealisateur;
    }

    public String getAnneeRealisation() {
        return AnneeRealisation;
    }

    public void setAnneeRealisation(String anneeRealisation) {
        AnneeRealisation = anneeRealisation;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Film() {
    }


}
