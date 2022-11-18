package poo;

public class Test {
    public static double calculSurface(double longeur, double largeur){
        return longeur*largeur;
    }
    public static double calculPerimete(double longeur,double largeur){
        return 2*(largeur+longeur);
    }

    public static void main(String[] args) {
        double longeur = 45.5;
        double largeur = 25.2;
        double rayon = 78;
        double vitesse = 35;

        double surface = calculSurface(longeur,largeur);
        double perimetre = calculPerimete(longeur,largeur);
        System.out.printf("Surface : %.3f\n",surface);
        System.out.printf("Perimetre : %.3f\n",perimetre);

    }
}
