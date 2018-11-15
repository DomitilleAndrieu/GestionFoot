/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author domitille
 */
@Entity
public class Joueurs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joueurs)) {
            return false;
        }
        Joueurs other = (Joueurs) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entites.Joueurs[ id=" + id + " ]";
    }
    
    
@Column (unique=true, nullable=false)
        private int idjoueur;

    /**
     * Get the value of idjoueur
     *
     * @return the value of idjoueur
     */
    public int getIdjoueur() {
        return idjoueur;
    }

    /**
     * Set the value of idjoueur
     *
     * @param idjoueur new value of idjoueur
     */
    public void setIdjoueur(int idjoueur) {
        this.idjoueur = idjoueur;
    }

    
@Column (nullable=false)
        private String nomjoueur;

    /**
     * Get the value of nomjoueur
     *
     * @return the value of nomjoueur
     */
    public String getNomjoueur() {
        return nomjoueur;
    }

    /**
     * Set the value of nomjoueur
     *
     * @param nomjoueur new value of nomjoueur
     */
    public void setNomjoueur(String nomjoueur) {
        this.nomjoueur = nomjoueur;
    }

    
@Column (nullable=false)
        private Date dnaissjoueur;

    /**
     * Get the value of dnaissjoueur
     *
     * @return the value of dnaissjoueur
     */
    public Date getDnaissjoueur() {
        return dnaissjoueur;
    }

    /**
     * Set the value of dnaissjoueur
     *
     * @param dnaissjoueur new value of dnaissjoueur
     */
    public void setDnaissjoueur(Date dnaissjoueur) {
        this.dnaissjoueur = dnaissjoueur;
    }

    
        private String infosjoueur;

    /**
     * Get the value of infosjoueur
     *
     * @return the value of infosjoueur
     */
    public String getInfosjoueur() {
        return infosjoueur;
    }

    /**
     * Set the value of infosjoueur
     *
     * @param infosjoueur new value of infosjoueur
     */
    public void setInfosjoueur(String infosjoueur) {
        this.infosjoueur = infosjoueur;
    }

}
