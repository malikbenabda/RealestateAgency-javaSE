/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.interfaces;

import edu.esprit.entites.Client;
import java.util.ArrayList;

/**
 *
 * @author Stark
 */
public interface IClientDAO {

    void activerClientByLogin(String login);

    void ajoutertClient(Client cl);

    void deleteClientByLogin(String login);

    void desactiverClientByLogin(String login);

    Client findClientByLogin(String login);

    ArrayList<Client> getAllClients();

    void modifierClient(Client cl);
 
    Boolean clientExistsByLogin(String login);
    Boolean clientExistsById(int id);
    
    
    ArrayList<Integer> getFavorisIds(int idClient);
    
}
