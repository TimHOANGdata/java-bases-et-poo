//Écrire un programme Java qui demande à l’utilisateur de saisir la valeur du diamètre, et qui ensuite va effectuer le calcul de la surface.
//        Surface = Rayon x Rayon x PI;
//        Rayon = Diamètre / 2
import java.util.Scanner;

public class TP1 {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("veuillez entrer le diametre:");
        double d = keyboardInput.nextFloat();
        double r = d/2;
        double surface = Math.pow(r,2)*Math.PI;

        System.out.printf("rayon = %f\nsurface = %f",d,surface);
    }
}
