//Ecrivez un programme Java qui lit un nombre et indique s’il est positif, négatif ou s’il vaut zéro et s’il est pair ou impair.
//        Exemple d’exécution:
//        Entrez un nombre entier: 5
//        Le nombre est positif et impair
//        Entrez un nombre entier: -4
//        Le nombre est négatif et pair
//        Entrez un nombre entier: 0
//        Le nombre est zéro (et il est pair)
import java.util.Scanner;

public class TP5 {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("veuillez entrer un nombre entier");
        int n = keyboardInput.nextInt();
//        if(n>0){
//            if (n%2 == 0){
//                System.out.println("le nombre est positif et pair");
//            }else{
//                System.out.println("le nombre est positif est impair");
//            }
//        }else if(n < 0){
//            if (n%2 ==0){
//                System.out.println("le nombre est negatif et pair");
//            }else {
//                System.out.println("le nombre est negatif et impair");
//            }
//        }else{
//            System.out.println("le nombre est zero et pair");
//        }

        //        String nombre="45";
        boolean estPair = n % 2 == 0;

//        Sans opérateur ternaire
//        String parite="";
//        if(estPair){
//            parite="pair";
//        }else{
//            parite="impair";
//        }
//
//        Avec opérateur ternaire
        String parite = estPair ? "pair" : "impair";

        if (n > 0) {
            System.out.printf("%d est positif et %s", n, parite);
        } else if (n < 0) {
            System.out.printf("%d est negatif et %s", n, parite);
        } else {
            System.out.println("0 et pair.");
        }
    }

}
