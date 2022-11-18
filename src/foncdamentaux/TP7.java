package foncdamentaux;

import java.util.Scanner;

//Écrire un programme qui permet à l’utilisateur de saisir un entier entre 1 et 12 et qui affiche le nom du mois correspondant.
//        Ex:
//        Mois : 4
//        Résult : Avril
public class TP7 {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("veuillez entrer votre nombre");
        int nombre = keyboardInput.nextInt() - 1;

        String[] months ={"janvier","fevrier","mars","avril","mai","juin","juillet","aout","septembre","octobre","novembre","decembre"};
        String mois = months[nombre];
        System.out.printf("votre mois correspondant est %s",mois);
    }
}
