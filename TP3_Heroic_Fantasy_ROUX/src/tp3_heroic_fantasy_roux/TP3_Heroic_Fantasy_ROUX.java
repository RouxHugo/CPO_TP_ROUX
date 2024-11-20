/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_roux;

import Personnages.Guerrier;
import Personnages.Magicien;
import Personnages.Personnage;
import Armes.Arme;
import Armes.Baton;
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
        Epee Excalibur = new Epee("Excalibur", 7,5);
        Epee Durandal = new Epee("Durandal", 4,7);
        Baton Chene = new Baton("Chene",4,5);
        Baton Charme = new Baton("Charme", 5, 6);
        
        ArrayList<Arme> armes = new ArrayList<>();

        // Ajout des armes à la liste
        armes.add(Excalibur);
        armes.add(Durandal);
        armes.add(Chene);
        armes.add(Charme);
        
        // Création des magiciens 
        Magicien gandalf = new Magicien("Gandalf", 65, true);  // Confirmé
        Magicien garcimore = new Magicien("Garcimore", 44, false);  // Novice

        // Création des guerriers 
        Guerrier conan = new Guerrier("Conan", 78, false);  // À pied
        Guerrier lannister = new Guerrier("Lannister", 45, true);  // À cheval
        
        // Création de la liste dynamique pour stocker les personnages
        ArrayList<Personnage> personnages = new ArrayList<>();

        // Ajout des personnages à la liste
        personnages.add(gandalf);
        personnages.add(garcimore);
        personnages.add(conan);
        personnages.add(lannister);
        
        // Affichage des armes
        for (int i = 0; i < armes.size(); i++) {
            System.out.println(armes.get(i));
        }    
        // Affichage des caractéristiques de chaque personnage
        for (int j = 0; j < personnages.size(); j++) {
            System.out.println(personnages.get(j)); 
        }
        Guerrier arthur = new Guerrier("Arthur", 78, true);

        // Création des armes
        Epee excalibur = new Epee("Excalibur", 7, 5);
        Epee durandal = new Epee("Durandal", 4, 7);

        // Ajout des armes à l'inventaire du personnage
        arthur.ajouterArme(excalibur);
        arthur.ajouterArme(durandal);

        // Équiper une arme par son nom
        arthur.equiperArme("Excalibur");

        // Afficher les informations du personnage
        System.out.println(arthur);

        // Tester un nom d'arme qui n'existe pas
        arthur.equiperArme("Inexistante");
        
        Guerrier leonidas = new Guerrier("Leonidas", 99, true);
        Magicien ryze = new Magicien("Ryze", 12, false);

        // Création des armes
        Epee xiphos = new Epee("Naue II", 8, 9);
        Epee kukuri = new Epee("Cho ", 4, 7);
        Epee espadon = new Epee("Arondight ", 5, 6);

        Baton or = new Baton("Serpent", 4, 5);
        Baton argent = new Baton("Rose", 5, 6);
        Baton vigne = new Baton("Gul", 3, 4);
        
        // Ajout des armes au guerrier (Leonidas)
        leonidas.ajouterArme(or); // 1 bâton
        leonidas.ajouterArme(xiphos); // 1ère épée
        leonidas.ajouterArme(kukuri); // 2ème épée
        leonidas.equiperArme("Naue II"); // Choix de l'épée "Naue II"

        // Ajout des armes au magicien (Ryze)
        ryze.ajouterArme(argent); // 1er bâton
        ryze.ajouterArme(vigne); // 2ème bâton
        ryze.ajouterArme(espadon); // 1 épée

        // Affichage du nombre d'armes de prédilection pour le magicien
        System.out.println("Nombre d'armes de predilection de Ryze : " + ryze.compterArmesDePredilection());

        // Affichage des caractéristiques des personnages
        System.out.println(leonidas);
        System.out.println(ryze);
           

        // Affichage des compteurs
        System.out.println("Nombre total de personnages : " + Personnage.getNombrePersonnages());
        System.out.println("Nombre de guerriers : " + Guerrier.getNombreGuerriers());
        System.out.println("Nombre de magiciens : " + Magicien.getNombreMagiciens());
        

        // Fatigue du guerrier
        leonidas.seFatiguer();
        System.out.println("Après fatigue du guerrier : ");
        System.out.println(leonidas);
        System.out.println("Le guerrier est-il toujours vivant ? " + leonidas.estVivant());
        ryze.equiperArme("Rose");
        // Le magicien attaque le guerrier
        ryze.attaquer(leonidas);
        System.out.println("Après l'attaque du magicien sur le guerrier : ");
        System.out.println(leonidas);
        System.out.println(ryze);
        System.out.println("Le guerrier est-il toujours vivant ? " + leonidas.estVivant());

        // Le guerrier attaque le magicien
        leonidas.attaquer(ryze);
        System.out.println("Après l'attaque du guerrier sur le magicien : ");
        System.out.println(ryze);
        System.out.println(leonidas);
        System.out.println("Le magicien est-il toujours vivant ? " + ryze.estVivant());
    }
        }
