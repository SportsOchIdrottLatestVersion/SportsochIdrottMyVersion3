
package com.mariam.SportsochIdrottMyVersion3.model;

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
public class sportstable {

  @Id
  @GeneratedValue
  @Column(name="sports_id")
  private Integer id;
  @Column(name="sports_item")
  private String sportsItem;

    public sportstable() {
    }

    public sportstable(Integer id, String sportsItem) {
        this.id = id;
        this.sportsItem = sportsItem;
    }

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSportsItem() {
        return sportsItem;
    }

    public void setSportsItem(String sportsItem) {
        this.sportsItem = sportsItem;
    }
    
    
  
}

