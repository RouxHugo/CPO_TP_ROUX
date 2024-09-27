/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_roux;

import java.util.Random;
import java.util.Scanner;

/**
 * @date 27/09/2024
 * @author hugor
 */
public class TP1_stats_ROUX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] tab = new int[6]; 
        Scanner scanner = new Scanner(System.in);
        Random generateurAleat = new Random();
        System.out.print("Veuillez saisir un nombre entier m : ");
        int m = scanner.nextInt();  
        
        for(int i=0;i <m;i++){
            int nbr = generateurAleat.nextInt(6);
             tab[nbr] += 1;
        }
        for(int i=0;i <6;i++){
            double nbr2 = (double) tab[i] / m * 100;
            System.out.println("Face " + (i + 1) + " : " +  nbr2 + " %");
        }
    }
    
}
