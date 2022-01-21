package com.example.gestioncinema2.Controlleurs;
import com.example.gestioncinema2.Classes.Personne;
import com.example.gestioncinema2.ConnexionBD;
import com.example.gestioncinema2.Interfaces.IPersonne;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonneControlleur extends ConnexionBD implements IPersonne {

    Connection conn= Connect();
    @Override
    public boolean Login(Personne P) throws SQLException, NoSuchAlgorithmException {
         boolean Result = true ;
        String sql ="select * from personne where CIN= '"+P.getCIN()+"'";
        ResultSet RS = conn.createStatement().executeQuery(sql);
        if(RS.next()==false){
            System.out.println("Utilisateur Non trouvé");
            Result = false;
        }else {
            if(HashPassword(P.getPassword()).equals(RS.getString(3))){
                System.out.println("Utilisateur Trouvé");
                Result = true ;
            }else {
                System.out.println("Mot de passe erroné");
                Result=false;
            }
        }
        return Result ;
    }


    @Override
    public boolean SignIn(Personne P) throws SQLException, NoSuchAlgorithmException {
        boolean Resultat = true ;
        String InsertPersonne = "Insert into personne (CIN,Password,Nom,Prenom,Role) values(?,?,?,?,?)";
        PreparedStatement PS = conn.prepareStatement(InsertPersonne);
        PS.setString(1,P.getCIN());
        PS.setString(2,HashPassword(P.getPassword()));
        PS.setString(3,P.getNom());
        PS.setString(4,P.getPrenom());
        PS.setString(5,P.getRole());
        if(verifUser(P.getCIN())){
            int i=PS.executeUpdate();
            if(i>0){
                System.out.println("Personne Ajouté");
                //Resultat = true ;
            }else Resultat = false ;
        }else {
            Resultat=false ;
        }

         return Resultat ;
    }

    @Override
    public boolean verifUser(String cin) throws SQLException {
        boolean Resultat = true;
        String SelectCin="Select * from personne where CIN="+cin;
        ResultSet sql = conn.createStatement().executeQuery(SelectCin);
           if(sql.next()){
              Resultat=false;
              System.out.println("CIN Trouvé");
           }else {
               System.out.println("CIN non trouvé");
           }
           return Resultat;
    }

    @Override
    public String GetRole(String cin) throws SQLException {
        String x="";
        String GetRole="Select Role from personne where CIN="+cin;
        ResultSet sql = conn.createStatement().executeQuery(GetRole);
        if(sql.next())
        x= sql.getString("Role");
      return x ;
    }

    @Override
    public List<Personne> GetAllUsers() throws SQLException {
        List<Personne> Ls = new ArrayList<>();
        String sql= "Select * from personne ";
        ResultSet Rs = conn.createStatement().executeQuery(sql);
        while (Rs.next()){
            Personne P = new Personne();
            P.setCIN(Rs.getString(2));
            P.setPrenom(Rs.getString(5));
            P.setNom(Rs.getString(4));
            P.setRole(Rs.getString(6));
            P.setIdP(Rs.getInt(1));
            P.setMail(Rs.getString(7));

            Ls.add(P);
        }
        return Ls;
    }

    @Override
    public boolean Reserver(int idPersonne, int NumSeance) throws SQLException {
        String sql = "insert into reservation (idPersonne,NumSeance) values (?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,idPersonne);
        ps.setInt(2,NumSeance);
         int i = ps.executeUpdate();
         if(i>0){
             System.out.println("le Film est Reservé");
             return  true;
         }else {
             return  false ;
         }
    }

    public String HashPassword(String password) throws NoSuchAlgorithmException {
        String generatedPassword=null;
        MessageDigest md =MessageDigest.getInstance("MD5");
        md.update(password.getBytes());
        byte[] bytes=md.digest();
        StringBuilder SB = new StringBuilder();
        for(int i =0;i<bytes.length;i++){
            SB.append(Integer.toString((bytes[i]& 0xff)+0x100,16).substring(1));
        }
        generatedPassword=SB.toString();

        return generatedPassword;
    }


}
