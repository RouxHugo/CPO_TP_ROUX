/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_roux;

import Armes.Arme;
import Armes.baton;
import Armes.Epee;
import java.util.ArrayList;

/**
 *
 * @author hugor
 */
public class TP3_Heroic_Fantasy_ROUX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Epee epee1 = new Epee("Excalibur", 7, 5); 
        Epee epee2 = new Epee("Durandal", 4, 7);  
        
        System.out.println(epee1); 
        System.out.println(epee2);
        
        baton baton1 = new baton("Chêne", 4, 5);
        baton baton2 = new baton("Charme", 5, 6);
        System.out.println(baton1);
        System.out.println(baton2);
        
        
        ArrayList<Arme> armes = new ArrayList<>();
        
        // Ajout des objets Epee et Baton à l'ArrayList
        armes.add(epee1); // Ajoute Excalibur
        armes.add(epee2); // Ajoute Durandal
        armes.add(baton1); // Ajoute Chêne
        armes.add(baton2); // Ajoute Charme
        
       System.out.println("Liste des armes :");
        for (int i = 0; i < armes.size(); i++) {
            Arme arme = armes.get(i); 
            System.out.println(arme);
        }
    }
    
}
