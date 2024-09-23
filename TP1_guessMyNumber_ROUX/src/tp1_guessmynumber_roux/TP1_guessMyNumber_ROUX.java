/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_roux;

import java.util.Random;
import java.util.Scanner;

/**
 *@date 23/09/2024
 * @author hugor
 */
public class TP1_guessMyNumber_ROUX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Random generateurAleat = new Random();
        Scanner scanner = new Scanner(System.in);
        
        // Affichage de 5 nombres aléatoires
        System.out.println("5 nombres aléatoires :");
        for (int i = 0; i < 5; i++) {
            int n = generateurAleat.nextInt(101); // Nombre entre 0 et 100
            System.out.println(n);
        }

        // Choix du niveau de difficulté
        System.out.println("Choisissez un niveau de difficulté : facile, normal, difficile");
        String difficulte = scanner.nextLine();
        
        int maxTentatives = 0; // Valeur par défaut
        switch (difficulte.toLowerCase()) {
            case "facile":
                maxTentatives = 15;
                break;
            case "difficile":
                maxTentatives = 5;
                break;
            case "normal":
            default:
                maxTentatives = 10;
                break;
        }

        int nombreAleatoire = generateurAleat.nextInt(101); // Nombre entre 0 et 100
        int tentatives = 0;
        boolean trouve = false;

        // Boucle pour deviner le nombre
        while (tentatives < maxTentatives && !trouve) {
            System.out.print("Entrez un nombre entre 0 et 100 : ");
            int nombreUtilisateur = scanner.nextInt();
            tentatives++;

            // Comparaison des nombres
            if (nombreUtilisateur < nombreAleatoire) {
                if (nombreAleatoire - nombreUtilisateur > 20) {
                    System.out.println("Vraiment trop petit !");
                } else {
                    System.out.println("Trop petit !");
                }
            } else if (nombreUtilisateur > nombreAleatoire) {
                if (nombreUtilisateur - nombreAleatoire > 20) {
                    System.out.println("Vraiment trop grand !");
                } else {
                    System.out.println("Trop grand !");
                }
            } else {
                System.out.println("Gagné ! Le nombre était " + nombreAleatoire);
                trouve = true;
            }
        }

        if (!trouve) {
            System.out.println("Désolé, vous avez épuisé vos tentatives. Le nombre était " + nombreAleatoire);
        } else {
            System.out.println("Nombre de tentatives : " + tentatives);
        }

        scanner.close();
    }
}