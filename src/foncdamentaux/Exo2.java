package foncdamentaux;//Ecrire un programme qui demande à l’utilisateur de saisir à partir le nom, le prénom, l’age et le poids.Et Afficher ensuite l’identité avec le format:
//Nom : Lisangola
//Prénom : Christian
//Age : 45 ans
//Poids :  79 kg
import java.util.Scanner;
public class Exo2 {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Entrer ton nom:");
        String nom = keyboardInput.nextLine();

        System.out.println("Entrer ton prenom:");
        String prenom = keyboardInput.nextLine();

        System.out.println("Entrer ton age:");
        int age = keyboardInput.nextInt();

        System.out.println("Entrer ton poid:");
        double poid = keyboardInput.nextDouble();

        System.out.printf("nom: %s\nprenom: %s\nage: %d ans\npoid: %f kg",nom,prenom,age,poid);
    }
}