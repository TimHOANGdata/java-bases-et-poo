import java.util.Scanner;

//A l’exercice précédent, s’ajoute un nouveau requirement:
//        Le nombre de fois que l’utilisateur peut saisir des mauvais identifiants est limité à 5, ensuite le programme va s’arrêter avec un message disant.
//        “Vous avez saisi des mauvais identifiants x fois, votre compte est bloqué“.
//        Il faut dire à au user le nombre de tentatives restants
public class TP11 {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Veuillez fournir un votre email : ");
        String Email = keyboardInput.nextLine();
        System.out.print("Veuillez fournir un votre mot de pass : ");
        String mdp = keyboardInput.nextLine();
        String EmailATester;
        String mdpATester;
        int tentative = 0;
        System.out.println("enter your email and your mot de pass");
        do{
            System.out.println("enter your email: ");
            EmailATester = keyboardInput.nextLine();
            System.out.println("enter your mot de pass: ");
            mdpATester = keyboardInput.nextLine();
            tentative++;
            if(EmailATester.equals(Email) && mdpATester.equals(mdp)) {
                System.out.println("bienvenue");
                break;
            }else if(tentative ==5) {
                System.out.println("Vous avez saisi des mauvais identifiants 5 fois, votre compte est bloqué");
                break;
            }else {
                System.out.printf("Re-enter your email and your mot de pass, vous avez %d tentatives restants", 5 - tentative);
                continue;
            }
        }while(true);
    }
}
