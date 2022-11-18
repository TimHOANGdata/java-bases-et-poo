package foncdamentaux;//Écrire un programme Java demande à l’utilisateur de saisir un texte
// et qui ensuite, retourne la chaîne inverse.
import java.util.Scanner;

public class TP18_charString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("entrez votre text");
        String text = input.nextLine();
        System.out.println(text);
        String text1 = "";
        for(int i = 0; i<text.length();i++){
            char c =text.charAt(text.length()-i-1);
            text1 += c;
        }  System.out.println(text1);
    }
}
