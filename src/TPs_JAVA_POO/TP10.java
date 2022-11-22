package TPs_JAVA_POO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TP10 {
    public static int[] twoSumComplementHashMap(int[] numbers, int target){
        //Create a hashMap mapping values to indexes
        var visitedNumbers=new HashMap<Integer,Integer>();
        for (int i=0;i<numbers.length;i++){
            var delta=target-numbers[i];//On calcul la différence

            // Si le résultat existe dans le HasMap alors on a lors le complément
            if(visitedNumbers.containsKey(delta)){
                return new int[]{i,visitedNumbers.get(delta)};
            }
            // Sinon, on rajoute les données
            visitedNumbers.put(numbers[i],i);
        }

        return null;
    }
    public static void main(String[] args) {
        int[] tab = {3,2,4,7,5,-1};
        int s = 6;
        ArrayList<String> table = new ArrayList<>();

        for(int i=0;i<tab.length;i++){
            for(int j=i+1;j<tab.length;j++){
                if(i+j==s & i!=j){
                    table.add("["+i+","+j+"]");
                }
            }

        }
        System.out.println(table);
    }
}