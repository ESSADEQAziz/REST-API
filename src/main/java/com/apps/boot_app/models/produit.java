package com.apps.boot_app.models;


import jakarta.persistence.*;

@Entity
@Table(name = "produit")
public class produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_pro;
    @Column(name="nom")
    private String nom;
    @Column(name = "descr")
    private String descr;

    public int getId() {
        return id_pro;
    }

    public void setId(int id) {
        this.id_pro = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }
}
