package TPs_JAVA_POO;

import java.util.ArrayList;
import java.util.Arrays;

public class TP1 {
    public static void main(String[] args) {

        int posMax =0;
        int posMin =0;
        int[] tab = {12,3,5,6,-3};
        int max = tab[0];
        int min = tab[0];
        ArrayList<String> table = new ArrayList<>();
        for(int i=0;i<tab.length;i++){
            if(max<tab[i]){
                max = tab[i];
                posMax = i;
            }
            if(tab[i]< min) {
                min = tab[i];
                posMin = i;
            }

            if(tab[i]==max){
                table.add(tab[i]+"(PG)");
            }
            else if (tab[i]==min){
                table.add(tab[i]+"(PP)");
            }else {
                table.add(String.valueOf(tab[i]));
            }
        }
        System.out.println("plus grand :" + max +" a la position "+posMax);
        System.out.println("plus petit :" + min +" a la position "+posMin);
        System.out.println(table.toString());
    }
}
