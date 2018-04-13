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
@Table(name = "regionclubmapping")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Regionclubmapping.findAll", query = "SELECT r FROM Regionclubmapping r")
    , @NamedQuery(name = "Regionclubmapping.findByRcmid", query = "SELECT r FROM Regionclubmapping r WHERE r.rcmid = :rcmid")})
public class Regionclubmapping implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "rcmid")
    private Integer rcmid;
    @JoinColumn(name = "clubid", referencedColumnName = "clubid")
    @ManyToOne
    private Clubdetails clubid;
    @JoinColumn(name = "region_id", referencedColumnName = "region_id")
    @ManyToOne
    private region regionId;

    public Regionclubmapping() {
    }

    public Regionclubmapping(Integer rcmid) {
        this.rcmid = rcmid;
    }

    public Integer getRcmid() {
        return rcmid;
    }

    public void setRcmid(Integer rcmid) {
        this.rcmid = rcmid;
    }

    public Clubdetails getClubid() {
        return clubid;
    }

    public void setClubid(Clubdetails clubid) {
        this.clubid = clubid;
    }

    public region getRegionId() {
        return regionId;
    }

    public void setRegionId(region regionId) {
        this.regionId = regionId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rcmid != null ? rcmid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Regionclubmapping)) {
            return false;
        }
        Regionclubmapping other = (Regionclubmapping) object;
        if ((this.rcmid == null && other.rcmid != null) || (this.rcmid != null && !this.rcmid.equals(other.rcmid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mariam1.SportsochIdrottMyVersion3.model.Regionclubmapping[ rcmid=" + rcmid + " ]";
    }
    
}
