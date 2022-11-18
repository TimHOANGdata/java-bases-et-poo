package foncdamentaux;

import java.util.Scanner;

public class Point8_While {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("veuillez définir un code PIN:");
        int codePin = keyboardInput.nextInt();

        System.out.println("apres quelques minutes, l'appareil s'est verouille...");
        int codePinATester=0;
        while (codePinATester!= codePin) {
            System.out.println("veuillez entrer le code de devereouillage");
            codePinATester = keyboardInput.nextInt();
            if (codePinATester == codePin) {
                System.out.println("correct");
            } else {
                System.out.println("wrong, veuillez recommencer");
            }
        }
    }
}
// 1. Limiter le nombre de tentatives à 5. Au bout de 5 tentatives, afficher.
//        "Vous avez saisi 5 fois des mauvais codes. Votre appareil est bloqué"
// 2. Au bout de 2 tentatives, commencer à afficher à l'utilisateur le nombre
// tentatives restantes. Exemple : Il vous reste x nombre des tentatives.