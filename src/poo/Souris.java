//TP 12
// Le but de cet exercice est de créer des « souris » par différents biais et de les faire « évoluer » au cours du temps.
//
//Une souris est caractérisée par son poids en grammes (un int), sa couleur (une String), son âge en mois (un int), son espérance de vie (un int) et une indication sur le fait qu’elle soit clonée ou pas (un booléen).
//Ces attributs seront nommés respectivement : poids, age, couleur, esperanceVie et clonee.
//
// Par ailleurs, les méthodes publiques de la classe Souris sont :
// des constructeurs conformes à la méthode main fournie, avec l’ordre suivant pour les paramètres : le poids, la couleur, l’âge et l’espérance de vie. Ces deux derniers paramètres ont pour valeur par défaut zéro et 36 respectivement. La valeur 36 est stockée dans une constante fournie que vous utiliserez en écrivant ESPERANCE_VIE_DEFAUT. Les constructeurs afficheront le message Une nouvelle souris ! ;
//
//
//  un constructeur de copie qui doit afficher le message Clonage d’une souris ! ;
//  une souris clonée a les mêmes caractéristiques que la souris d’origine, sauf son espérance de vie qui est moindre : les 4 cinquième de celle de la souris d’origine ;
//
//
//  une méthode toString() produisant une représentation d’une Souris respectant strictement le format suivant : Une souris <couleur>[, clonée,] de <age> mois et pesant <poids> grammes (sur une seule ligne) où <age> est à remplacer par l’âge de la souris et <poids> par son poids. Le bout de phrase « , clonée, » ne sera affiché que si la souris a été clonée ;
//
// une méthode vieillir qui augmentera d’une unité l’âge de la souris. Si la souris est clonée, elle doit devenir verte si elle atteint un âge supérieur à la moitié de son espérance de vie ; même si elle n’est pas appelée explicitement dans la méthode main(), cette méthode doit être publique ; elle sera testée ;
//
//
//   et une méthode évolue faisant vieillir la souris depuis son âge courant jusqu’à son espérance de vie.
//
//
//   Tous les affichages demandés se feront sur le terminal et seront terminés par un saut de ligne.
//
//  Exemple d'exécution
//
//        Une nouvelle souris !
//        Une nouvelle souris !
//        Clonage d’une souris !
//        Une souris blanche de 2 mois et pesant 50 grammes
//        Une souris grise de 0 mois et pesant 45 grammes
//        Une souris grise, clonée, de 0 mois et pesant 45 grammes
//        Une souris blanche de 36 mois et pesant 50 grammes
//        Une souris grise de 36 mois et pesant 45 grammes
//        Une souris verte, clonée, de 28 mois et pesant 45 grammes



        package poo;


public class Souris {
    private double poid;
    private String couleur;
    private int age = 0;
    private int esperanceVie;

    private boolean clonee;


    public Souris(double poid, String couleur) {
        this.poid = poid;
        this.couleur = couleur;
        this.age = age;
        this.esperanceVie= 36;
        System.out.println("Une nouvelle souris!");
    }


    public Souris(Souris souris) {
        this.poid = souris.poid;
        this.couleur = souris.couleur;
        this.age = souris.age;
        this.esperanceVie = (4*souris.esperanceVie)/5;
        this.clonee = true;
        System.out.println("Clonage d'une souris!");
    }

    public String toString() {
        String donnees;
        if (this.clonee) {
            donnees = String.format("Une souris " + couleur + "[ clonée,] de " + age + " mois et pesant " + poid + " grammes");
        } else {
            donnees = String.format("Une souris " + couleur + " de " + age + " mois et pesant " + poid + " grammes");
        }
        return donnees;
    }

    public String veillir() {
        this.age = age + 1;
        if (this.clonee && this.age > esperanceVie / 2) {
            this.couleur = "vert";
        }
        return toString();
    }
    public String evolue() {
        while(this.age < this.esperanceVie){
            this.veillir();
        }
        return toString();
    }
}



