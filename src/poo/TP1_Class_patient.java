//TP1.Calcul IMC
//Le but de cet exercice est de créer des « patients » qui ont un poids et une taille,et de calculer leur « Indice de Masse Corporelle» (IMC).
//crée un patient,
//affiche les données du patient ainsi que son IMC.
//Avoir la possibilité de connaître la taille du patient, son poids
//Pour calculer l’IMC veuillez lire ceci : https://www.santemagazine.fr/minceur/imc-indice-de-masse-corporelle-267579

package poo;
import java.util.Scanner;
public class TP1_Class_patient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Patient patient1 = new Patient(1.7,60);

        patient1.afficheDonnee();

        System.out.println("entrer la nouvelle taille du patient");
        patient1.setTaille(input.nextDouble());

        System.out.println("entrer le nouveau poid du patient");
        patient1.setPoid(input.nextDouble());

        patient1.afficheDonnee();

    }
}
