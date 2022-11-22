package TPs_JAVA_POO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class TP5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("veuillez entrer votre text");
        String text = input.nextLine().toLowerCase();
        HashMap<String,Integer> hMap = new HashMap<>();
        String[] mots = text.split(" ");
        String text1 = "";
        for(String mot:mots){
            int count = 1;
            if(hMap.containsKey(mot)){
                count = count +1;
                hMap.replace(mot,count);

            }else{
                hMap.put(mot,count);
                text1 += mot + " ";
            }
        }
        System.out.println(text);
        System.out.println(text1);
        System.out.println(hMap);
    }
}
