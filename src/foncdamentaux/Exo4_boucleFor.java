package foncdamentaux;

import java.util.Scanner;

public class Exo4_boucleFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez le nombre dont vous voulez afficher la table : ");
        int nombre = input.nextInt();

        System.out.print("Nombre de départ : ");
        int depart = input.nextInt();

        System.out.println("Nombre d'arrêt : ");
        int arret = input.nextInt();

        for (int i = depart; i <= arret; i++) {
            System.out.printf("%d x %d = %d\n", nombre, i, (nombre * i));
        }
//        for (int i=2;i<=13;i++){
//            System.out.printf("%d x %d = %d\n",nombre,i,(nombre*i));
//        }
    }
}