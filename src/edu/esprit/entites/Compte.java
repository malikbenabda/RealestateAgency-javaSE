package edu.esprit.entites;
/***********************************************************************
 * Module:  Compte.java
 * Author:  Stark
 * Purpose: Defines the Class Compte
 ***********************************************************************/

import java.util.*;

public class Compte {
   private int idCompte;
   private String login;
   private String password;
   private String prenom;   
   private String nom;
   private java.sql.Date dateNaissance;
   private String email;
   private int telephone;
   private String adresse;

    public Compte() {
    }

    public Compte(int id, String login, String password, String prenom, String nom, 
            java.sql.Date dateNaissance, String email, int telephone, String adresse) {
        this.idCompte = id;
        this.login = login;
        this.password = password;
        this.prenom = prenom;
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.telephone = telephone;
        this.adresse = adresse;
    }


    public int getIdCompte() {
        return idCompte;
    }

    public void setIdCompte(int idCompte) {
        this.idCompte = idCompte;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public java.sql.Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(java.sql.Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}