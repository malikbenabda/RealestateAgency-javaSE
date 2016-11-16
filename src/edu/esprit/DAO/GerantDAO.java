/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.DAO;

import edu.esprit.entites.Gerant;
import edu.esprit.interfaces.IGerantDAO;
import edu.esprit.technique.MyConnection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Oussama
 */
public class GerantDAO implements IGerantDAO{

    private Connection connection;
    
    public GerantDAO(){
        connection = MyConnection.getInstance();
    }
    
    @Override
    public void insertGerant(Gerant G) {
        //java.util.Date utilDate = new java.util.Date("dd/mm/yyyy");
        //java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        String requete;
        requete = "insert into gerant (idCompte,login,password,nom,prenom,email,dateNaissance,adresse,telephone) values (?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setInt(1, G.getIdCompte());
            ps.setString(2, G.getLogin());
            ps.setString(3, G.getPassword());
            ps.setString(4, G.getNom());
            ps.setString(5, G.getPrenom());
            ps.setString(6, G.getEmail());
            ps.setString(7, G.getDateNaissance().toString());
            ps.setString(8, G.getAdresse());
            ps.setInt(9, G.getTelephone());

            ps.executeUpdate();
            
            System.out.println("Ajout effectué avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de l'ajout 555" + ex.getMessage());
        }
    }

    @Override
    public void updateGerant(Gerant G) {
        String requete = "update gerant SET  login=?, password=?, nom=?, prenom=?, email=?, dateNaissance=?,adresse=?, telephone=? WHERE idCompte=?";
                
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
             
            ps.setString(1, G.getLogin());
            ps.setString(2, G.getPassword());
            ps.setString(3, G.getNom());
            ps.setString(4, G.getPrenom());
            ps.setString(5, G.getEmail());
            ps.setString(6,  G.getDateNaissance().toString());
            ps.setString(7, G.getAdresse());
            ps.setInt(8, G.getTelephone());
            ps.executeUpdate();
            
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }
    }

    @Override
    public void deleteGerant(int idCompte) {
        String requete = "delete from gerant where idCompte=?";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setInt(1, idCompte);
            ps.executeUpdate();
            System.out.println("Suppression effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    }

    @Override
    public List<Gerant> displayAllGerant() {
        List<Gerant> listeGerant = new ArrayList<Gerant>();

        String requete = "select * from gerant";
        try {
            Statement statement = connection
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            
            while (resultat.next()) {
                Gerant ger = new Gerant();
              //  idCompte,login,password,nom,prenom,email,dateNaissance,adresse,telephone
                ger.setIdCompte(resultat.getInt(1));
                ger.setLogin(resultat.getString(2));
                ger.setPassword(resultat.getString(3));
                ger.setNom(resultat.getString(4));
                ger.setPrenom(resultat.getString(5));
                ger.setEmail(resultat.getString(6));
                ger.setDateNaissance(Date.valueOf(resultat.getString(7)));
                ger.setAdresse(resultat.getString(8));
                ger.setTelephone(resultat.getInt(9));
                
                listeGerant.add(ger);
                
            
 
            }
            //login,password,nom,prenom,email,dateNaissance,adresse,telephone
            System.out.println(listeGerant.size());
            System.out.println(listeGerant.get(1).getLogin());
            System.out.println(listeGerant.get(1).getPassword());
            System.out.println(listeGerant.get(1).getNom());
            
            return listeGerant;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des gerants " + ex.getMessage());
            return null;
        }
    }


    

    
    
}
