/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_roux;

/**
 * @date 11/10/23
 * @author hugor
 */
public class TP2_Bieres_ROUX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", (float) 7.0,"Dubuisson") ;
        uneBiere.lireEtiquette();
        uneBiere.decapsuler();
        
        BouteilleBiere secondBiere = new BouteilleBiere("Leffe", (float) 6.6,"Abbaye de Leffe") ;   
        secondBiere.lireEtiquette();
        secondBiere.decapsuler();
        
        BouteilleBiere troisièmeBiere = new BouteilleBiere("chouffe", (float) 5.6,"Abbaye de chouffe") ;   
        troisièmeBiere.lireEtiquette();
        troisièmeBiere.decapsuler();
        
        BouteilleBiere quatrièmeBiere = new BouteilleBiere("8.6", (float) 8.6,"maison de la 8.6") ;   
        quatrièmeBiere.lireEtiquette();
        quatrièmeBiere.decapsuler();
        
        BouteilleBiere cinquièmeBiere = new BouteilleBiere("guiness", (float) 9.6,"Abbaye de guiness") ;   
        cinquièmeBiere.lireEtiquette();

        
        
        System.out.println(uneBiere) ;
        System.out.println(secondBiere) ;
        System.out.println(troisièmeBiere) ;
        System.out.println(quatrièmeBiere) ;
        System.out.println(cinquièmeBiere) ;

    }
    
}
