/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_roux;

/**
 *
 * @author hugor
 */
public abstract class Personnage {
    private String nom;
    private int niveauVie;

    // Constructeur pour initialiser le nom et le niveau de vie
    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
    }

    // Méthode pour obtenir le niveau de vie
    public int getNiveauVie() {
        return niveauVie;
    }

    // Méthode pour obtenir le nom
    public String getNom() {
        return nom;
    }

    // Méthode toString redéfinie pour afficher le nom et le niveau de vie
    @Override
    public String toString() {
        return "Nom: " + nom + ", Niveau de vie: " + niveauVie;
    }
}
    
