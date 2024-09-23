/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_roux;

import java.util.Scanner;

/**
 *
 * @author hugor
 */
public class TP1_manipNombresInt_ROUX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir deux entiers
        System.out.print("Saisissez le premier entier: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Saisissez le deuxième entier: ");
        int num2 = scanner.nextInt();

        // Affiche les deux entiers saisis
        System.out.println("Vous avez saisi : " + num1 + " et " + num2);

        // Calcul de la somme, différence et produit
        int somme = num1 + num2;
        int difference = num1 - num2;
        int produit = num1 * num2;
        
         System.out.println("La somme des deux nombres est: " + somme);
        System.out.println("La différence des deux nombres est: " + difference);
        System.out.println("Le produit des deux nombres est: " + produit);
    
        // Calcul du quotient entier et du reste de la division euclidienne
        if (num2 != 0) {
            int quotient = num1 / num2;
            int reste = num1 % num2;

            // Affichage du quotient et du reste
            System.out.println("Le quotient de la division de " + num1 + " par " + num2 + " est: " + quotient);
            System.out.println("Le reste de la division euclidienne de " + num1 + " par " + num2 + " est: " + reste);
        } else {
            System.out.println("Division par zéro non permise.");
        }
    }
}
