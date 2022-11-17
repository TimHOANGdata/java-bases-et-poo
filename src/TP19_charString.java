//Écrire un programme Java demande à l’utilisateur de saisir un texte et qui ensuite, renseigne si celui est un palindrome(mot qui se lit de la même dans les 2 sens).
//        Ex :
//        Entrez un test : non
//        Résultat : non est un palindrome
//        Entrez un text : oui
//        Résultat : oui n’est pas un palindrome
import java.util.Scanner;

public class TP19_charString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("entrez votre text");
        String text2 = input.nextLine();
        String text=text2.replaceAll("[^A-Z-a-z]","").toLowerCase();
        String text1 = "";
        for (int i = 0; i < text.length(); i++) {
            char a = text.charAt(text.length() - i - 1);
            text1 += a;
        }
        if(text.equals(text1)){
            System.out.printf("%s est un palindrome",text);
        }else{
            System.out.printf("%s n'est pas un palindrome",text);
        }
    }
}
