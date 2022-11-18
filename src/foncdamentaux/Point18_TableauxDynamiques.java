package foncdamentaux;

import java.util.ArrayList;

public class Point18_TableauxDynamiques {
    public static void main(String[] args) {
        ArrayList<String> fruit = new ArrayList<>();
        System.out.printf("taille du tanleau fruit : %d\n", fruit.size()); // avec tab dynamique on peut creer un tab de taille 0
        fruit.add("Pomme");
        fruit.add("banane");
        fruit.add("orange");
        System.out.printf("taille du tableau fruit : %d\n", fruit.size());
        System.out.println(fruit);
        fruit.remove(1);// remove on peut utiliser index du element
        System.out.println(fruit);
        fruit.remove("Pomme"); // on peut aussi remove avec element exact
        System.out.println(fruit);
        System.out.println(fruit.get(0)); // acceder au fruit dynamique avec index


        ArrayList<ArrayList<Integer>> matrice = new ArrayList<>(); // creer un tableau dynamique 2D
    }

}
