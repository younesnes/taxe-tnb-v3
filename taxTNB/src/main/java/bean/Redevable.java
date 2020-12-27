/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.List;

/**
 *
 * @author khaoula
 */
public class Redevable {
    private int id;
    private String cin;
    private String nom;
    private String prenom;
    private  List<Terrain> terrains;

    public Redevable() {
    }

    public Redevable(int id, String cin, String nom, String prenom) {
        this.id = id;
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public List<Terrain> getTerrains() {
        return terrains;
    }

    public void setTerrains(List<Terrain> terrains) {
        this.terrains = terrains;
    }
    
    
    
    
}
