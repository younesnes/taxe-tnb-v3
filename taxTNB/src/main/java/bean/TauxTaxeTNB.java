/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author khaoula
 */
public class TauxTaxeTNB {
    
    private Categorie categorie;
    private double surfaceMin;
    private double surfaceMax;
    private double prixParMetre;

    public TauxTaxeTNB() {
    }

    public TauxTaxeTNB(Categorie categorie, double surfaceMin, double surfaceMax, double prixParMetre) {
        this.categorie = categorie;
        this.surfaceMin = surfaceMin;
        this.surfaceMax = surfaceMax;
        this.prixParMetre = prixParMetre;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public double getSurfaceMin() {
        return surfaceMin;
    }

    public void setSurfaceMin(double surfaceMin) {
        this.surfaceMin = surfaceMin;
    }

    public double getSurfaceMax() {
        return surfaceMax;
    }

    public void setSurfaceMax(double surfaceMax) {
        this.surfaceMax = surfaceMax;
    }

    public double getPrixParMetre() {
        return prixParMetre;
    }

    public void setPrixParMetre(double prixParMetre) {
        this.prixParMetre = prixParMetre;
    }
    
    
    
}
