/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.entites;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Mejri ALA
 */
public class Offre {
    
    private int idOffre;
    private String adresseOffre;
    private float prixOffre;
    private String descriptionOffre;
    private String dateAjout;
    private int superficieOffre;
    private String photoOffre;
    private int croquis;   //a modifier le type au niveau BD  type = Croquis
    private String typePropriete; // à corriger le nom au niveau de BD
    private String natureOffre;
    private int listCommentaire; //a modifier le type au niveau BD  tye = List<Commentaire>
    private float note; //a modifier le type au niveau BD  type = Note
    private List listeNote=new ArrayList(); // a supprimer
    
    
    
    //getter
     

    
    
    



    /**
     * @return the idOffre
     */
    public int getIdOffre() {
        return idOffre;
    }

    /**
     * @param idOffre the idOffre to set
     */
    public void setIdOffre(int idOffre) {
        this.idOffre = idOffre;
    }

    /**
     * @return the adresseOffre
     */
    public String getAdresseOffre() {
        return adresseOffre;
    }

    /**
     * @param adresseOffre the adresseOffre to set
     */
    public void setAdresseOffre(String adresseOffre) {
        this.adresseOffre = adresseOffre;
    }

    /**
     * @return the prixOffre
     */
    public float getPrixOffre() {
        return prixOffre;
    }

    /**
     * @param prixOffre the prixOffre to set
     */
    public void setPrixOffre(float prixOffre) {
        this.prixOffre = prixOffre;
    }

    /**
     * @return the descriptionOffre
     */
    public String getDescriptionOffre() {
        return descriptionOffre;
    }

    /**
     * @param descriptionOffre the descriptionOffre to set
     */
    public void setDescriptionOffre(String descriptionOffre) {
        this.descriptionOffre = descriptionOffre;
    }

    /**
     * @return the dateAjout
     */
    public String getDateAjout() {
        return dateAjout;
    }

    /**
     * @param dateAjout the dateAjout to set
     */
    public void setDateAjout(String dateAjout) {
        this.dateAjout = dateAjout;
    }

    /**
     * @return the superficieOffre
     */
    public int getSuperficieOffre() {
        return superficieOffre;
    }

    /**
     * @param superficieOffre the superficieOffre to set
     */
    public void setSuperficieOffre(int superficieOffre) {
        this.superficieOffre = superficieOffre;
    }

    /**
     * @return the photoOffre
     */
    public String getPhotoOffre() {
        return photoOffre;
    }

    /**
     * @param photoOffre the photoOffre to set
     */
    public void setPhotoOffre(String photoOffre) {
        this.photoOffre = photoOffre;
    }

    /**
     * @return the croquis
     */
    public int getCroquis() {
        return croquis;
    }

    /**
     * @param croquis the croquis to set
     */
    public void setCroquis(int croquis) {
        this.croquis = croquis;
    }

    /**
     * @return the typePropriete
     */
    public String getTypePropriete() {
        return typePropriete;
    }

    /**
     * @param typePropriete the typePropriete to set
     */
    public void setTypePropriete(String typePropriete) {
        this.typePropriete = typePropriete;
    }

    /**
     * @return the natureOffre
     */
    public String getNatureOffre() {
        return natureOffre;
    }

    /**
     * @param natureOffre the natureOffre to set
     */
    public void setNatureOffre(String natureOffre) {
        this.natureOffre = natureOffre;
    }

    /**
     * @return the listCommentaire
     */
    public int getListCommentaire() {
        return listCommentaire;
    }

    /**
     * @param listCommentaire the listCommentaire to set
     */
    public void setListCommentaire(int listCommentaire) {
        this.listCommentaire = listCommentaire;
    }

    /**
     * @return the note
     */
    public float getNote() {
        return note;
    }

    /**
     * @param note the note to set
     */
    public void setNote(float note) {
        this.note = note;
    }

    /**
     * @return the listeNote
     */
    public List getListeNote() {
        return listeNote;
    }

    /**
     * @param listeNote the listeNote to set
     */
    public void setListeNote(List listeNote) {
        this.listeNote = listeNote;
    }
    
    
    
    //constructeur
    public Offre() {
    }

    public Offre(int idOffre, String adresseOffre, float prixOffre, String descriptionOffre, String dateAjout, int superficieOffre, String photoOffre, int croquis, String typePropriete, String natureOffre, int listCommentaire, int note) {
        this.idOffre = idOffre;
        this.adresseOffre = adresseOffre;
        this.prixOffre = prixOffre;
        this.descriptionOffre = descriptionOffre;
        this.dateAjout = dateAjout;
        this.superficieOffre = superficieOffre;
        this.photoOffre = photoOffre;
        this.croquis = croquis;
        this.typePropriete = typePropriete;
        this.natureOffre = natureOffre;
        this.listCommentaire = listCommentaire;
        this.note = note;
    }

    @Override
    public String toString() {
        return "Offre{" + "idOffre=" + idOffre + ", adresseOffre=" + adresseOffre + ", prixOffre=" + prixOffre + ", descriptionOffre=" + descriptionOffre + ", dateAjout=" + dateAjout + ", superficieOffre=" + superficieOffre + ", photoOffre=" + photoOffre + ", croquis=" + croquis + ", typePropriete=" + typePropriete + ", natureOffre=" + natureOffre + ", listCommentaire=" + listCommentaire + ", note=" + note + ", listeNote=" + listeNote + '}';
    }

    
    
    public float calculerNote(Offre offre){
        
        List myListe = offre.getListeNote();
        Iterator iter = myListe.iterator();
        float somme=0;
        while(iter.hasNext()){
            int currNote=   (int) iter.next();
            somme = somme + (float) currNote;     
        }
        
        float finalNote=somme/myListe.size();
        offre.setNote(finalNote);
        return finalNote;
        
    }
    
    
       
}


