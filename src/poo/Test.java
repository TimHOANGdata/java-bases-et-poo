package poo;

public class Test {
    public static double calculSurface(double longeur, double largeur){
        return longeur*largeur;
    }
    public static double calculPerimete(double longeur,double largeur){
        return 2*(largeur+longeur);
    }

    public static void main(String[] args) {
//        Rectangle rect =  new Rectangle();
        // creer un objet(variable) de la class rectangle
        // ce variable stock les donnees d'un objet de la class rectangle
        // cette syntax permet de construire un new rectangle avec la methode le constructeur "par defaut par defaut"
        // ce constructeur est effectué par le JVM
        // tous les variables doubles va etre initialise par valeur 0.0
        // tous les variables int va etre initialise par valeur 0
        // tous les variables booleans va etre initialise par valeur false
        // tous les variables String va etre initialise par valeur null
        // On peut creer notre constructeur qui permet d'initialiser avec un autre valeur

        //utiliser notre constructeur cree dans la class rectangle
        Rectangle rect =  new Rectangle(400,300);

//        rect.longeur = 250.5;
//        rect.largeur = 120.7;
        // access direct to the contenu de l'extérieur
        //⇾ risque d'entrer n'importe quoi qui ne respecte pas les regles de la class
        // donc il faut mettre les variables de la class en private pour proteger les variables.
        //==> Pour acceder aux variables privés → il faut une interface (methode) setter et getter (dans la class rectangle).
        System.out.printf("longeur avant setter : %.1f\n",rect.getLongeur());
        System.out.printf("largeur avant setter : %.1f\n",rect.getLargeur());
        //les valeurs initials sont 0.0 , 0.0 si on ne creer pas notre constructeur
        rect.setLongeur(250);
        rect.setLargeur(120);

        System.out.printf("Longeur : %.1f\n",rect.getLongeur());
        System.out.printf("Largeur : %.1f\n",rect.getLargeur());
        System.out.printf("Surface : %.1f\n", rect.calculSurface());
        System.out.printf("perimetre : %.1f\n", rect.calculPerimetre());
        // on n'a plus besoins de definir les parametre dans sout.
    }
}
