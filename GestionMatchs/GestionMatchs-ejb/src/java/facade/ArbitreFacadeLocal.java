/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entites.Arbitre;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author katia
 */
@Local
public interface ArbitreFacadeLocal {

    void create(Arbitre arbitre);

    void edit(Arbitre arbitre);

    void remove(Arbitre arbitre);

    Arbitre find(Object id);

    List<Arbitre> findAll();

    List<Arbitre> findRange(int[] range);

    int count();
    
}
