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

    // Attribut statique pour le nombre de guerriers
    private static int nombreGuerriers = 0;

    // Constructeur de Guerrier
    public Guerrier(String nom, int niveauDeVie, boolean aCheval) {
        super(nom, niveauDeVie);
        this.aCheval = aCheval;

        // Incrémentation du compteur de guerriers
        nombreGuerriers++;
    }

    // Setter pour aCheval
    public void setACheval(boolean aCheval) {
        this.aCheval = aCheval;
    }

    // Getter pour aCheval
    public boolean isACheval() {
        return aCheval;
    }

    // Méthode statique pour obtenir le nombre de guerriers
    public static int getNombreGuerriers() {
        return nombreGuerriers;
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            nombreGuerriers--;  // Décrémentation lors de la destruction d'un guerrier
        } finally {
            super.finalize();  // Appel à la méthode finalize() de la superclasse
        }
    }
    @Override
    public String toString() {
        return super.toString() + ", A cheval : " + (aCheval ? "Oui" : "Non");
    }
}