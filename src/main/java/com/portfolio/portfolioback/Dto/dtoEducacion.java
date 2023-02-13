package com.portfolio.portfolioback.Dto;

import javax.validation.constraints.NotBlank;

public class dtoEducacion {

    @NotBlank
    private String tituloE;
    @NotBlank
    private String institucionE;
    @NotBlank
    private String tipoE;
    @NotBlank
    private String inicioEdu;
    @NotBlank
    private String finalizacionEdu;

    public dtoEducacion() {
    }

    public dtoEducacion(String tituloE, String institucionE, String tipoE, String inicioEdu, String finalizacionEdu) {
        this.tituloE = tituloE;
        this.institucionE = institucionE;
        this.tipoE = tipoE;
        this.inicioEdu = inicioEdu;
        this.finalizacionEdu = finalizacionEdu;
    }

    public String getTituloE() {
        return tituloE;
    }

    public void setTituloE(String tituloE) {
        this.tituloE = tituloE;
    }

    public String getInstitucionE() {
        return institucionE;
    }

    public void setInstitucionE(String institucionE) {
        this.institucionE = institucionE;
    }

    public String getTipoE() {
        return tipoE;
    }

    public void setTipoE(String tipoE) {
        this.tipoE = tipoE;
    }

    public String getInicioEdu() {
        return inicioEdu;
    }

    public void setInicioEdu(String inicioEdu) {
        this.inicioEdu = inicioEdu;
    }

    public String getFinalizacionEdu() {
        return finalizacionEdu;
    }

    public void setFinalizacionEdu(String finalizacionEdu) {
        this.finalizacionEdu = finalizacionEdu;
    }

    
    
}
