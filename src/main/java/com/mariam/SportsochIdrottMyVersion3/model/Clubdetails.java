/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mariam.SportsochIdrottMyVersion3.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author maria
 */
@Entity
@Table(name = "clubdetails")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clubdetails.findAll", query = "SELECT c FROM Clubdetails c")
    , @NamedQuery(name = "Clubdetails.findByClubid", query = "SELECT c FROM Clubdetails c WHERE c.clubid = :clubid")
    , @NamedQuery(name = "Clubdetails.findByOrgNumber", query = "SELECT c FROM Clubdetails c WHERE c.orgNumber = :orgNumber")
    , @NamedQuery(name = "Clubdetails.findByClubname", query = "SELECT c FROM Clubdetails c WHERE c.clubname = :clubname")
    , @NamedQuery(name = "Clubdetails.findByClubemail", query = "SELECT c FROM Clubdetails c WHERE c.clubemail = :clubemail")
    , @NamedQuery(name = "Clubdetails.findByClubpwd", query = "SELECT c FROM Clubdetails c WHERE c.clubpwd = :clubpwd")
    , @NamedQuery(name = "Clubdetails.findByClubphone", query = "SELECT c FROM Clubdetails c WHERE c.clubphone = :clubphone")
    , @NamedQuery(name = "Clubdetails.findByClubwebsite", query = "SELECT c FROM Clubdetails c WHERE c.clubwebsite = :clubwebsite")})
public class Clubdetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "clubid")
    private Integer clubid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "OrgNumber")
    private String orgNumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "clubname")
    private String clubname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "clubemail")
    private String clubemail;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "clubpwd")
    private String clubpwd;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "clubphone")
    private String clubphone;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "clubwebsite")
    private String clubwebsite;
    @OneToMany(mappedBy = "clubid")
    private Collection<Regionclubmapping> regionclubmappingCollection;
    @OneToMany(mappedBy = "clubid")
    private Collection<Sportsclubmapping> sportsclubmappingCollection;

    public Clubdetails() {
    }

    public Clubdetails(Integer clubid) {
        this.clubid = clubid;
    }

    public Clubdetails(Integer clubid, String orgNumber, String clubname, String clubemail, String clubpwd, String clubphone, String clubwebsite) {
        this.clubid = clubid;
        this.orgNumber = orgNumber;
        this.clubname = clubname;
        this.clubemail = clubemail;
        this.clubpwd = clubpwd;
        this.clubphone = clubphone;
        this.clubwebsite = clubwebsite;
    }

    public Integer getClubid() {
        return clubid;
    }

    public void setClubid(Integer clubid) {
        this.clubid = clubid;
    }

    public String getOrgNumber() {
        return orgNumber;
    }

    public void setOrgNumber(String orgNumber) {
        this.orgNumber = orgNumber;
    }

    public String getClubname() {
        return clubname;
    }

    public void setClubname(String clubname) {
        this.clubname = clubname;
    }

    public String getClubemail() {
        return clubemail;
    }

    public void setClubemail(String clubemail) {
        this.clubemail = clubemail;
    }

    public String getClubpwd() {
        return clubpwd;
    }

    public void setClubpwd(String clubpwd) {
        this.clubpwd = clubpwd;
    }

    public String getClubphone() {
        return clubphone;
    }

    public void setClubphone(String clubphone) {
        this.clubphone = clubphone;
    }

    public String getClubwebsite() {
        return clubwebsite;
    }

    public void setClubwebsite(String clubwebsite) {
        this.clubwebsite = clubwebsite;
    }

    @XmlTransient
    public Collection<Regionclubmapping> getRegionclubmappingCollection() {
        return regionclubmappingCollection;
    }

    public void setRegionclubmappingCollection(Collection<Regionclubmapping> regionclubmappingCollection) {
        this.regionclubmappingCollection = regionclubmappingCollection;
    }

    @XmlTransient
    public Collection<Sportsclubmapping> getSportsclubmappingCollection() {
        return sportsclubmappingCollection;
    }

    public void setSportsclubmappingCollection(Collection<Sportsclubmapping> sportsclubmappingCollection) {
        this.sportsclubmappingCollection = sportsclubmappingCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clubid != null ? clubid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clubdetails)) {
            return false;
        }
        Clubdetails other = (Clubdetails) object;
        if ((this.clubid == null && other.clubid != null) || (this.clubid != null && !this.clubid.equals(other.clubid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mariam1.sportsochIdrottMyVersion4.Clubdetails[ clubid=" + clubid + " ]";
    }
    
}
