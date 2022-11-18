import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

//Écrire une méthode Java qui prend en paramètre 2 string et qui ensuite retourne un booléen(true/false) selon que le 2ème string est le préfixe du premier ou pas.
//        Ex :
//        isPrefix(“banner”, “bang”)
//        > false
//        isPrefix(“hugging”, “hug”)
//        > true
public class TP21_fonctions {
    public static boolean isPrefix(String text1, String text2){
//        String l1="";
//        String l2="";
//        for(String lettre2:text1.split("")){
//            l2 = lettre2.toLowerCase();
//            for(String lettre1:text2.split("")){
//                l1=lettre1.toLowerCase();
//
//            }
//        }return l2.equals(l1);

            //Et si on dépasse -> erreur out of bound. Gérer ou non.

            for (int i = 0; i < text2.length(); i++) {
                if(text1.charAt(i)!=text2.charAt(i)) return false;
            }
            return true;
        }


//    Écrire une méthode Java qui prend en paramètre un tableau 2D, et un nombre.
//    La méthode devrait nous retourner la valeur correspond au nombre de fois que ce nombre se trouve dans le tableau et ses différentes positions.
//    Ex :
//    maMethode({
//        {1, 4, 2, 1},
//        {6, 3, 8, 9},
//        {1, 5, 1, 0}
//    },1)
// > 1 se retrouve 4 fois dans les emplacements suivants : (0,0),(0,3),(2,0),(2,2)
    public static String maMethode(int[][] tab, int nombre){
        int count = 0;
        ArrayList<String> location = new ArrayList<>();
        for(int i=0; i<tab.length;i++){
            for(int j=0; j<tab[i].length;j++){
                if(tab[i][j]==nombre){
                    count++;
                    String loc = "("+i+","+j+")";
                    location.add(loc);
                }
            }
        }return String.format("%d se retrouve %d fois dans les emplacement suivants: %s",nombre,count,location); //
    }
//    TP3.
//    On vous donne comme argument un tableau contenant des chaînes de directions (haut, bas, gauche, droite).
//    Imaginez une personne debout sur une grille au point 0, 0. Pour chaque direction dans le tableau de chaînes,
//    déplacez votre personne dans cette direction sur la grille. Retournez le point final X,Y où se trouve la personne
//    sous la forme d’un tableau de deux entiers.
//            Exigences
//    Doit retourner un tableau de deux entiers
//    Exemple:
//    maMethode([“haut”, “haut”, “bas”, “gauche”, “gauche”, “droite”, “haut”])
//> [-1, 2]
    public static int[] maMethode1(String[] directions){
        int[] position = {0,0};
        for(String direction:directions){
            switch (direction) {
                case "haut" -> position[1] += 1;
                case "bas" -> position[1] -= 1;
                case "gauch" -> position[0] -= 1;
                default -> position[0] += 1;
            }
        }
        return position;
    }
    public static void main(String[] args) {
//        System.out.println(isPrefix("banne","bang"));
        int[][] mat = {{4,1,2,1},{6,3,8,9},{1,5,1,0}};
        System.out.println(maMethode(mat,1));
        System.out.println(maMethode(new int[][] {{4,1,2,1},{6,3,8,9},{1,5,1,0}},1));
        var result =maMethode1(new String[]{"haut","haut","bas","gauche","gauche",
                "droite","haut"});
        System.out.println(Arrays.toString(result));

    }
}
