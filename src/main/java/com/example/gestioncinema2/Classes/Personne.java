package com.example.gestioncinema2.Classes;


public class Personne {

    Integer idP ;
    String CIN ;
    String Password ;
    String Prenom ;
    String nom ;
    String Role ;
    String Mail ;

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }

    public void setIdP(Integer idP) {
        this.idP = idP;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Personne(String CIN, String password, String prenom, String nom, String role, String mail) {
        this.CIN = CIN;
        Password = password;
        Prenom = prenom;
        this.nom = nom;
        Role = role;
        Mail = mail;
    }

    public Personne() {
    }

    public Personne(String CIN, String password) {
        this.CIN = CIN;
        Password = password;
    }

    public Integer getIdP() {
        return idP;
    }

    public String getCIN() {
        return CIN;
    }

    public void setCIN(String CIN) {
        this.CIN = CIN;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
