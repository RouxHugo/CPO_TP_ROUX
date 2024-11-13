/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import Armes.Baton;
import Armes.Epee;
import java.util.ArrayList;

/**
 *
 * @author hugor
 */
public abstract class Personnage {
    private String nom;
    private int niveauVie;
    private ArrayList<Arme> inventaire;  // Liste dynamique d'armes avec limite de 5
    private Arme armeEnMain;  // Arme actuellement équipée (initialisée à null)
    
    // Attribut statique pour compter le nombre total de personnages
    private static int nombrePersonnages = 0;

    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
        this.inventaire = new ArrayList<>();
        this.armeEnMain = null;
        
        // Incrémenter le compteur de personnages lors de la création
        nombrePersonnages++;
    }

    // Méthode statique pour obtenir le nombre de personnages
    public static int getNombrePersonnages() {
        return nombrePersonnages;
    }
    
    public int getNiveauVie() {
        return niveauVie;
    }
    
    public String getNom() {
        return nom;
    }

    // 32. Méthode pour ajouter une arme à l'inventaire (max 5 armes)
    public void ajouterArme(Arme arme) {
        if (inventaire.size() < 5) {
            inventaire.add(arme);
            System.out.println("Arme " + arme.getNom() + " ajoutée à l'inventaire de " + nom);
        } else {
            System.out.println("Inventaire plein ! Impossible d'ajouter l'arme " + arme.getNom());
        }
    }

    // 34. Getter pour obtenir l'arme actuellement équipée
    public Arme getArmeEnMain() {
        return armeEnMain;
    }
    
    // 35. Méthode pour équiper une arme par son nom
    public void equiperArme(String nomArme) {
        for (Arme arme : inventaire) {
            if (arme.getNom().equals(nomArme)) {
                armeEnMain = arme;
                System.out.println(nom + " a équipé l'arme " + nomArme);
                return;
            }
        }
        System.out.println("L'arme " + nomArme + " n'est pas dans l'inventaire de " + nom);
    }
    
    public int compterArmesDePredilection() {
        int compteur = 0;
        for (Arme arme : inventaire) {
            if ((this instanceof Guerrier && arme instanceof Epee) ||
                (this instanceof Magicien && arme instanceof Baton)) {
                compteur++;
            }
        }
        return compteur;
    }

    // 36. Modification de toString() pour inclure l'arme en main, s'il y en a une
    @Override
    public String toString() {
        String description = "Nom : " + nom + ", Niveau de Vie : " + niveauVie;
        if (armeEnMain != null) {
            description += ", Arme en Main : " + armeEnMain;
        } else {
            description += ", Pas d'arme équipée";
        }
        return description;
    }
}