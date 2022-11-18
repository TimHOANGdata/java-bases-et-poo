package foncdamentaux;

//Ecrire un programme Java qui déclare une longueur et une largeur et qui ensuite calcul le périmètre et la surface.Le résultat est affiché dans la format suivant:
//        longueur : 250 m
//        largeur: 140 m
//        Surface : 35000m2
//        Perimetre : 780 m
public class Exo1 {
    public static void main(String[] args) {
        int longeur = 250;
        int largeur = 140;
        int surface = longeur * largeur;
        int perimetre = 2 * (longeur + largeur);
        System.out.printf("longeur : %dm\nlargeur : %dm\nsurface : %dm2\nperimetre : %dm",longeur,largeur,surface,perimetre);
    }
}
