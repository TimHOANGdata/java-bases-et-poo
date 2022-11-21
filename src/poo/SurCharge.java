package poo;

public class SurCharge {
    public static int somme(int nombre1, int nombre2){
        return nombre1+nombre2;
    }

    public static int somme(int... nombres){
        int resultat = 0;
        for (int nombre:nombres){
            resultat += nombre;
        }
        return resultat;
    }

    public static void main(String[] args) {
        System.out.println(somme(2,3));
        System.out.println(somme(5,13,323,323,232,1,2312,312,23));
    }
    // on peut avoir la surcharge- polymorphisme -
    // different methode de meme nom, mais avec different signature
    //le progamme va choisir le methode selons variables.
}
