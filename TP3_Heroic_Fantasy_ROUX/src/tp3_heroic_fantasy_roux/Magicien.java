/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_roux;

/**
 *
 * @author hugor
 */
public class Magicien extends Personnage {
    private boolean estConfirme;

    // Constructeur pour initialiser nom, niveau de vie, et estConfirme
    public Magicien(String nom, int niveauVie, boolean estConfirme) {
        super(nom, niveauVie);
        this.estConfirme = estConfirme;
    }

    // Getter pour estConfirme
    public boolean isEstConfirme() {
        return estConfirme;
    }

    // Setter pour estConfirme
    public void setEstConfirme(boolean estConfirme) {
        this.estConfirme = estConfirme;
    }

    // Redéfinition de la méthode toString pour afficher les informations du magicien
    @Override
    public String toString() {
        return super.toString() + ", Magicien confirmé: " + estConfirme;
    }
}
