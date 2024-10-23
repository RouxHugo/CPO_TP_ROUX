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
    // Attributs
    String nom;
    String prenom;
    int nbVoitures;
    Voiture[] liste_voitures;

    // Constructeur
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.nbVoitures = 0;
        liste_voitures = new Voiture[3];
    }

    // Méthode pour ajouter une voiture
    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {
        // Vérifie si la voiture a déjà un propriétaire
        if (voiture_a_ajouter.proprietaire != null) {
            return false; // La voiture a déjà un propriétaire, l'ajout échoue
        }

        // Vérifie si le nombre de voitures est inférieur à 3
        if (this.nbVoitures >= 3) {
            return false; // Limite atteinte, l'ajout échoue
        }

        // Ajout de la voiture
        liste_voitures[this.nbVoitures] = voiture_a_ajouter; // Ajoute la voiture au tableau
        this.nbVoitures++; // Incrémente le nombre de voitures possédées
        voiture_a_ajouter.proprietaire = this; // Définit le propriétaire de la voiture
        return true; // L'ajout s'est bien passé
    }

    // Méthode toString pour représenter l'objet sous forme de chaîne de caractères
    @Override
    public String toString() {
        return "Personne{" + "nom='" + nom + '\'' + ", prenom='" + prenom + '\'' + '}';
    }

    // Getters et setters (si nécessaire)
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}