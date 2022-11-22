package TPs_JAVA_POO;

import java.util.ArrayList;
import java.util.Arrays;

public class TP7 {
    public static ArrayList<Character> maMethode(char[] table){
        ArrayList<Character> tab = new ArrayList<>();
        for(int i=0;i<table.length;i++){
            char a;
            if(i%2==0){
                String b = String.valueOf(table[i]).toUpperCase();
                a = b.charAt(0);
            }else{
                a = table[i];
            }
            tab.add(a);
        }return tab;
    }

    public static void main(String[] args) {
        System.out.println(maMethode(new char[]{'a', 'b', 'c', 'd', 'e'}));
    }
}
