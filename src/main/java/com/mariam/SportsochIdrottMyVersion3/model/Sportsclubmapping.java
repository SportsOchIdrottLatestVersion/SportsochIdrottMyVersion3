/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mariam.SportsochIdrottMyVersion3.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author maria
 */
@Entity
@Table(name = "sportsclubmapping")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sportsclubmapping.findAll", query = "SELECT s FROM Sportsclubmapping s")
    , @NamedQuery(name = "Sportsclubmapping.findByScmid", query = "SELECT s FROM Sportsclubmapping s WHERE s.scmid = :scmid")
    , @NamedQuery(name = "Sportsclubmapping.findByAgemin", query = "SELECT s FROM Sportsclubmapping s WHERE s.agemin = :agemin")
    , @NamedQuery(name = "Sportsclubmapping.findByAgemax", query = "SELECT s FROM Sportsclubmapping s WHERE s.agemax = :agemax")})
public class Sportsclubmapping implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "scmid")
    private Integer scmid;
    @Column(name = "Agemin")
    private Integer agemin;
    @Column(name = "Agemax")
    private Integer agemax;
    @JoinColumn(name = "clubid", referencedColumnName = "clubid")
    @ManyToOne
    private Clubdetails clubid;
    @JoinColumn(name = "sports_id", referencedColumnName = "sports_id")
    @ManyToOne
    private sportstable sportsId;

    public Sportsclubmapping() {
    }

    public Sportsclubmapping(Integer scmid) {
        this.scmid = scmid;
    }

    public Integer getScmid() {
        return scmid;
    }

    public void setScmid(Integer scmid) {
        this.scmid = scmid;
    }

    public Integer getAgemin() {
        return agemin;
    }

    public void setAgemin(Integer agemin) {
        this.agemin = agemin;
    }

    public Integer getAgemax() {
        return agemax;
    }

    public void setAgemax(Integer agemax) {
        this.agemax = agemax;
    }

    public Clubdetails getClubid() {
        return clubid;
    }

    public void setClubid(Clubdetails clubid) {
        this.clubid = clubid;
    }

    public sportstable getSportsId() {
        return sportsId;
    }

    public void setSportsId(sportstable sportsId) {
        this.sportsId = sportsId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (scmid != null ? scmid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sportsclubmapping)) {
            return false;
        }
        Sportsclubmapping other = (Sportsclubmapping) object;
        if ((this.scmid == null && other.scmid != null) || (this.scmid != null && !this.scmid.equals(other.scmid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mariam.SportsochIdrottMyVersion3.model.Sportsclubmapping[ scmid=" + scmid + " ]";
    }
    
}
