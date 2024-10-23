/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_roux;

/**
 *
 * @author hugor
 */
public class TP2_relation_1_ROUX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        System.out.println("liste des voitures disponibles "+ uneClio + 
        "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
        
        System.out.println("Liste des voitures disponibles : " + uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra);

        // Test de la méthode ajouter_voiture()
        if (bob.ajouter_voiture(uneClio)) {
            System.out.println("Bobby a ajouté une voiture : " + uneClio);
        } else {
            System.out.println("Bobby n'a pas pu ajouter la voiture : " + uneClio);
        }

        if (bob.ajouter_voiture(une2008)) {
            System.out.println("Bobby a ajouté une voiture : " + une2008);
        } else {
            System.out.println("Bobby n'a pas pu ajouter la voiture : " + une2008);
        }

        if (reno.ajouter_voiture(uneAutreClio)) {
            System.out.println("Reno a ajouté une voiture : " + uneAutreClio);
        } else {
            System.out.println("Reno n'a pas pu ajouter la voiture : " + uneAutreClio);
        }

        if (reno.ajouter_voiture(uneMicra)) {
            System.out.println("Reno a ajouté une voiture : " + uneMicra);
        } else {
            System.out.println("Reno n'a pas pu ajouter la voiture : " + uneMicra);
        }

        // Tentative d'ajouter plus de voitures que la limite
        if (bob.ajouter_voiture(uneMicra)) {
            System.out.println("Bobby a ajouté une voiture : " + uneMicra);
        } else {
            System.out.println("Bobby n'a pas pu ajouter la voiture : " + uneMicra);
        }

        // Affichage de l'état final des voitures de Bobby
        System.out.println("Voitures de Bobby :");
        for (int i = 0; i < bob.nbVoitures; i++) {
            System.out.println(bob.liste_voitures[i]);
        }

        // Affichage de l'état final des voitures de Reno
        System.out.println("Voitures de Reno :");
        for (int i = 0; i < reno.nbVoitures; i++) {
            System.out.println(reno.liste_voitures[i]);
        }
    }
}