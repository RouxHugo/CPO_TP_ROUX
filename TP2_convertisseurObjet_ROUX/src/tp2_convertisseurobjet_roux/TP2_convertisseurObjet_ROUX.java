/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_roux;

import java.util.Scanner;

/**
 * @date 11/10/2024
 * @author hugor
 */
public class TP2_convertisseurObjet_ROUX {

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        Convertisseur convertisseur = new Convertisseur();
        int choix = 0;

        while (choix != 7) {
            // Affichage du menu
            System.out.println("\nMenu de conversions : ");
            System.out.println("1. Celsius vers Kelvin");
            System.out.println("2. Kelvin vers Celsius");
            System.out.println("3. Fahrenheit vers Celsius");
            System.out.println("4. Celsius vers Fahrenheit");
            System.out.println("5. Kelvin vers Fahrenheit");
            System.out.println("6. Fahrenheit vers Kelvin");
            System.out.println("7. Quitter");
            System.out.print("Choisissez une option : ");
            choix = scanner.nextInt();

            if (choix >= 1 && choix <= 6) {
                // Demander la valeur de température
                System.out.print("Entrez la température à convertir : ");
                if (scanner.hasNextDouble()) {
                    double temperature = scanner.nextDouble();
                    double resultat = 0;
                    
                    // Effectuer la conversion selon le choix
                    switch (choix) {
                        case 1:
                            resultat = convertisseur.CelciusVersKelvin(temperature);
                            System.out.println(temperature + "°C = " + resultat + " K");
                            break;
                        case 2:
                            resultat = convertisseur.KelvinVersCelcius(temperature);
                            System.out.println(temperature + " K = " + resultat + "°C");
                            break;
                        case 3:
                            resultat = convertisseur.FarenheitVersCelcius(temperature);
                            System.out.println(temperature + "°F = " + resultat + "°C");
                            break;
                        case 4:
                            resultat = convertisseur.CelciusVersFarenheit(temperature);
                            System.out.println(temperature + "°C = " + resultat + "°F");
                            break;
                        case 5:
                            resultat = convertisseur.KelvinVersFarenheit(temperature);
                            System.out.println(temperature + " K = " + resultat + "°F");
                            break;
                        case 6:
                            resultat = convertisseur.FarenheitVersKelvin(temperature);
                            System.out.println(temperature + "°F = " + resultat + " K");
                            break;
                    }
                    
                    // Affichage du nombre de conversions effectuées
                    System.out.println("Nombre de conversions effectuées : " + convertisseur.nbConversions);
                } else {
                    System.out.println("Erreur : veuillez entrer un nombre valide pour la température.");
                    scanner.next();  // Consomme l'entrée invalide pour éviter une boucle infinie
                }
            } else if (choix == 7) {
                System.out.println("Vous avez choisi de quitter. Au revoir !");
            } else {
                System.out.println("Choix invalide. Veuillez essayer à nouveau.");
            }
        }

        scanner.close();
    }
}
