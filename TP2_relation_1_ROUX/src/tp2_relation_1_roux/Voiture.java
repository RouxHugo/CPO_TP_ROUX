/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_roux;

/**
 *
 * @author hugor
 */
public class Voiture {
     String modele;
     String marque;
     int puissanceCV;
     Personne Proprietaire ;

    // Constructeur
    public Voiture(String modele, String marque, int puissanceCV) {
        this.modele = modele;
        this.marque = marque;
        this.puissanceCV = puissanceCV;
        this.Proprietaire = null;
    }
     // Méthode toString() pour afficher les informations de la voiture
    @Override
    public String toString() {
        return "Voiture{" +
                "modèle='" + modele + '\'' +
                ", marque='" + marque + '\'' +
                ", puissance=" + puissanceCV + "CV" +
                '}';
    }
}

