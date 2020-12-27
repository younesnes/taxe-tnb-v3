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
public class TaxeTNB {
    
    private Redevable redevable;
    private Terrain terrain;
    private int annee;
    private double mtBase;

    public TaxeTNB() {
    }

    public TaxeTNB(Redevable redevable, Terrain terrain, int annee, double mtBase) {
        this.redevable = redevable;
        this.terrain = terrain;
        this.annee = annee;
        this.mtBase = mtBase;
    }

    public Redevable getRedevable() {
        return redevable;
    }

    public void setRedevable(Redevable redevable) {
        this.redevable = redevable;
    }

    

   

    public Terrain getTerrain() {
        return terrain;
    }

    public void setTerrain(Terrain terrain) {
        this.terrain = terrain;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public double getMtBase() {
        return mtBase;
    }

    public void setMtBase(double mtBase) {
        this.mtBase = mtBase;
    }

    @Override
    public String toString() {
        return "TaxeTNB{" + "redevable=" + redevable + ", terrain=" + terrain + ", annee=" + annee + ", mtBase=" + mtBase + '}';
    }

    
    
    
}
