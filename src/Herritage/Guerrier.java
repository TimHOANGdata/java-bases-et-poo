package Herritage;

import java.util.ArrayList;

public class Guerrier extends Personnage implements EntiteVolant {
    private ArrayList<Arme> armes;

    public Guerrier(String name, int dureeDeVie){
        super(name,dureeDeVie);
    }
    public Guerrier(String name, int dureeDeVie, ArrayList<Arme> armes) {
        this(name,dureeDeVie);
        this.armes = armes;
    }

    public ArrayList<Arme> getArmes() {
        return armes;
    }

    public void setArmes(ArrayList<Arme> arme) {
        this.armes = arme;
    }

    public void addArme(Arme arme){
        this.armes.add(arme);
    }

    public void presentation(){
        System.out.printf("mon nom est %s ,et je suis un guerrier\n",this.getName());
    }
    //add pouvoir voler à la classe geurrier

    public void voler(){
        System.out.println("i believe i can fly");
    }
}
