/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_roux;

/**
 *
 * @author hugor
 */
public class baton extends Arme {
    int age;
    
    
public baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque); // Appel du constructeur de Arme pour nom et niveauAttaque

        // Limite l'indice de finesse à 100 maximum
        if (age <= 100) {
            this.age = age;
        } else {
            this.age = 100;
        }
    }
}