/*
 * Roux Hugo
 * calculator
 * TDC
 * 17/09/2024
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo3;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author hugor
 */
public class Exo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Please enter the operator:\n1) add\n2) subtract\n3) multiply\n4) divide\n5) modulo");
        int operateur;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer l'operateur :");
        operateur=sc.nextInt();
        while (operateur != 1 && operateur != 2 && operateur != 3 && operateur != 4 && operateur != 5) {
            System.out.println("Valeur invalide\nEntrer l'operateur (1-5) :");
            operateur = sc.nextInt();
        }
        int operande1;
        System.out.println("\n Entrer le 1er nombre :");
        operande1=sc.nextInt();
        int operande2;
        System.out.println("\n Entrer le 1er nombre :");
        operande2=sc.nextInt();
         int result = 0;
        
        if (operateur == 1) {
            result = operande1 + operande2;
        } else if (operateur == 2) {
            result = operande1 - operande2;
        } else if (operateur == 3) {
            result = operande1 * operande2;
        } else if (operateur == 4) {
            result = operande1 / operande2;
        } else if (operateur == 5) {
            result = operande1 % operande2;
        } 
        System.out.println("le resultat est "+result );
    }
}