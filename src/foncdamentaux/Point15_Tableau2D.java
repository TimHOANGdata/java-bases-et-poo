package foncdamentaux;

import java.util.Arrays;

public class Point15_Tableau2D {
    public static void main(String[] args) {
        int tab [][] = {
                {3,4,5},
                {12,19,32},
                {1,7,9}
        }; // tab 2d contient 1 tab de tab
        System.out.println("acceeder a 32 => tab[1][2] =" + tab[1][2]);

        for(int i = 0; i<tab.length;i++){
//            System.out.println(Arrays.toString(tab[i])); // print des tab dans tab2D
            for(int j=0; j<tab.length;j++){
                System.out.println(tab[i][j]);
            }
        }
        //    Nombre lignes != nombre colonnes
        System.out.println("\n\nNombre lignes != nombre colonnes\n");
        int[][] tab2 = {
                {1,2,6,5},
                {2,4,5},
                {7,3}
        };

        for(int i=0; i< tab2.length;i++){
            for(int j=0; j< tab2[i].length;j++){
                System.out.println(tab2[i][j]);
            }
        }
    }



}
