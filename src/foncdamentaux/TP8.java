package foncdamentaux;//Ecrivez un programme Age.java qui :
//        demande son âge à l’utilisateur ;
//        lit la réponse de l’utilisateur et l’enregistre dans une variable age de type entier ;
//        Effectue le calcul de l’année de naissance de l’utilisateur et l’enregistre dans la variable annee de type entier ;
//        affiche l’année de naissance ainsi calculée.

import java.util.Calendar;
import java.util.Scanner;

public class TP8 {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("veuillez entrer votre age");
        int age = keyboardInput.nextInt();
        int year = Calendar.getInstance().get(Calendar.YEAR); // get instant year
        int annee = year - age;
        System.out.printf("votre annee de naissance est %d", annee);
    }
}
