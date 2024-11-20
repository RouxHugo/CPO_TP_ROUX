/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tp3_heroic_fantasy_roux;

/**
 *
 * @author hugor
 */
public interface EtreVivant {
    void seFatiguer(); // La méthode qui permet à un personnage de se fatiguer.
    boolean estVivant(); // La méthode qui vérifie si un personnage est vivant.
    void estAttaque(int points); // La méthode qui gère l'attaque d'un personnage.
}