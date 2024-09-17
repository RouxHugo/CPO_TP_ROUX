/*
 * Roux Hugo
 * TDC
 * 17/09/2024
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo2;

import java.util.Scanner;

/**
 *
 * @author hugor
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nb;
        int result;
        int ind;
        //nb=5;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer le nombre :");
        nb=sc.nextInt(); // On demande a sc de donner le prochain entier
        result=0;
                
        ind=1;
        while (ind <= nb) {
            result=result+ind;
            ind+=1;
        }
        System.out.println();
        System.out.println("La somme des "+ nb + "entiers est: "+result);
        }
    }
    
