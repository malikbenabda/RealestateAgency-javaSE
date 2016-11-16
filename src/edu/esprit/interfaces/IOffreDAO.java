/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.interfaces;

import edu.esprit.entites.Offre;
import java.util.List;

/**
 *
 * @author Mejri ALA
 */
public interface IOffreDAO {
    
    public Void CreerOffre (Offre offre);
    public Void modifierOffre (Offre offre);
    public Void supprimerOffre (Offre offre);
    public List<Offre> ListerOffre();
    public List<Offre> rechercherOffreByType(String typeProprietaire);
    public List<Offre> rechercherOffreByNature(String natureOffre);
    public List<Offre> rechercherOffreByMinPrix(Float minPrix);
    public List<Offre> rechercherOffreByMaxPrix(Float maxPrix);
    public List<Offre> rechercherOffreByAdresse(String adresseOffre);
    
}