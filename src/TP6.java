//Écrivez un programme Java qui permet de résoudre une équation du 2nd degré de la forme ax2+bx+c = 0.
//        L’utilisateur devra fournir a,b,c à partir du clavier, ensuite le programme lui donnera la solution
//
import java.util.Scanner;
public class TP6 {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("veuillez entrer les valeur a b c (dans l'ordre) de votre equation du 2nd degre ax2 + bx + c = 0");
        double a = keyboardInput.nextInt();
        double b = keyboardInput.nextInt();
        double c = keyboardInput.nextInt();

        double delta = Math.pow(b,2) - 4*a*c;
        if(delta >= 0){
            if(delta > 0){
                double n1 = (-b - Math.sqrt(delta))/2;
                double n2 = (-b + Math.sqrt(delta))/2;
                System.out.printf("l\'equation a 2 solitions: %f et %f", n1, n2);
            }else{
                double n3 = -b/(2*a);
                System.out.printf("l\'equation a 1 unique solution: %f", n3);
            }
        }else{
            System.out.println("l\'equation n\'a pas de solution");
        }

    }
}
