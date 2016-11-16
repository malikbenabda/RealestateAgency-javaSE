package edu.esprit.entites;

import java.sql.Date;

/***********************************************************************
 * Module:  Admin.java
 * Author:  Stark
 * Purpose: Defines the Class Admin
 ***********************************************************************/

/** @pdOid 135ac8fc-c481-4748-a944-2e7fb2c8c6a8 */
public class Administrateur extends Compte {

    public Administrateur() {
    }

    public Administrateur(int id, String login, String password, String prenom, String nom, Date dateNaissance, String email, int telephone, String adresse) {
        super(id, login, password, prenom, nom, dateNaissance, email, telephone, adresse);
    }
  

}