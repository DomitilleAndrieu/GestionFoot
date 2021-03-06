/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entites.HistoriqueJoueur;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author katia
 */
@Local
public interface HistoriqueJoueurFacadeLocal {

    void create(HistoriqueJoueur historiqueJoueur);

    void edit(HistoriqueJoueur historiqueJoueur);

    void remove(HistoriqueJoueur historiqueJoueur);

    HistoriqueJoueur find(Object id);

    List<HistoriqueJoueur> findAll();

    List<HistoriqueJoueur> findRange(int[] range);

    int count();
    
}
