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
import javax.persistence.Query;

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
    public void creerEquipe(long idequipe, String nomequipe) {
        Equipes e = new Equipes();
        e.setId(idequipe);
        e.setNomequipe(nomequipe);
        em.persist(e);
    }

    @Override
    public Equipes rechercherEquipe(String nomequipe) {
        String req = "SELECT e from Equipe as e where e.nom=:n";
        Query requete = em.createQuery(req);
        requete.setParameter("n", nomequipe);
        Equipes e = (Equipes) requete.getSingleResult();
        return e;
    }


    
    
}
