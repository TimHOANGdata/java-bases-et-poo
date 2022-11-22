package TPs_JAVA_POO;
import java.util.Scanner;



public class TP4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("veuillez entrer votre text");
        String text = input.nextLine();
        String[] mots = text.split(" ");
        String mot1;
        String text1 = "";
        for (String mot : mots){
           mot1 = mot.substring(0, 1).toUpperCase()+ mot.substring(1);
            text1 += mot1 +" ";
//            substring(int startIndex, int endIndex): on prendre les String de start index a end index
        }
        System.out.println(text1);
    }
}
