package foncdamentaux;

import java.util.Scanner;

public class Point3_Condition2 {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("veuillez définir un code PIN:");
        int codePin = keyboardInput.nextInt();

        System.out.println("apres quelques minutes, l'appareil s'est verouille...");
        System.out.println("veuillez entrer le code de devereouillage");

        int codePinATester = keyboardInput.nextInt();
        if(codePinATester != codePin){
            System.out.println("wrong");
        }else{
            System.out.println("correct");
        }
    }
}
