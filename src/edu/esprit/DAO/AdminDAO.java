
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.DAO;

import edu.esprit.entites.Administrateur;
import edu.esprit.interfaces.IAdminDAO;
import edu.esprit.technique.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Stark
 */
public class AdminDAO implements IAdminDAO{

       private Connection connection;
    private static AdminDAO admdao;
    
    
        private AdminDAO() {
        connection = MyConnection.getInstance();
    }

    public static AdminDAO getInstance() {
        if (admdao == null) {
            admdao = new AdminDAO();
        }
        return admdao;
    }
    
    
    @Override
    public Boolean modifierAdmin(Administrateur ad) {
       String requete = "UPDATE administrateur SET `password`= ? ,`nom`= ? ,`prenom`= ? ,`email`= ? ,`dateNaissance`= ? ,`adresse`= ? ,`telephone`= ?  "
                + "WHERE login='" + ad.getLogin() + "'            ";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setString(1, ad.getPassword());
            ps.setString(2, ad.getNom());
            ps.setString(3, ad.getPrenom());
            ps.setString(4, ad.getEmail());
            ps.setString(5, ad.getDateNaissance().toString());
            ps.setString(6, ad.getAdresse());
            ps.setInt(7, ad.getTelephone());

            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
            return Boolean.TRUE;
        } catch (SQLException ex) {
         System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        return  Boolean.FALSE;
        }
    
    }

    @Override
    public Boolean ajouterAdmin(Administrateur ad) {
      String requete = "INSERT INTO `realestateagency`.`Administrateur` "
                + "(`login`, `password`, `nom`, `prenom`, `email`, `dateNaissance`, `adresse`, `telephone`) "
                + "VALUES ( ? ,  ? ,  ? ,  ? ,  ? ,  ? ,  ? ,  ? );";
        try {
            PreparedStatement ps = connection.prepareStatement(requete);

            ps.setString(1, ad.getLogin());
            ps.setString(2, ad.getPassword());
            ps.setString(3, ad.getNom());
            ps.setString(4, ad.getPrenom());
            ps.setString(5, ad.getEmail());
            ps.setString(6, ad.getDateNaissance().toString());
            ps.setString(7, ad.getAdresse());
            ps.setInt(8, ad.getTelephone());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
            return Boolean.TRUE;
        } catch (SQLException ex) {
         System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        return  Boolean.FALSE;
        }
    
    
    
    }
    
}