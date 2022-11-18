package foncdamentaux;

public class Point11_TableauxStatiques {
    public static void main(String[] args) {
//        int a = null;
//        double b=null; // on peut pas definir un variable null
        double[] test =null; // on peut creer un tableau null

        double notesCoursPhysique[] = new double[5];

        //permettre a l'utilisateur d'entrer les notes du tableaux a partir du clavier
        //les valeur ne doivent etre entre 0 et 20
        notesCoursPhysique[0] = 12.5;
        notesCoursPhysique[1] = 15;
        notesCoursPhysique[2] = 17;
        notesCoursPhysique[3] = 8;
        notesCoursPhysique[4] = 11;
        for(int i = 0; i<=4; i++){
            System.out.println(notesCoursPhysique[i]);
        }

        // calcul de la somme des notes
        double somme = 0;
        for(int i=0;i<notesCoursPhysique.length;i++){
            somme = somme + notesCoursPhysique[i];
        }
        System.out.println("somme des notes = " + somme);

        // calcule du moyen des notes
        double moyen = somme/notesCoursPhysique.length;
        System.out.println("moyen des notes = " + moyen);
    }
}
