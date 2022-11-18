package foncdamentaux;

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
        String text1=text.replaceAll("[^A-Z-a-z]","").toLowerCase();
        for(int i=0; i< text1.length();i++) {
            int occurence = 1;
            if (tab.containsKey(text1.charAt(i))) {
                occurence = tab.get(text1.charAt(i)) + 1;
                tab.replace(text1.charAt(i), occurence);
            } else {
                tab.put(text1.charAt(i), occurence);
            }
        }
        System.out.println(tab);
    }
}
