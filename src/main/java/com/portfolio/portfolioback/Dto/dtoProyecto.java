package com.portfolio.portfolioback.Dto;

import javax.validation.constraints.NotBlank;

public class dtoProyecto {

    @NotBlank
    private String nombreP;
    @NotBlank
    private String linkP;
    @NotBlank
    private String descripcionP;
    @NotBlank
    private String fechaP;

    public dtoProyecto() {
    }

    public dtoProyecto(String nombreP, String linkP, String descripcionP, String fechaP) {
        this.nombreP = nombreP;
        this.linkP = linkP;
        this.descripcionP = descripcionP;
        this.fechaP = fechaP;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getLinkP() {
        return linkP;
    }

    public void setLinkP(String linkP) {
        this.linkP = linkP;
    }

    public String getDescripcionP() {
        return descripcionP;
    }

    public void setDescripcionP(String descripcionP) {
        this.descripcionP = descripcionP;
    }

    public String getFechaP() {
        return fechaP;
    }

    public void setFechaP(String fechaP) {
        this.fechaP = fechaP;
    }

    
    
}
