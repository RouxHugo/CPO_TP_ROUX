/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author hugor
 */
public class Magicien extends Personnage {
    private boolean confirme;

    // Attribut statique pour le nombre de magiciens
    private static int nombreMagiciens = 0;

    // Constructeur de Magicien
    public Magicien(String nom, int niveauDeVie, boolean confirme) {
        super(nom, niveauDeVie);
        this.confirme = confirme;

        // Incrémentation du compteur de magiciens
        nombreMagiciens++;
    }

    // Setter pour confirme
    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }

    // Getter pour confirme
    public boolean estConfirme() {
        return confirme;
    }

    // Méthode statique pour obtenir le nombre de magiciens
    public static int getNombreMagiciens() {
        return nombreMagiciens;
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            nombreMagiciens--;  // Décrémentation lors de la destruction d'un magicien
        } finally {
            super.finalize();  // Appel à la méthode finalize() de la superclasse
        }
    }
    @Override
    public String toString() {
        return super.toString() + ", Confirme : " + (confirme ? "Oui" : "Non");
    }
}