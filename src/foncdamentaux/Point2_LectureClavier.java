package foncdamentaux;

import java.util.Scanner;
public class Point2_LectureClavier {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Entrer la longeur:");
        double longeur = keyboardInput.nextDouble();

        System.out.println("Entrer la largeur:");
        double largeur = keyboardInput.nextDouble();

        double surface = longeur * largeur;
        double perimetre = 2*(longeur + largeur);
        System.out.printf("longeur: %1f m\nlargeur: %1f m\nsurface: %1f m2\nPerimetre: %1f m",longeur,largeur,surface,perimetre);
    }
}
