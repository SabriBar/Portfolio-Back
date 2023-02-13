package com.portfolio.portfolioback.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String descripcionE;
    private String inicioE;
    private String finalizacionE;
    private String cargoE;

    public Experiencia() {
    }

    public Experiencia(String nombreE, String descripcionE, String inicioE, String finalizacionE, String cargoE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.inicioE = inicioE;
        this.finalizacionE = finalizacionE;
        this.cargoE = cargoE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
