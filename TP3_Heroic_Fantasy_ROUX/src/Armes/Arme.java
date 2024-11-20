/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author hugor
 */
public abstract class Arme {
    String Nom;
    int Attaque;

    public Arme(String nom, int Attaque) {
        this.Nom = nom;
        this.Attaque = Math.max(0, Math.min(Attaque, 100));
    }

    public int getAttaque() {
        return Attaque;
    }

    public String getNom(){
        return Nom;
    }
    @Override
    public String toString() {
    return "Arme : " + Nom + " Niveau d'attaque :" + Attaque;
    }

}
