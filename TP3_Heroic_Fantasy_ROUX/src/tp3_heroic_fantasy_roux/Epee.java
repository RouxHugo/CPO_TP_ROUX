/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_roux;

/**
 *
 * @author hugor
 */
public class Epee extends Arme {
    
    int finesse;
    
     public Epee(String nom, int niveauAttaque, int finesse) {
        super(nom, niveauAttaque); // Appel du constructeur de Arme pour nom et niveauAttaque

        // Limite l'indice de finesse à 100 maximum
        if (finesse <= 100) {
            this.finesse = finesse;
        } else {
            this.finesse = 100; // Limite la finesse à 100 si dépassement
        }
    
        
    }
}

