/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.interfaces;

import edu.esprit.entites.Commentaire;
import java.util.List;

/**
 *
 * @author Soul Slayer
 */
public interface ICommentaireDAO {
 
    public Void AjouterCommentaire (Commentaire commentaire);
    public Void supprimerCommentaire (Commentaire commentaire);
    public List<Commentaire> ListerCommentaire();
}
