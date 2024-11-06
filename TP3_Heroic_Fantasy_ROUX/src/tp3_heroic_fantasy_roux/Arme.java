/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_roux;

/**
 *
 * @author hugor
 */
abstract class Arme {
    String nom;
    int nv_attaque;
    
    public int getnv_attaque(){
        return nv_attaque ;
    }    
     public String getnom(){
        return nom ;
    }    
    
    public Arme(String nom, int niveauAttaque) {
        this.nom = nom;
        // On s'assure que le niveau d'attaque ne dépasse pas 100
        if (niveauAttaque <= 100) {
            this.nv_attaque = niveauAttaque;
        } else {
            this.nv_attaque = 100; // Limite le niveau d'attaque à 100 si dépassement
        }
    }

    // La méthode toString() doit être avec un "t" minuscule
    @Override
        public String toString() {
        return "Arme: " + nom + ", Niveau d'attaque: " + nv_attaque;
    }
}
