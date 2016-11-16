/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.DAO;

import edu.esprit.interfaces.IClientDAO;
import edu.esprit.entites.Client;
import edu.esprit.service.DateConverter;
import edu.esprit.technique.MyConnection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Stark
 */
public class ClientDAO implements IClientDAO {

    private Connection connection;
    private static ClientDAO cldao;

    private ClientDAO() {
        connection = MyConnection.getInstance();
    }

    public static ClientDAO getInstance() {
        if (cldao == null) {
            cldao = new ClientDAO();
        }
        return cldao;
    }

    @Override
    public void ajoutertClient(Client cl) {
        String requete = "INSERT INTO `realestateagency`.`client` "
                + "(`login`, `password`, `nom`, `prenom`, `email`, `dateNaissance`, `adresse`, `telephone`) "
                + "VALUES ( ? ,  ? ,  ? ,  ? ,  ? ,  ? ,  ? ,  ? );";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);

            ps.setString(1, cl.getLogin());
            ps.setString(2, cl.getPassword());
            ps.setString(3, cl.getNom());
            ps.setString(4, cl.getPrenom());
            ps.setString(5, cl.getEmail());
            ps.setString(6, cl.getDateNaissance().toString());
            ps.setString(7, cl.getAdresse());
            ps.setInt(8, cl.getTelephone());
            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void modifierClient(Client cl) {
        String requete = "UPDATE client SET `etat`= ? , `password`= ? ,`nom`= ? ,`prenom`= ? ,`email`= ? ,`dateNaissance`= ? ,`adresse`= ? ,`telephone`= ?  "
                + "WHERE login='" + cl.getLogin() + "'            ";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setBoolean(1, cl.getEtat());
            ps.setString(2, cl.getPassword());
            ps.setString(3, cl.getNom());
            ps.setString(4, cl.getPrenom());
            ps.setString(5, cl.getEmail());
            ps.setString(6, cl.getDateNaissance().toString());
            ps.setString(7, cl.getAdresse());
            ps.setInt(8, cl.getTelephone());

            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }
    }

    @Override
    public void deleteClientByLogin(String login) {
        String requete = "delete from client where login= ? ";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setString(1, login);
            ps.executeUpdate();
            System.out.println("Compte Client supprimée");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    }

    @Override
    public void desactiverClientByLogin(String login) {
        String requete = "UPDATE client SET `etat`= ?  where login= ? ";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setBoolean(1, Boolean.FALSE);
            ps.setString(2, login);
            ps.executeUpdate();
            System.out.println("Compte Client desactivated");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la desactivation " + ex.getMessage());
        }
    }

    @Override
    public void activerClientByLogin(String login) {
        String requete = "UPDATE client SET `etat`= ?  where login= ? ";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setBoolean(1, Boolean.TRUE);
            ps.setString(2, login);
            ps.executeUpdate();
            System.out.println("Compte Client reactivated");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'activation " + ex.getMessage());
        }
    }

    @Override
    public Client findClientByLogin(String login) {
        Client cl = new Client();
        String requete = "select * from client where login= ? ";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setString(1, login);
            ResultSet rz = ps.executeQuery();
            while (rz.next()) {
                cl.setIdCompte(rz.getInt(1));
                cl.setLogin(rz.getString(2));
                cl.setPassword(rz.getString(3));
                cl.setNom(rz.getString(4));
                cl.setPrenom(rz.getString(5));
                cl.setEmail(rz.getString(6));
                //format java.sql.Date  yyyy-mm-dd
                cl.setDateNaissance(Date.valueOf(rz.getString(7)));
                cl.setAdresse(rz.getString(8));
                cl.setTelephone(rz.getInt(9));
                cl.setEtat(rz.getBoolean(10));
                cl.setFavoris(getFavorisIds(cl.getIdCompte()));
            }
            
            return cl;

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du client " + ex.getMessage());
            return null;
        }
    }

    @Override
    public ArrayList<Client> getAllClients() {
        ArrayList<Client> clArray = new ArrayList<Client>();

        Client cl = new Client();
        String requete = "select * from client ";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ResultSet rz = ps.executeQuery();
            while (rz.next()) {
                cl.setIdCompte(rz.getInt(1));
                cl.setLogin(rz.getString(2));
                cl.setPassword(rz.getString(3));
                cl.setNom(rz.getString(4));
                cl.setPrenom(rz.getString(5));
                cl.setEmail(rz.getString(6));
                //format java.sql.Date  yyyy-mm-dd
                cl.setDateNaissance(Date.valueOf(rz.getString(7)));
                cl.setAdresse(rz.getString(8));
                cl.setTelephone(rz.getInt(9));
                cl.setEtat(rz.getBoolean(10));
                cl.setFavoris(getFavorisIds(cl.getIdCompte()));
            
                clArray.add(cl);

            }
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du depot " + ex.getMessage());
            return null;
        }

        return clArray;
    }

    @Override
    public Boolean clientExistsByLogin(String login) {
        String requete = "select * from client where login= ? ";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setString(1, login);
            ResultSet rz = ps.executeQuery();
            if (rz.next()) {
                return Boolean.TRUE;
            }

        } catch (Exception e) {
            System.err.println("erruer de connection clientExist");

        }
        return Boolean.FALSE;
    }

    @Override
    public Boolean clientExistsById(int id) {
    String requete = "select * from client where idCompte= ? ";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet rz = ps.executeQuery();
            if (rz.next()) {
                return Boolean.TRUE;
            }

        } catch (Exception e) {
            System.err.println("erruer de connection clientExist");

        }
        return Boolean.FALSE;
    
    
    
    
    }

    @Override
    public ArrayList<Integer> getFavorisIds(int idClient) {
   String requete = "select idOffre from favoris where idClient= ? ";
   ArrayList<Integer> favoritesList = new ArrayList<Integer>();
   try {
            
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setInt(1, idClient);
            ResultSet rz = ps.executeQuery();
            while (rz.next()){
                favoritesList.add(rz.getInt("idOffre"));
                
                
            }
            
            
            
        } catch (Exception e) {
        System.out.println("problem with getting favorit lists of the client N°: "+idClient);
        }
    return favoritesList;
    
    }
}