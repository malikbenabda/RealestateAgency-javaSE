/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.DAO;

import edu.esprit.entites.Offre;
import edu.esprit.interfaces.IOffreDAO;
import java.sql.Connection;
import java.sql.Date;
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
 * @author Mejri ALA
 */
public class OffreDAO implements IOffreDAO {
    
    private Connection connection;
    
    
    public OffreDAO(){
    connection = MyConnection.getInstance();
    }
    
    
    public Void CreerOffre (Offre offre){
        String requete="insert into Offre (idOffre,adresseOffre,prixOffre,descriptionOffre,dateAjout,superficieOffre,photoOffre,croquis,typeProprietaire,natureOffre,listCommentaire,note) values(?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps;
        try {
            ps = connection.prepareStatement(requete);
            ps.setInt(1, offre.getIdOffre());
            ps.setString(2, offre.getAdresseOffre());
            ps.setFloat(3, offre.getPrixOffre());
            ps.setString(4, offre.getDescriptionOffre());
            ps.setString(5,  offre.getDateAjout());
            ps.setInt(6, offre.getSuperficieOffre());
            ps.setString(7,offre.getPhotoOffre());
            ps.setInt(8, offre.getCroquis());
            ps.setString(9, offre.getTypePropriete());
            ps.setString(10, offre.getNatureOffre());
            ps.setInt(11, offre.getListCommentaire());
            ps.setFloat(12, offre.getNote());
            
            ps.executeUpdate();
            System.out.println("Création d'offre effectuée avec succès");
        } catch (SQLException ex) {
            Logger.getLogger(OffreDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erreur lors de la création d'offre");
        }   
        return null;
    }
    
    
    public Void modifierOffre (Offre offre){
        String requete="update Offre set adresseOffre=?,prixOffre=?,descriptionOffre=?,dateAjout=?,superficieOffre=?,photoOffre=?,croquis=?,typeProprietaire=?,natureOffre=?,listCommentaire=?,note=? where idOffre=?";
                PreparedStatement ps;
        try {
            ps = connection.prepareStatement(requete);
            
            ps.setString(1, offre.getAdresseOffre());
            ps.setFloat(2, offre.getPrixOffre());
            ps.setString(3, offre.getDescriptionOffre());
            ps.setString(4,  offre.getDateAjout());
            ps.setInt(5, offre.getSuperficieOffre());
            ps.setString(6,offre.getPhotoOffre());
            ps.setInt(7, offre.getCroquis());
            ps.setString(8, offre.getTypePropriete());
            ps.setString(9, offre.getNatureOffre());
            ps.setInt(10, offre.getListCommentaire());
            ps.setFloat(11, offre.getNote());
            ps.setInt(12, offre.getIdOffre());
            
            ps.executeUpdate();
            System.out.println("Mise a jour d'offre effectuée avec succès");
        } catch (SQLException ex) {
            Logger.getLogger(OffreDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erreur lors de la mise à jour d'offre");
        }   
        return null;
    }
    
    
    public Void supprimerOffre (Offre offre){
        String requete="delete from Offre where idOffre=?";
                PreparedStatement ps;
        try {
            ps = connection.prepareStatement(requete);
            ps.setInt(1, offre.getIdOffre());
            ps.executeUpdate();
            System.out.println("Suppression d'offre effectuée avec succès");
        } catch (SQLException ex) {
            Logger.getLogger(OffreDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la Suppression d'offre");
        }   
        return null;
    }
    
    
    public List<Offre> ListerOffre(){
       
        List<Offre> listeOffre = new ArrayList<Offre>();
        try {
            String requete="select * from Offre ";
            PreparedStatement ps;
            ps = connection.prepareStatement(requete);
            ResultSet rs= ps.executeQuery();
            
            while(rs.next()){
               Offre offre = new Offre();
               offre.setIdOffre(rs.getInt(1));
               offre.setAdresseOffre(rs.getString(2));
               offre.setPrixOffre(rs.getFloat(3));
               offre.setDescriptionOffre(rs.getString(4));
               offre.setDateAjout(rs.getString(5));
               offre.setSuperficieOffre(rs.getInt(6));
               offre.setPhotoOffre(rs.getString(7) );
               offre.setCroquis(rs.getInt(8));
               offre.setTypePropriete(rs.getString(9));
               offre.setNatureOffre(rs.getString(10));
               offre.setListCommentaire(rs.getInt(11));
               offre.setNote(rs.getInt(12));

               listeOffre.add(offre);
               
            }
            System.out.println(listeOffre);
            return listeOffre;
            
        } catch (SQLException ex) {
            Logger.getLogger(OffreDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;        
        }    
    }
    
   
    public List<Offre> rechercherOffreByType(String typeProprietaire){
        List<Offre> ListeOffre= new ArrayList<Offre>();
        String requete="select * from Offre where typeProprietaire=?";
        try {
            PreparedStatement ps=connection.prepareStatement(requete);
            ps.setString(1, typeProprietaire);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
               Offre offre = new Offre();
               offre.setIdOffre(rs.getInt(1));
               offre.setAdresseOffre(rs.getString(2));
               offre.setPrixOffre(rs.getFloat(3));
               offre.setDescriptionOffre(rs.getString(4));
               offre.setDateAjout(rs.getString(5));
               offre.setSuperficieOffre(rs.getInt(6));
               offre.setPhotoOffre(rs.getString(7) );
               offre.setCroquis(rs.getInt(8));
               offre.setTypePropriete(rs.getString(9));
               offre.setNatureOffre(rs.getString(10));
               offre.setListCommentaire(rs.getInt(11));
               offre.setNote(rs.getInt(12));
               
               ListeOffre.add(offre);
            }
            System.out.println(ListeOffre);
            return ListeOffre;
        } catch (SQLException ex) {
            Logger.getLogger(OffreDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
 
    
        public List<Offre> rechercherOffreByNature(String natureOffre){
        List<Offre> ListeOffre= new ArrayList<Offre>();
        String requete="select * from Offre where natureOffre=?";
        try {
            PreparedStatement ps=connection.prepareStatement(requete);
            ps.setString(1, natureOffre);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
               Offre offre = new Offre();
               offre.setIdOffre(rs.getInt(1));
               offre.setAdresseOffre(rs.getString(2));
               offre.setPrixOffre(rs.getFloat(3));
               offre.setDescriptionOffre(rs.getString(4));
               offre.setDateAjout(rs.getString(5));
               offre.setSuperficieOffre(rs.getInt(6));
               offre.setPhotoOffre(rs.getString(7) );
               offre.setCroquis(rs.getInt(8));
               offre.setTypePropriete(rs.getString(9));
               offre.setNatureOffre(rs.getString(10));
               offre.setListCommentaire(rs.getInt(11));
               offre.setNote(rs.getInt(12));
               
               ListeOffre.add(offre);
            }
            System.out.println(ListeOffre);
            return ListeOffre;
        } catch (SQLException ex) {
            Logger.getLogger(OffreDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    
        public List<Offre> rechercherOffreByMinPrix(Float minPrix){
        List<Offre> ListeOffre= new ArrayList<Offre>();
        String requete="select * from Offre where prixOffre>=?";
        try {
            PreparedStatement ps=connection.prepareStatement(requete);
            ps.setFloat(1, minPrix);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
               Offre offre = new Offre();
               offre.setIdOffre(rs.getInt(1));
               offre.setAdresseOffre(rs.getString(2));
               offre.setPrixOffre(rs.getFloat(3));
               offre.setDescriptionOffre(rs.getString(4));
               offre.setDateAjout(rs.getString(5));
               offre.setSuperficieOffre(rs.getInt(6));
               offre.setPhotoOffre(rs.getString(7) );
               offre.setCroquis(rs.getInt(8));
               offre.setTypePropriete(rs.getString(9));
               offre.setNatureOffre(rs.getString(10));
               offre.setListCommentaire(rs.getInt(11));
               offre.setNote(rs.getInt(12));
               
               ListeOffre.add(offre);
            }
            System.out.println(ListeOffre);
            return ListeOffre;
        } catch (SQLException ex) {
            Logger.getLogger(OffreDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }    
        
        
    public List<Offre> rechercherOffreByMaxPrix(Float maxPrix){
        List<Offre> ListeOffre= new ArrayList<Offre>();
        String requete="select * from Offre where prixOffre<=?";
        try {
            PreparedStatement ps=connection.prepareStatement(requete);
            ps.setFloat(1, maxPrix);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
               Offre offre = new Offre();
               offre.setIdOffre(rs.getInt(1));
               offre.setAdresseOffre(rs.getString(2));
               offre.setPrixOffre(rs.getFloat(3));
               offre.setDescriptionOffre(rs.getString(4));
               offre.setDateAjout(rs.getString(5));
               offre.setSuperficieOffre(rs.getInt(6));
               offre.setPhotoOffre(rs.getString(7) );
               offre.setCroquis(rs.getInt(8));
               offre.setTypePropriete(rs.getString(9));
               offre.setNatureOffre(rs.getString(10));
               offre.setListCommentaire(rs.getInt(11));
               offre.setNote(rs.getInt(12));
               
               ListeOffre.add(offre);
            }
            System.out.println(ListeOffre);
            return ListeOffre;
        } catch (SQLException ex) {
            Logger.getLogger(OffreDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }        
        
        
     public List<Offre> rechercherOffreByAdresse(String adresseOffre){
        List<Offre> ListeOffre= new ArrayList<Offre>();
        String requete="select * from Offre where adresseOffre=?";
        try {
            PreparedStatement ps=connection.prepareStatement(requete);
            ps.setString(1, adresseOffre);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
               Offre offre = new Offre();
               offre.setIdOffre(rs.getInt(1));
               offre.setAdresseOffre(rs.getString(2));
               offre.setPrixOffre(rs.getFloat(3));
               offre.setDescriptionOffre(rs.getString(4));
               offre.setDateAjout(rs.getString(5));
               offre.setSuperficieOffre(rs.getInt(6));
               offre.setPhotoOffre(rs.getString(7) );
               offre.setCroquis(rs.getInt(8));
               offre.setTypePropriete(rs.getString(9));
               offre.setNatureOffre(rs.getString(10));
               offre.setListCommentaire(rs.getInt(11));
               offre.setNote(rs.getInt(12));
               
               ListeOffre.add(offre);
            }
            System.out.println(ListeOffre);
            return ListeOffre;
        } catch (SQLException ex) {
            Logger.getLogger(OffreDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }        
        
}
