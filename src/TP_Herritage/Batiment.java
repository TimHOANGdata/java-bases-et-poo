//Objectif:
//        Créer une classe dérivée.
//        Ajouter des méthodes à une classe dérivée.
//        Redéfinir des méthodes dans une classe dérivée.
//        Énonce:
//        Ecrivez une classe Bâtiment avec les attributs suivants:
//        adresse
//        La classe Bâtiment doit disposer des constructeurs suivants:
//        Bâtiment(),
//        Bâtiment (adresse).
//        La classe Bâtiment doit contenir des accesseurs et mutateurs pour les différents attributs. La classe Bâtiment doit contenir une méthode ToString () donnant une représentation du Bâtiment.
//        Ecrivez une classe Maison héritant de Bâtiment avec les attributs suivants:
//        Nb Pièces: Le nombre de pièces de la maison.
//        La classe Maison doit disposer des constructeurs suivants:
//        Maison(),
//        Maison(adresse, nb Pièces).
//        La classe Maison doit contenir des accesseurs et mutateurs (ou des propriétés) pour les différents attributs. La classe Maison doit contenir une méthode ToString () donnant une représentation de la Maison.
//        Écrivez aussi un programme afin de tester ces deux classes .
package TP_Herritage;

public class Batiment {
    String adresse;

    public Batiment(){
        adresse = "abc";
    }
    public Batiment(String adresse) {
        this.adresse = adresse;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Batiment{" +
                "adresse='" + adresse + '\'' +
                '}';
    }
}
