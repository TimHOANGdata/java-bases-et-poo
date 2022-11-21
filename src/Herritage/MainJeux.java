package Herritage;
// DRY: Don't repeat yourself
// dans les 3 classes magicien, guerrier, sorcier , il y a trop de repetition
// Donc, on peut utiliser les heritages de la classe avec les generalisation et les specialisation.
// Syntax extends

import java.util.ArrayList;

public class MainJeux {
    public static void main(String[] args) {
        var m16 = new Arme("m16","Semi-automatique","ARmalitte",800);
        var Ak47 = new Arme("Ak47","Semi-Automatique","USSR",1300);
        ArrayList<Arme> mesArmes =new ArrayList<>();
        mesArmes.add(m16);
        mesArmes.add(Ak47);

        var chris = new Guerrier("Christian Lisangola",100,mesArmes);
        var marie = new Magicien("Marie Bocage",150,"MarieGuette");
        var abdelali = new Sorcier("Abdelali Akhyat",200,"baguetteAbdel","baton");

//        var thomas = new Personnage("Thomas Rust",300);
//        //classe abstraite: Une classe abstraite est une classe qui ne peut pas être directement instanciée
//         la classe personnage n'existe que pour generaliser les caracteristiques des classes : guerrier,
        // magicine ou sorcier

//        chris.presentation();
//        marie.presentation();
//        abdelali.presentation();

        ArrayList<Personnage> personnages = new ArrayList<>();
        personnages.add(chris);
        personnages.add(marie);
        personnages.add(abdelali);

        for (int i=0; i<personnages.size();i++){
            System.out.println(personnages.get(i).getName());
        }
        for (Personnage personnage:personnages){
            if(personnage.getClass() == Guerrier.class){
                System.out.println(((Guerrier) personnage).getArmes());
            }
        }
        ArrayList<EntiteVolant> personnagesVolants = new ArrayList<>();
        personnagesVolants.add(chris);
        personnagesVolants.add(abdelali);
        for(int i = 0;i<personnagesVolants.size();i++){
            personnagesVolants.get(i).voler();
        }

    }
}