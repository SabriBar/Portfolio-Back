
package com.portfolio.portfolioback.Dto;

import javax.validation.constraints.NotBlank;


public class dtoPersona {
  
    @NotBlank
    private String nombre;
    @NotBlank
    private String apellido; 
    @NotBlank
    private String titulo;
    @NotBlank
    private String provincia;
    @NotBlank
    private String correoElectronico;
    @NotBlank
    private String acercaDeMi; 
    @NotBlank
    private String url;

    public dtoPersona() {
    }

    public dtoPersona(String nombre, String apellido, String titulo, String provincia, String correoElectronico, String acercaDeMi, String url) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.provincia = provincia;
        this.correoElectronico = correoElectronico;
        this.acercaDeMi = acercaDeMi;
        this.url = url;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getAcercaDeMi() {
        return acercaDeMi;
    }

    public void setAcercaDeMi(String acercaDeMi) {
        this.acercaDeMi = acercaDeMi;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    
    
}
