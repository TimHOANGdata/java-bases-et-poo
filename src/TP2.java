//Ecrire un programme Java qui demande à l’utilisateur de saisir son nom, prenom et age,
// et qui ensuite va afficher le message : “Vous vous appelez <prenom> <nom>, et vous avez <age> ans”
import java.util.Scanner;
public class TP2 {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("veuillez entrer votre nom");
        String nom = keyboardInput.nextLine();

        System.out.println("veuillez entrer votre prenom");
        String prenom = keyboardInput.nextLine();

        System.out.println("veuillez entrer votre age");
        int age = keyboardInput.nextInt();

        System.out.printf("Vous vous appelez %s %s, et vous avez %d ans", nom, prenom, age);
    }
}
