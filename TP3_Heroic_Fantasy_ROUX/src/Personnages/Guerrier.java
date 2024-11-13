/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author hugor
 */
public class Guerrier extends Personnage {
    private boolean aCheval;

    // Constructeur pour initialiser nom, niveau de vie, et aCheval
    public Guerrier(String nom, int niveauVie, boolean aCheval) {
        super(nom, niveauVie);
        this.aCheval = aCheval;
    }

    // Getter pour aCheval
    public boolean isACheval() {
        return aCheval;
    }

    // Setter pour aCheval
    public void setACheval(boolean aCheval) {
        this.aCheval = aCheval;
    }

    // Redéfinition de la méthode toString pour afficher les informations du guerrier
    @Override
    public String toString() {
        return super.toString() + ", Guerrier à cheval: " + aCheval;
    }
}
