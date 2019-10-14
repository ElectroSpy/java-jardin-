package jardin.Flore;
public abstract class Vegetal {
    private String Dessin[];
    private Etat etat;
    public Vegetal(String etat, String Dessin[]) {
        System.out.println("Ce Tableau contient 6 emplacements");
        System.out.println(Dessin[0]);
        System.out.println(Dessin[1]);
        System.out.println(Dessin[2]);
        System.out.println(Dessin[5]);
        this.etat = Etat.GRAINE;
        this.Dessin = new String[6];
    }
}