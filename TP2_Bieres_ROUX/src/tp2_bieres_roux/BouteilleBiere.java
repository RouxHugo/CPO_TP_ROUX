/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_roux;

/**
 *
 * @author hugor
 */
public class BouteilleBiere {
    String nom;           // Le nom de la bière
    float degreAlcool;    // Le degré d'alcool
    String brasserie;     // Le nom de la brasserie qui produit la bière
    boolean ouverte;

    public BouteilleBiere(String unNom, float unDegre, String 
uneBrasserie) {
 nom = unNom;
 degreAlcool = unDegre;
 brasserie = uneBrasserie;
 ouverte = false;
 
}
    
public void lireEtiquette() {
System.out.println("Bouteille de " + nom +" (" + degreAlcool +
 " degres) \nBrasserie : " + brasserie ) ;
 
}
    public boolean decapsuler (){
        if (ouverte == false) {
           ouverte = true ;  
           return true; 
    }else {
        System.out.println("erreur : biere \n" +"déjà ouverte)");
        return false;
    }   
    }
    @Override
    public String toString() {
    String chaine_a_retourner;
    chaine_a_retourner = nom + " (" + degreAlcool + " degrés) Ouverte ? "; 
    if (ouverte == true ) chaine_a_retourner += "oui" ;
    else chaine_a_retourner += "non" ;
    return chaine_a_retourner ;
}

}
