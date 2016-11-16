/**
 * *********************************************************************
 * Module: Client.java Author: Stark Purpose: Defines the Class Client
 **********************************************************************
 */
package edu.esprit.entites;

import java.util.*;

/**
 * @pdOid fe0cb022-c243-487d-afed-214778fcaa17
 */
public class Client extends Compte {

    /**
     * @pdOid d376156d-825d-4c9e-bec9-4496a7419747
     */
    private ArrayList<Integer> favoris;

    public ArrayList<Integer> getFavoris() {
        return favoris;
    }

    public Client() {
    }

    public Client(ArrayList<Integer> favoris, Boolean etat, int id, String login, String password, String prenom, String nom, java.sql.Date dateNaissance, String email, int telephone, String adresse) {
        super(id, login, password, prenom, nom, dateNaissance, email, telephone, adresse);
        this.favoris = favoris;
        this.etat = etat;
    }

    public void setFavoris(ArrayList<Integer> favoris) {
        this.favoris = favoris;
    }
    private Boolean etat;

    public Boolean getEtat() {
        return etat;
    }

    public void setEtat(Boolean etat) {
        this.etat = etat;
    }

}
