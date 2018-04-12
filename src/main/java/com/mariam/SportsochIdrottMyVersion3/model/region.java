/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mariam.SportsochIdrottMyVersion3.model;

/**
 *
 * @author maria
 */

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author maria
 */
@Entity
public class region {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name="region_id")
  private Integer regionid;
  @Column(name="region_name")
  private String regionname;

    public region() {
    }

    public region(Integer regionid, String regionname) {
        this.regionid = regionid;
        this.regionname = regionname;
    }

    public Integer getRegionid() {
        return regionid;
    }

    public void setRegionid(Integer regionid) {
        this.regionid = regionid;
    }

    public String getRegionname() {
        return regionname;
    }

    public void setRegionname(String regionname) {
        this.regionname = regionname;
    }

    
    
  
}

