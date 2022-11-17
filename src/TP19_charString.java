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
        String text = input.nextLine();
        for(int i = 0; i< text.length();i++){
            if(text.charAt(i)!=text.charAt(text.length()-1-i)){
                System.out.printf("%s n'est un palindrome\n",text);
                break;
            }else{
                System.out.printf("%s est un palindrome",text);
                break;
            }
        }
    }
}
