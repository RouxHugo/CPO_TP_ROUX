/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_roux;

/**
 *
 * @author hugor
 */
public class Convertisseur {
    int nbConversions ;
    
public Convertisseur () {
 nbConversions = 0 ;
}    
public  double CelciusVersKelvin(double tCelcius) {
        nbConversions ++ ;
        return tCelcius + 273.15; // Conversion de Celsius en Kelvin
    }

    // Méthode de conversion de Kelvin vers Celsius
public  double KelvinVersCelcius(double tKelvin) {
    nbConversions ++ ;
        return tKelvin - 273.15;
    }

    // Méthode de conversion de Fahrenheit vers Celsius
public  double FarenheitVersCelcius(double tFahrenheit) {
    nbConversions ++ ;
        return (tFahrenheit - 32) * 5 / 9;
    }

    // Méthode de conversion de Celsius vers Fahrenheit
public  double CelciusVersFarenheit(double tCelcius) {
    nbConversions ++ ;
        return (tCelcius * 9 / 5) + 32;
    }

    // Méthode de conversion de Kelvin vers Fahrenheit (utilisant deux autres méthodes)
public  double KelvinVersFarenheit(double tKelvin) {
    
        // Convertit d'abord Kelvin vers Celsius, puis Celsius vers Fahrenheit
        double tCelcius = KelvinVersCelcius(tKelvin);
        return CelciusVersFarenheit(tCelcius);
    }

    // Méthode de conversion de Fahrenheit vers Kelvin (utilisant deux autres méthodes)
public  double FarenheitVersKelvin(double tFahrenheit) {
        // Convertit d'abord Fahrenheit vers Celsius, puis Celsius vers Kelvin
        double tCelcius = FarenheitVersCelcius(tFahrenheit);
        return CelciusVersKelvin(tCelcius);
    }
@Override
public String toString () {
 return "nb de conversions"+ nbConversions;
}
}
    