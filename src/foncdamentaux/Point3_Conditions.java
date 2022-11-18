package foncdamentaux;

import java.util.Scanner;
public class Point3_Conditions {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("votre age: ");
        int age = keyboardInput.nextInt();
//        >= superieur ou egal
//        <= infenieur ou egal
//        == egalite
//        != different
        if (age >= 18) {
            System.out.println("vous etes un majeur");
        } else {
            System.out.println("vous etes un mineur");
        }
    }
}

