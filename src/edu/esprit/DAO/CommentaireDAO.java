package edu.esprit.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.esprit.entites.Commentaire;
import edu.esprit.interfaces.ICommentaireDAO;
import edu.esprit.technique.MyConnection;

public class CommentaireDAO implements ICommentaireDAO {

	
	private Connection connection;

	public CommentaireDAO() {
		connection = MyConnection.getInstance();
	}
	
	 
	
	public Void AjouterCommentaire (Commentaire commentaire){
		 
		 String requete="insert into Commentaire (IdCommentaire,idOffre,idOwner,dateAjout,Contenu) values(?,?,?,?,?)";
	     PreparedStatement ps; 
		 
	     try {
			ps = connection.prepareStatement(requete);
			
			ps.setInt(1, commentaire.getIdCommentaire());
	        ps.setInt(2, commentaire.getIdOffre());
	        ps.setInt(3, commentaire.getIdOwner());
	        ps.setString(4, commentaire.getDateAjout());
	        ps.setString(5, commentaire.getContenu());
	        
	        ps.executeUpdate();
            System.out.println("Ajout de Commentaire effectuée avec succès");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erreur lors de la création d'offre");
		}
	     
		 return null;
	 }
	
	 
	
	
	 public Void supprimerCommentaire (Commentaire commentaire){
	        String requete="delete from Commentaire where IdCommentaire=?";
	                PreparedStatement ps;
	        try {
	            ps = connection.prepareStatement(requete);
	            ps.setInt(1, commentaire.getIdCommentaire());
	            ps.executeUpdate();
	            System.out.println("Suppression de Commentaire effectuée avec succès");
	        } catch (SQLException ex) {
	            Logger.getLogger(OffreDAO.class.getName()).log(Level.SEVERE, null, ex);
	            System.out.println("erreur lors de la Suppression de Commentaire");
	        }   
	        return null;
	    }
	 
	 
	 
	    public List<Commentaire> ListerCommentaire(){
	        
	        List<Commentaire> listeCommentaire = new ArrayList<Commentaire>();
	        try {
	            String requete="select * from Commentaire ";
	            PreparedStatement ps;
	            ps = connection.prepareStatement(requete);
	            ResultSet rs= ps.executeQuery();
	            
	            while(rs.next()){
	               Commentaire commentaire = new Commentaire();
	               
	               commentaire.setIdCommentaire(rs.getInt(1));
	               commentaire.setIdOffre(rs.getInt(2));
	               commentaire.setIdOwner(rs.getInt(3));
	               commentaire.setDateAjout(rs.getString(4));
	               commentaire.setContenu(rs.getString(5));
	   
	               listeCommentaire.add(commentaire);
	               
	            }
	            System.out.println(listeCommentaire);
	            return listeCommentaire;
	            
	        } catch (SQLException ex) {
	            Logger.getLogger(OffreDAO.class.getName()).log(Level.SEVERE, null, ex);
	            return null;        
	        }    
	    }
	 
	 
	 
}
