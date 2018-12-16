package com.sim.ws.SimProject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Bug {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String videojoc;
    private String usuari;
    private Date dataDelBug;
    private String plataforma;
    private String paisDeConexio;
    private String email;
    private String descripcioBreu;
    private String descripcio;
    private String categoria;
    private String prioritat;
    private String estat;

    public Bug() {
    }

    public Bug(String videojoc, String usuari, Date dataDelBug, String plataforma, String paisDeConexio, String email, String descripcioBreu, String descripcio, String categoria, String prioritat, String estat) {
        this.videojoc = videojoc;
        this.usuari = usuari;
        this.dataDelBug = dataDelBug;
        this.plataforma = plataforma;
        this.paisDeConexio = paisDeConexio;
        this.email = email;
        this.descripcioBreu = descripcioBreu;
        this.descripcio = descripcio;
        this.categoria = categoria;
        this.prioritat = prioritat;
        this.estat = estat;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVideojoc() {
        return videojoc;
    }

    public void setVideojoc(String videojoc) {
        this.videojoc = videojoc;
    }

    public String getUsuari() {
        return usuari;
    }

    public void setUsuari(String usuari) {
        this.usuari = usuari;
    }

    public Date getDataDelBug() {
        return dataDelBug;
    }

    public void setDataDelBug(Date dataDelBug) {
        this.dataDelBug = dataDelBug;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getPaisDeConexio() {
        return paisDeConexio;
    }

    public void setPaisDeConexio(String paisDeConexio) {
        this.paisDeConexio = paisDeConexio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescripcioBreu() {
        return descripcioBreu;
    }

    public void setDescripcioBreu(String descripcioBreu) {
        this.descripcioBreu = descripcioBreu;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPrioritat() {
        return prioritat;
    }

    public void setPrioritat(String prioritat) {
        this.prioritat = prioritat;
    }

    public String getEstat() {
        return estat;
    }

    public void setEstat(String estat) {
        this.estat = estat;
    }
}
