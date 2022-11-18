package foncdamentaux;//Ecrire un programme Java qui déclare 3 variables, a,b,c et qui va ensuite effectuer une permutation de ces valeurs :
//        Exemple :
//        Entrez la première valeur(a) : 51
//        Entrez la deuxième valeur(b) : 876
//        Entrez la troisième valeur(c) : 235
//        Les valeurs entrées sont : a = 51, b = 876 et c = 235
//        Permutation: b <== a, c <== b, a <== c
//        Les valeurs permutées sont : a = 235, b = 51 et c = 876

import java.util.Scanner;

public class TP3 {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.println("veuillez entrer la premiere valeur");
        int a = keyboardInput.nextInt();
        System.out.println("veuillez entrer la deuxieme valeur");
        int b = keyboardInput.nextInt();
        System.out.println("veuillez entrer la troisieme valeur");
        int c = keyboardInput.nextInt();

        System.out.printf("les valeurs entrees sont: a = %d, b = %d, c = %d\n", a, b, c);

        int tmp;
        tmp = a;
        a = c;
        c = tmp;
        tmp = b;
        b = a;
        a = tmp;
        System.out.printf("les valeurs permutees sont: a = %d, b = %d, c = %d",a,b,c);

    }
}
