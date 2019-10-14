package jardin;

import jardin.Flore.Vegetal;

import java.util.Scanner;

public class Terre {
	
    public static void main(String[] args) {
    	
        Jardin J1 = new Jardin(5,3);
        J1.ajouterPanier("Ail", 5);
        J1.ajouterPanier("Betterave", 2);
        J1.ajouterPanier("Carotte", 3);
        J1.ajouterPanier("Tomate", 4);
        
        System.out.print(J1.toString());
        
        Scanner choix  = new Scanner(System.in);
        
        System.out.println("Choisissez une action : Numerique");
        System.out.println("1. Semer une Graine");
        System.out.println("2. Recolter plante mature");    
        System.out.println("3. Passer à la saison suivante");    
        System.out.println("4. Quitter Application");
        
        int Resultat = choix.nextInt();
    }
}