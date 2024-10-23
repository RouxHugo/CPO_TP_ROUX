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
    // Attributs
    String modele;
    String marque;
    int puissanceCV;
    Personne proprietaire;
    // Constructeur
    public Voiture(String modele, String marque, int puissanceCV) {
        this.modele = modele;
        this.marque = marque;
        this.puissanceCV = puissanceCV;
        this.proprietaire = null;
}

    // Méthode toString pour représenter l'objet sous forme de chaîne de caractères
    @Override
    public String toString() {
return "Voiture{" +"modèle='" + modele + '\'' +", marque='" + marque + '\'' + ", puissanceCV=" + puissanceCV +", proprietaire=" + (proprietaire != null ? proprietaire.getNom() + " " + proprietaire.getPrenom() : "Aucun") +'}';    }
    // Getters et setters (si nécessaire)
    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getPuissanceCV() {
        return puissanceCV;
    }

    public void setPuissanceCV(int puissanceCV) {
        this.puissanceCV = puissanceCV;
    }
    public void setProprietaire(Personne proprietaire) {
        this.proprietaire = proprietaire;
    }
}