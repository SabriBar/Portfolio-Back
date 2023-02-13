package com.portfolio.portfolioback.Dto;

import javax.validation.constraints.NotBlank;

public class dtoSkills {

    @NotBlank
    private String skillUrl;
    @NotBlank
    private String rangoUrl;

    public dtoSkills() {
    }

    public dtoSkills(String skillUrl, String rangoUrl) {
        this.skillUrl = skillUrl;
        this.rangoUrl = rangoUrl;
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
