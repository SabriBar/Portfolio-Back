
package com.portfolio.portfolioback.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String skillUrl;
    private String rangoUrl;

    public Skills() {
    }

    public Skills(String skillUrl, String rangoUrl) {
        this.skillUrl = skillUrl;
        this.rangoUrl = rangoUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSkillUrl() {
        return skillUrl;
    }

    public void setSkillUrl(String skillUrl) {
        this.skillUrl = skillUrl;
    }

    public String getRangoUrl() {
        return rangoUrl;
    }

    public void setRangoUrl(String rangoUrl) {
        this.rangoUrl = rangoUrl;
    }

   
}
