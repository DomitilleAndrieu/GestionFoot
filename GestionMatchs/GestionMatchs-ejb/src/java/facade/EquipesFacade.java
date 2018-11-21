/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entites.Equipes;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author katia
 */
@Stateless
public class EquipesFacade extends AbstractFacade<Equipes> implements EquipesFacadeLocal {

    @PersistenceContext(unitName = "GestionMatchs-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EquipesFacade() {
        super(Equipes.class);
    }

    @Override
    public void creerEquipe(int idequipe, String nomequipe) {
        Equipes e = new Equipes();
        e.setIdequipe(idequipe);
        e.setNomequipe(nomequipe);
        em.persist(e);
        
    }
    
    
    
    
    
    
}
