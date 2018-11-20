/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entites.Joueurs;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author katia
 */
@Stateless
public class JoueursFacade extends AbstractFacade<Joueurs> implements JoueursFacadeLocal {

    @PersistenceContext(unitName = "GestionMatchs-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public JoueursFacade() {
        super(Joueurs.class);
    }
    
}
