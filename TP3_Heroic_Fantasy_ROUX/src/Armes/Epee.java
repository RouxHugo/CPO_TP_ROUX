/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author hugor
 */
public class Epee extends Arme{
    int finesse;

    public Epee(String nom, int Attaque,int finesse) {
        super(nom, Attaque);
        this.finesse =  Math.max(0, Math.min(finesse, 100));

    }

    @Override
    public String toString() {
        return super.toString() + ", Finesse : " + finesse;
    }
    // Getter pour le niveau d'attaque
    public int getNiveauAttaque() {
        return Attaque;
    }

    // Getter pour la finesse de l'épée
    public int getFinesse() {
        return finesse;
    }
}
