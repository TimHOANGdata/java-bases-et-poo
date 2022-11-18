package foncdamentaux;

import java.security.KeyStore;


//foncdamentaux.TP3.
//        Écrire un programme Javascript qui permet à l’utilisateur de définir une adresse email et un mot de passe.
//        Ensuite dans un second temps, il sera demandé à l’utilisateur de fournir l’email et le mot de passe:
//        Si l’email et le mot de passe ne correspondent pas aux valeurs définies, le message “Identifiants incorrect devra s’afficher”, et l’utilisateur devra recommencer la saisie des valeurs.
//        Sinon, le message “Bienvenu dans votre espace client” devra s’afficher.
import java.util.Scanner;
public class TP10 {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Veuillez fournir un votre email : ");
        String Email = keyboardInput.nextLine();
        System.out.print("Veuillez fournir un votre mot de pass : ");
        String mdp = keyboardInput.nextLine();
        String EmailATester;
        String mdpATester;
        System.out.println("enter your email and your mot de pass");
        do{
            System.out.println("enter your email: ");
            EmailATester = keyboardInput.nextLine();
            System.out.println("enter your mot de pass: ");
            mdpATester = keyboardInput.nextLine();
            if(EmailATester.equals(Email) && mdpATester.equals(mdp)) {
                    System.out.println("bienvenue");
                    break;
            }else {
                System.out.println("Re-enter your email and your mot de pass");
            }
        }while(true);
        }
    }
