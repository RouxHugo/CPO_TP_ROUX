/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author hugor
 */
public class Baton extends Arme {
    int age;

    public Baton(String nom, int Attaque, int age) {
        super(nom, Attaque);
        this.age = Math.max(0,Math.min(age, 100));
    }
    @Override
    public String toString() {
        return super.toString() + ", Age : " + age;
    }

    public int getNiveauAttaque() {
        return Attaque;
    }

    // Getter pour l'âge du bâton
    public int getAge() {
        return age;
    }



}