//        Ecrire un programme Java qui déclare une matrice carrée(3x3)
//        Et qui ensuite va calculer la somme et la différence des 2 diagonales

import java.util.Arrays;
import java.util.Scanner;

public class Exo7_MatriceCarre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m[][] = new int[3][3];
        int d1 = 0;
        int d2 = 0;
        System.out.println("create a matrice 3x3 - enter numbers");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("enter number %d of row %d\n", j + 1, i + 1);
                m[i][j] = input.nextInt();
            }
            d1 += m[i][i];
            d2 += m[i][2 - i];
        }
        System.out.printf("\nsomme de 2 diagonals = %d\n", (d1 + d2));
        System.out.printf("\ndifference de 2 diagonals = %d\n", (d1 - d2));
    }
}
// matrice test  1 2 4
//               1 4 5
//               2 4 6