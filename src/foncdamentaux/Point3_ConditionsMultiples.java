package foncdamentaux;

import java.util.Scanner;

public class Point3_ConditionsMultiples {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("veuillez selectionner une langue: ");
        String langue = keyboardInput.nextLine();

        if (langue.equals("francais")) {
            System.out.println("bonjour");
        } else if (langue.equals("anglais")) {
            System.out.println("hello");
        } else if (langue.equals("allemand")) {
            System.out.println("guten tag");
        } else if (langue.equals("espagnol")) {
            System.out.println("holla");
        } else if (langue.equals("vietnamien")) {
            System.out.println("xin chao");
        }
    }
}
