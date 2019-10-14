package jardin;

import java.util.HashMap;

import java.util.Scanner;

public class Jardin {
	
    private int longueur;
    private int largeur;
    private Emplacement emplacement[][];
    private HashMap<String, Integer> panier;
    public Jardin(int longueur, int largeur)  {
    	
        this.longueur = longueur;
        this.largeur = largeur;
        this.emplacement = new Emplacement[longueur][largeur];
        this.panier = new HashMap<String, Integer>();
    }
    public void ajouterPanier(String nomDuVegetal, int quantite) {
        this.panier.put(nomDuVegetal, quantite);
    }
    public String toString() {
        String texte;
        texte = "Voici notre jardin :\n";
        for(int x = 0; x<longueur; x++) {
            for(int y=0; y<largeur; y++) {
                Emplacement e = emplacement[x][y];
                if (e == null) {
                    texte+="o";
                } else {
                    texte+="E";
                }
            }
            texte+="\n";
        }

        texte ="Et notre panier contient : \n";
        return texte;

    }
    public void Semer() {
        Scanner absisse = new Scanner(System.in);
        System.out.println("Choisissez la ligne où planter");
        int resAbsisse = absisse.nextInt();

        Scanner ordonne = new Scanner(System.in);
        System.out.println("Choisissez la colonne où planter");
        int resOrdonne = ordonne.nextInt();

    }
}