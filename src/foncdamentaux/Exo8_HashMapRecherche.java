package foncdamentaux;

import java.util.HashMap;
import java.util.Scanner;

public class Exo8_HashMapRecherche {
    public static void main(String[] args) {
        int[] nombres = {2, 7, 5, 6, 7, 1, 6, 2, 1, 7, 1, 32, 1};
        //1. creer un HashMap vide
        //{ 2 : 2, 7 : 3 }
        HashMap<Integer, Integer> occurences = new HashMap<>();


        //2. Remplir le hashMap avec le nombre avec leurs occurences
        for (int nombre : nombres) {
            if (occurences.containsKey(nombre)) {
                //containskey() permet de tester si un cle exist dans le table ?
                int nombreMisAJour = occurences.get(nombre)+1;
                occurences.replace(nombre, nombreMisAJour);
            } else {
                occurences.put(nombre, 1);
            }

        }
        var input = new Scanner(System.in);
        System.out.println("entrez le nombre a rechercher");
        var nombreACherche = input.nextInt();
        if(occurences.containsKey(nombreACherche)){
            System.out.printf("%d se retrouve %d fois dans la list",
            nombreACherche,occurences.get(nombreACherche));
        }else{
            System.out.printf("%d n'exist pas dnas la list",nombreACherche);
        }
    }
}