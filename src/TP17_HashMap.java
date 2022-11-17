import java.util.HashMap;
import java.util.Scanner;

//Écrire un programme Java demande à l’utilisateur de saisir un texte et qui
//ensuite, et qui ensuite affiche le nombre d’occurence de chaque lettre.
//Dans cet exercice, nous allons utiliser les HashMap
public class TP17_HashMap {
    public static void main(String[] args) {
        HashMap<Character,Integer> tab = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.println("entrez votre text");
        String text = input.nextLine();

        for(int i=0; i< text.length();i++) {
            int occurence = 1;
            if (tab.containsKey(text.charAt(i))) {
                occurence = tab.get(text.charAt(i)) + 1;
                tab.replace(text.charAt(i), occurence);
            } else {
                tab.put(text.charAt(i), occurence);
            }
        }
        System.out.println(tab);
    }
}
