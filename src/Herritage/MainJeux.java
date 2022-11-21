package Herritage;
// DRY: Don't repeat yourself
// dans les 3 classes magicien, guerrier, sorcier , il y a trop de repetition
// Donc, on peut utiliser les heritages de la classe avec les generalisation et les specialisation.
// Syntax extends

public class MainJeux {
    public static void main(String[] args) {
        var m16 = new Arme("m16","Semi-automatique","ARmalitte",800);
        var chris = new Guerrier("Christian Lisangola",100,m16);
        var marie = new Magicien("Marie Bocage",150,"MarieGuette");
        var abdelali = new Sorcier("Abdelali Akhyat",200,"baguetteAbdel","baton");

//        var thomas = new Personnage("Thomas Rust",300);
//        //classe abstraite: Une classe abstraite est une classe qui ne peut pas être directement instanciée
//         la classe personnage n'existe que pour generaliser les caracteristiques des classes: guerrier,
        // magicine ou sorcier

//        chris.presentation();
//        marie.presentation();
//        abdelali.presentation();
        System.out.println(chris.getArme());
        System.out.println(chris.getArme().getName());
    }
}