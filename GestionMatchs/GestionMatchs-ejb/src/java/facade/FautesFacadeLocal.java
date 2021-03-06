/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entites.Fautes;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author katia
 */
@Local
public interface FautesFacadeLocal {

    void create(Fautes fautes);

    void edit(Fautes fautes);

    void remove(Fautes fautes);

    Fautes find(Object id);

    List<Fautes> findAll();

    List<Fautes> findRange(int[] range);

    int count();
    
}
