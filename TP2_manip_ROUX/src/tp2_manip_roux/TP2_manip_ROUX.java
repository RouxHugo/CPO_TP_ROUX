/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_roux;

/**
 *
 * @author hugor
 */
public class TP2_manip_ROUX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2 ;     
        
        System.out.println("nb de calories de Assiette 1 : " + 
        assiette1.nbCalories) ;
        System.out.println("nb de calories de Assiette 2 : " + 
        assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " + 
        assiette3.nbCalories) ;
        
        assiette3.nbCalories += 200 ;
        System.out.println("nb de calories de Assiette 2 : " + 
        assiette2.nbCalories) ;
        
        assiette2 = assiette1;
        assiette1 = assiette3;
        System.out.println("nb de calories de Assiette 1 : " + 
        assiette1.nbCalories) ;
        System.out.println("nb de calories de Assiette 2 : " + 
        assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " + 
        assiette3.nbCalories) ;
        
        /*Moussaka assiette666 = assiette1;
        /*il manque assiette666 et assiette1 na pas été créé
        /*Moussaka assiette667 = new Tartiflette() ;
        /*il faut une valeur dans new tartiflette
        /* une référence objet qui annonce référencer un type d’objet 
        peut-elle en référencer un autre qui n’a aucun rapport ? Non c'est impossible
        *  /*
        
        */
        
        // Création d'un tableau de 10 références de Moussaka
        Moussaka[] moussakaArray = new Moussaka[10];

        // Boucle pour initialiser chaque référence avec un nouvel objet Moussaka
        for (int i = 0; i < moussakaArray.length; i++) {
            moussakaArray[i] = new Moussaka(400 + i * 100);  // Exemple avec des calories différentes
        }

        // Affichage des calories de chaque Moussaka
        for (int i = 0; i < moussakaArray.length; i++) {
            System.out.println("Moussaka " + (i + 1) + " : " + moussakaArray[i].nbCalories + " calories");
        }

    }
    
}
