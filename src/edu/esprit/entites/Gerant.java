package edu.esprit.entites;
/***********************************************************************
 * Module:  Gerant.java
 * Author:  Stark
 * Purpose: Defines the Class Gerant
 ***********************************************************************/

import java.util.*;

/** @pdOid d7a0572a-4f2d-4cce-9e3a-6a1164656504 */
public class Gerant extends Compte {

    public Gerant() {
    }

    public Gerant(int id, String login, String password, String prenom, String nom, java.sql.Date dateNaissance, String email, int telephone, String adresse) {
        super(id, login, password, prenom, nom, dateNaissance, email, telephone, adresse);
    }
  
}