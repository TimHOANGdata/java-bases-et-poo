//Écrivez un programme Java qui demande à l’utilisateur d’entrer un nombre et qui ensuite va calculer et afficher la factorielle de ce nombre:
import java.util.Scanner;
public class TP9 {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("veuillez entrer un nombre: ");
        int factoriel=1;
        int nombre = keyboardInput.nextInt();
        for(int nombre2=2 ;nombre2<=nombre;nombre2++){
            factoriel = factoriel*nombre2;
        }
        System.out.printf("factoriel de %d est %d",nombre,factoriel);
    }
}