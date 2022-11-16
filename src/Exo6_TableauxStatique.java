//definir 1 tableau statique de la taille fix pour stoquer  5 doubles

//permettre a l'utilisateur de definir le nombres des notes a stocker
// - la valeur doit toujours etre > 0

//permettre a l'utilisateur d'entrer les notes du tableaux a partir du clavier
//les valeur ne doivent etre entre 0 et 20

// permettre calculer le moyen
import  java.util.Scanner;
public class Exo6_TableauxStatique {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        int nombreInput = 0;
        System.out.print("Veuillez définir le nombre des notes : ");
        do {
            nombreInput = keyboardInput.nextInt();
            if (nombreInput < 0) {
                System.out.println("le nombre doit >0, veuillez reessayer");
            } else {
                System.out.printf("le nombre de notes est %d\n", nombreInput);
                break;
            }
        } while (true);
        double[] notesCoursPhysique = new double[nombreInput];
        System.out.println("veuillez entrer les notes");
        double somme = 0;
        for (int i = 0; i < nombreInput; i++) {
            do {
                notesCoursPhysique[i] = keyboardInput.nextFloat();
                if (notesCoursPhysique[i] < 0 || notesCoursPhysique[i] > 20) {
                    System.out.println("note doit etre entre 0 et 20, reessayer");
                }else{
                    System.out.printf("note physique %d est %f\nMerci de entrer le note suivant\n", i + 1, notesCoursPhysique[i]);
                    break;
                }
            } while (true);
                somme = somme + notesCoursPhysique[i];
            }
        double moyen = somme/nombreInput;
        System.out.println("moyen des notes est " + moyen);
        }
    }

