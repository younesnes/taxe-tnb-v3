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
public class Terrain {
    
    private int id;
    private String ref;
    private int rue;
    private double surface;
    private Redevable redevable;
    private Categorie categorie;

    public Terrain() {
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public int getRue() {
        return rue;
    }

    public void setRue(int rue) {
        this.rue = rue;
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    public Redevable getRedevable() {
        return redevable;
    }

    public void setRedevable(Redevable redevable) {
        this.redevable = redevable;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    
    @Override
    public String toString() {
        return "Terrain{" + "id=" + id + ", ref=" + ref + ", rue=" + rue + ", surface=" + surface + ", redevable=" + redevable + '}';
    }
}
