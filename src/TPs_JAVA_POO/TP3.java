package TPs_JAVA_POO;

import java.util.Arrays;
import java.util.Scanner;

public class TP3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("veuillez entrer text 1");
        String s1 = input.nextLine();
        System.out.println("veuillez entrer text 2");
        String s2 = input.nextLine();
//        String[] s1Format = (s1.replaceAll("[^A-Za-z]", "").toLowerCase().split(""));
//        String[] s2Format = (s2.replaceAll("[^A-Za-z]", "").toLowerCase().split(""));
        boolean isAnagramme = false;
        if (s1.length() != s2.length()) {
            isAnagramme = false;
        }
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);//The sort() method sorts an array alphabetically
        Arrays.sort(c2);
        String sc1 = new String(c1);
        String sc2 = new String(c2);
        if (sc1.equals(sc2)) {
            isAnagramme = true;
        }
        System.out.println(isAnagramme);
    }
}    
