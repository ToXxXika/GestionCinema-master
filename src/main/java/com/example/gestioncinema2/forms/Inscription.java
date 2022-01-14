/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.gestioncinema2.forms;

import com.example.gestioncinema2.Classes.Personne;
import com.example.gestioncinema2.Controlleurs.PersonneControlleur;

import javax.swing.*;
import java.sql.PreparedStatement;

/**
 *
 * @author Lenovo
 */
public class Inscription extends JFrame {

    /**
     * Creates new form Inscription
     */
    public Inscription() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new JInternalFrame();
        jLabel1 = new JLabel();
        NomTxt = new JTextField();
        PrenomTxt = new JTextField();
        CinTxt = new JTextField();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        MdpTxt = new JPasswordField();
        CmdpTxt = new JPasswordField();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        Inscrire = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setBackground(new java.awt.Color(202, 190, 74));
        jInternalFrame1.setVisible(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Inscription");

        PrenomTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrenomTxtActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nom :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Prenom :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("CIN :");

        MdpTxt.setText("jPasswordField1");

        CmdpTxt.setText("jPasswordField1");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Mot de passe :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Confirmer : ");

        Inscrire.setText("S'inscrire");
        Inscrire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InscrireActionPerformed(evt);
            }
        });

        GroupLayout jInternalFrame1Layout = new GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(CmdpTxt, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
                    .addGroup(GroupLayout.Alignment.LEADING, jInternalFrame1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGroup(jInternalFrame1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(63, 63, 63)
                                .addComponent(MdpTxt, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(PrenomTxt, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CinTxt, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NomTxt, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(GroupLayout.Alignment.LEADING, jInternalFrame1Layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(Inscrire, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 278, Short.MAX_VALUE)))
                .addGap(121, 121, 121))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(jInternalFrame1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(NomTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(jInternalFrame1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(MdpTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(34, 34, 34)
                .addGroup(jInternalFrame1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(PrenomTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(38, 38, 38)
                .addGroup(jInternalFrame1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(CmdpTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(27, 27, 27)
                .addGroup(jInternalFrame1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(CinTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(Inscrire, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PrenomTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrenomTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrenomTxtActionPerformed

    private void InscrireActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_InscrireActionPerformed
       String nom = NomTxt.getText();
       String prenom = PrenomTxt.getText();
       String cin = CinTxt.getText();
       String Motdepasse = "";
       String ConfirmationMdp = "";
        for (char x: MdpTxt.getPassword()) {
              Motdepasse=Motdepasse+x;
        }
        for (char y:CmdpTxt.getPassword()) {
            ConfirmationMdp=ConfirmationMdp+y;
        }
        System.out.println(Motdepasse);
        System.out.println(ConfirmationMdp);
       PersonneControlleur PC = new PersonneControlleur();
        if(nom.isEmpty()||prenom.isEmpty()||cin.isEmpty()||Motdepasse.isEmpty() ||ConfirmationMdp.isEmpty()){
            JOptionPane.showMessageDialog(null,"Un Champ est vide");
        }else if (!Motdepasse.equals(ConfirmationMdp)){
           JOptionPane.showMessageDialog(null,"mot de passe ne sont pas identiques");
        } else {
            try{
                Personne P  = new Personne();
                P.setCIN(cin);
                P.setPassword(Motdepasse);
                P.setNom(nom);
                P.setPrenom(prenom);
                P.setRole("Client");
                if(PC.SignIn(P)){
                    JOptionPane.showMessageDialog(null,"Inscription Reussie");
                }else JOptionPane.showMessageDialog(null,"Erreur dans l'inscription ");
            }catch (Exception E ){
                System.out.println(E.getMessage());
            }


        }

    }//GEN-LAST:event_InscrireActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inscription().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JTextField CinTxt;
    private JPasswordField CmdpTxt;
    private JButton Inscrire;
    private JPasswordField MdpTxt;
    private JTextField NomTxt;
    private JTextField PrenomTxt;
    private JInternalFrame jInternalFrame1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
