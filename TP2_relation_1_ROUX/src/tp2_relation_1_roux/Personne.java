/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_roux;

/**
 *
 * @author hugor
 */
public class Personne {
     String nom;
     String prenom;
     int nbVoitures ;
    Voiture [] liste_voitures ;

    // Constructeur
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        liste_voitures = new Voiture [3] ;
        this.nbVoitures = 0;
    }

    // Méthode toString() pour afficher les informations de la personne
    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prénom='" + prenom + '\'' +
                '}';
    }
    
}
