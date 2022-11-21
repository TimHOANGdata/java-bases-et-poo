package Herritage;

public class Sorcier extends Magicien implements EntiteVolant{

    private String batonMagique;

    public Sorcier(String name, int dureeDeVie, String baguetteMagique, String batonMagique) {
        super(name,dureeDeVie,baguetteMagique);
        this.batonMagique = batonMagique;
    }

    public String getBatonMagique() {
        return batonMagique;
    }

    public void setBatonMagique(String batonMagique) {
        this.batonMagique = batonMagique;
    }
    public void presentation(){
        System.out.printf("mon nom est %s ,et je suis un sorcier\n",this.getName());
    }
    //add pouvoir voler a la class sorcier
    public void voler(){
        System.out.println("i can fly using my baton");
    }
}
