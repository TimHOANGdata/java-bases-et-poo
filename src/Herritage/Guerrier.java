package Herritage;

public class Guerrier extends Personnage {
    private Arme arme;

    public Guerrier(String name, int dureeDeVie, Arme arme) {
        super(name,dureeDeVie);
        this.arme = arme;
    }

    public Arme getArme() {
        return arme;
    }

    public void setArme(Arme arme) {
        this.arme = arme;
    }

    public void presentation(){
        System.out.printf("mon nom est %s ,et je suis un guerrier\n",this.getName());
    }

}
