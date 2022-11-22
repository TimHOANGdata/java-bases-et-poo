package TPs_JAVA_POO;

import java.util.ArrayList;

public class Test_bibliotheque {
    public static void main(String[] args) {
        exemplaire miserable = new exemplaire("Miserable", 3,"francais"," Victor Hugo");
        exemplaire hommeQuiRit = new exemplaire("L’Homme qui rit", 3,"francais"," Victor Hugo");
        exemplaire hommeQuiRit1 = new exemplaire("L’Homme qui rit", 4,"francais"," Victor Hugo");
        ArrayList<exemplaire> exemplaires = new ArrayList<>();
        exemplaires.add(miserable);
        exemplaires.add(hommeQuiRit);
        bibliotheque adam = new bibliotheque("Adam",exemplaires);
        System.out.println(adam.getNom());
        System.out.println(adam.getNbExemplaires());
        System.out.println(adam.stocker(hommeQuiRit1));
        System.out.println(adam.compterExemplaires("Miserable"));


    }
}
