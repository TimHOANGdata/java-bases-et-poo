package TPs_JAVA_POO;
import java.util.Scanner;

public class TP2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("veuillez entrer un nombre");
        int number = input.nextInt();
        int reversed = 0;
        int remain = 0;
        while(number!=0){
            remain = number%10;
            reversed = 10*reversed +remain;
            number = number/10;

            // 6343
            // reversed
        }
        System.out.println(reversed);
    }

}
