
package com.portfolio.portfolioback.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String tituloE;
    private String institucionE;
    private String tipoE;
    private String inicioEdu;
    private String finalizacionEdu;

    public Educacion() {
    }

    public Educacion(String tituloE, String institucionE, String tipoE, String inicioEdu, String finalizacionEdu) {
        this.tituloE = tituloE;
        this.institucionE = institucionE;
        this.tipoE = tipoE;
        this.inicioEdu = inicioEdu;
        this.finalizacionEdu = finalizacionEdu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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