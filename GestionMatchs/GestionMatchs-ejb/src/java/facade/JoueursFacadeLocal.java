/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entites.Joueurs;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author katia
 */
@Local
public interface JoueursFacadeLocal {

    void create(Joueurs joueurs);

    void edit(Joueurs joueurs);

    void remove(Joueurs joueurs);

    Joueurs find(Object id);

    List<Joueurs> findAll();

    List<Joueurs> findRange(int[] range);

    int count();
    
}
