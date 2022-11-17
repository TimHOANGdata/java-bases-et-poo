//TP3.
//        Écrire un programme Java qui permet à l’utilisateur de déclarer 3 tableaux d’entiers.
//        Ces tableaux ne doivent pas forcément avoir la même taille
//        Le programme doit ensuite fournir afficher les 3 tableaux en format [element1, element2,...,élémentS] et la somme de tous les éléments multiples 3 dans les 3 tableaux.
//        Ex :
//        T1 : [ 2, 6, 8, 15,39,11 ]
//        T2 : [ 21, 33, 12, 19,0 ]
//        T3 : [ 17, 18, 46 ]
//        S = 6+15+39+21+33+12+18 = 144
import java.util.Arrays;
import java.util.Scanner;
public class TP16_Tableau {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("definir la taille du table 1 ");
        int T1[] = new int[input.nextInt()];
        System.out.println("definir la taille du table 2 ");
        int T2[] = new int[input.nextInt()];
        System.out.println("definir la taille du table 3 ");
        int T3[] = new int[input.nextInt()];
        int somme = 0;
        for (int i =0; i<T1.length;i++){
            System.out.printf("entrer valeur du %deme valeur de table 1 ",i+1);
            T1[i]=input.nextInt();
            if(T1[i]%3==0){
                somme += T1[i];
            }
        }
        for (int j =0; j<T2.length;j++){
            System.out.printf("entrer valeur du %deme valeur de table 2 ",j+1);
            T2[j]=input.nextInt();
            if(T2[j]%3==0){
                somme += T2[j];
            }
        }
        for (int k =0; k<T3.length;k++){
            System.out.printf("entrer valeur du %deme valeur de table 3 ",k+1);
            T3[k]=input.nextInt();
            if(T3[k]%3==0){
                somme += T3[k];
            }
        }
        System.out.println(Arrays.toString(T1));
        System.out.println(Arrays.toString(T2));
        System.out.println(Arrays.toString(T3));
        System.out.printf("Somme de tous les éléments multiples 3 dans les 3 tableaux est %d",somme);

    }
}
