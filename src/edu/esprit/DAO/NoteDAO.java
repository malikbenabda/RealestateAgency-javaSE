/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.DAO;

import edu.esprit.entites.Note;
import edu.esprit.entites.Offre;
import edu.esprit.interfaces.INoteDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import edu.esprit.technique.MyConnection;

/**
 *
 * @author Soul Slayer
 */
public class NoteDAO implements INoteDAO {
    
        
    private Connection connection;
    
    
    public NoteDAO(){
    connection = MyConnection.getInstance();
    }
    
        
    
        public float getNote (Offre offre){
        List listeNote= new ArrayList();
        float somme=0;
        float noteFinal=0;
        Note note = new Note();
        String requete="select * from Note where idOffre=?";
        try {
            PreparedStatement ps=connection.prepareStatement(requete);
            ps.setInt(1, offre.getIdOffre());
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
               
               float currNote= rs.getFloat(3);
               somme = somme + (float) currNote;
               listeNote.add(currNote);
            }
            noteFinal=somme/listeNote.size();
            note.setListeNote(listeNote);
            offre.setNote(noteFinal);
            
            String requete2="update Offre set note=? where idOffre=?";
            PreparedStatement ps2=connection.prepareStatement(requete2);
            ps2.setFloat(1, offre.getNote());
            ps2.setInt(2, offre.getIdOffre());
            ps2.executeUpdate();
            System.out.println(offre.getNote());
            return offre.getNote();
        } catch (SQLException ex) {
            Logger.getLogger(OffreDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    
    
}
