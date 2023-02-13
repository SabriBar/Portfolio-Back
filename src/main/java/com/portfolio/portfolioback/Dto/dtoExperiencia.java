
package com.portfolio.portfolioback.Dto;

import javax.validation.constraints.NotBlank;


public class dtoExperiencia {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private String inicioE;
    @NotBlank
    private String finalizacionE;
    @NotBlank
    private String cargoE;

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String descripcionE, String inicioE, String finalizacionE, String cargoE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.inicioE = inicioE;
        this.finalizacionE = finalizacionE;
        this.cargoE = cargoE;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getInicioE() {
        return inicioE;
    }

    public void setInicioE(String inicioE) {
        this.inicioE = inicioE;
    }
    
      public String getFinalizacionE() {
        return finalizacionE;
    }

    public void setFinalizacionE(String finalizacionE) {
        this.finalizacionE = finalizacionE;
    }
    
        public String getCargoE() {
        return cargoE;
    }

    public void setCargoE(String cargoE) {
        this.cargoE = cargoE;
    }
    
}
