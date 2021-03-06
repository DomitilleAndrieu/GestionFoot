/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entites.HistoriqueEntraineur;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author katia
 */
@Stateless
public class HistoriqueEntraineurFacade extends AbstractFacade<HistoriqueEntraineur> implements HistoriqueEntraineurFacadeLocal {

    @PersistenceContext(unitName = "GestionMatchs-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public HistoriqueEntraineurFacade() {
        super(HistoriqueEntraineur.class);
    }
    
}
