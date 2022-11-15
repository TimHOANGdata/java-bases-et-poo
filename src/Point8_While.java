import java.util.Scanner;

public class Point8_While {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("veuillez définir un code PIN:");
        int codePin = keyboardInput.nextInt();

        System.out.println("apres quelques minutes, l'appareil s'est verouille...");
        int codePinATester=0;
        while (codePinATester!= codePin) {
            System.out.println("veuillez entrer le code de devereouillage");
            codePinATester = keyboardInput.nextInt();
            if (codePinATester == codePin) {
                System.out.println("correct");
            } else {
                System.out.println("wrong, veuillez recommencer");
            }
        }
    }
}