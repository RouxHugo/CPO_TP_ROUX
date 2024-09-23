/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_roux;

import java.util.Scanner;

/**
 * @date 23/09/2024
 * @author hugor
 */
public class TP1_convertisseur_ROUX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Création du scanner pour lire les entrées utilisateurs
        Scanner scanner = new Scanner(System.in);

        // Saisie de la température
        System.out.println("Bonjour, saisissez une valeur : ");
        double temperature = scanner.nextDouble();

          // Affichage du menu des conversions
        System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
        System.out.println("1) De Celsius vers Kelvin");
        System.out.println("2) De Kelvin vers Celsius");
        System.out.println("3) De Fahrenheit vers Celsius");
        System.out.println("4) De Celsius vers Fahrenheit");
        System.out.println("5) De Kelvin vers Fahrenheit");
        System.out.println("6) De Fahrenheit vers Kelvin");

        // Lecture du choix de l'utilisateur
        System.out.print("Entrez le numéro de la conversion souhaitée : ");
        int choix = scanner.nextInt();

        // Exécution de la conversion choisie et affichage du résultat
        switch (choix) {
            case 1:
                System.out.println(temperature + " degrés Celsius est égal à " + CelciusVersKelvin(temperature) + " Kelvin");
                break;
            case 2:
                System.out.println(temperature + " Kelvin est égal à " + KelvinVersCelcius(temperature) + " degrés Celsius");
                break;
            case 3:
                System.out.println(temperature + " degrés Fahrenheit est égal à " + FarenheitVersCelcius(temperature) + " degrés Celsius");
                break;
            case 4:
                System.out.println(temperature + " degrés Celsius est égal à " + CelciusVersFarenheit(temperature) + " degrés Fahrenheit");
                break;
            case 5:
                System.out.println(temperature + " Kelvin est égal à " + KelvinVersFarenheit(temperature) + " degrés Fahrenheit");
                break;
            case 6:
                System.out.println(temperature + " degrés Fahrenheit est égal à " + FarenheitVersKelvin(temperature) + " Kelvin");
                break;
            default:
                System.out.println("Choix invalide. Veuillez relancer le programme.");
                break;
        }
    }

    public static double CelciusVersKelvin(double tCelcius) {
        return tCelcius + 273.15; // Conversion de Celsius en Kelvin
    }

    // Méthode de conversion de Kelvin vers Celsius
    public static double KelvinVersCelcius(double tKelvin) {
        return tKelvin - 273.15;
    }

    // Méthode de conversion de Fahrenheit vers Celsius
    public static double FarenheitVersCelcius(double tFahrenheit) {
        return (tFahrenheit - 32) * 5 / 9;
    }

    // Méthode de conversion de Celsius vers Fahrenheit
    public static double CelciusVersFarenheit(double tCelcius) {
        return (tCelcius * 9 / 5) + 32;
    }

    // Méthode de conversion de Kelvin vers Fahrenheit (utilisant deux autres méthodes)
    public static double KelvinVersFarenheit(double tKelvin) {
        // Convertit d'abord Kelvin vers Celsius, puis Celsius vers Fahrenheit
        double tCelcius = KelvinVersCelcius(tKelvin);
        return CelciusVersFarenheit(tCelcius);
    }

    // Méthode de conversion de Fahrenheit vers Kelvin (utilisant deux autres méthodes)
    public static double FarenheitVersKelvin(double tFahrenheit) {
        // Convertit d'abord Fahrenheit vers Celsius, puis Celsius vers Kelvin
        double tCelcius = FarenheitVersCelcius(tFahrenheit);
        return CelciusVersKelvin(tCelcius);
    }

}