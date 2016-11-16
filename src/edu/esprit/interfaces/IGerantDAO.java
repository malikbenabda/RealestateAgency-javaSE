/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.interfaces;

import edu.esprit.entites.Gerant;
import java.util.List;


/**
 *
 * @author Oussama
 */
public interface IGerantDAO {
    
    void insertGerant(Gerant G);

    void updateGerant(Gerant G);

    void deleteGerant(int idCompte);
            
    List<Gerant> displayAllGerant();
}
