/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.entites;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Mejri ALA
 */
public class Note {
    
    private int idNote;
    private float valeurNote;
    private List listeNote=new ArrayList();

    
    
    //Getter & Setter
    public int getIdNote() {
        return idNote;
    }

    public void setIdNote(int idNote) {
        this.idNote = idNote;
    }

    public float getValeurNote() {
        return valeurNote;
    }

    public void setValeurNote(float valeurNote) {
        this.valeurNote = valeurNote;
    }

    public List getListeNote() {
        return listeNote;
    }

    public void setListeNote(List listeNote) {
        this.listeNote = listeNote;
    }
    
    
    
    //Constructeur
    public Note() {
    }

    public Note(int idNote, float valeurNote, List listeNote) {
        this.idNote = idNote;
        this.valeurNote = valeurNote;
        this.listeNote = listeNote;
    }
    
    
    //toString
    @Override
    public String toString() {
        return "Note{" + "idNote=" + idNote + ", valeurNote=" + valeurNote + ", listeNote=" + listeNote + '}';
    }

    
    
    //Methodes
    public float calculerNote(Note note){
        
        List myListe = note.getListeNote();
        Iterator iter = myListe.iterator();
        float finalNote=0;
        while(iter.hasNext()){
            float currNote= (float) iter.next();
            finalNote = finalNote + currNote;
        }
        
        note.setValeurNote(finalNote);
        return finalNote;
        
    }



    
    
    
    
}

