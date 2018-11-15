/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

import java.io.Serializable;
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
public class Equipes implements Serializable {

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
        if (!(object instanceof Equipes)) {
            return false;
        }
        Equipes other = (Equipes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entites.Equipes[ id=" + id + " ]";
    }
    
    
@Column (unique=true, nullable=false)
        private int idequipe;

    /**
     * Get the value of idequipe
     *
     * @return the value of idequipe
     */
    public int getIdequipe() {
        return idequipe;
    }

    /**
     * Set the value of idequipe
     *
     * @param idequipe new value of idequipe
     */
    public void setIdequipe(int idequipe) {
        this.idequipe = idequipe;
    }

    
@Column (unique=true, nullable=false)
        private String nomequipe;

    /**
     * Get the value of nomequipe
     *
     * @return the value of nomequipe
     */
    public String getNomequipe() {
        return nomequipe;
    }

    /**
     * Set the value of nomequipe
     *
     * @param nomequipe new value of nomequipe
     */
    public void setNomequipe(String nomequipe) {
        this.nomequipe = nomequipe;
    }

}
