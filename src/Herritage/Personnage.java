package Herritage;

public abstract class Personnage { //SuperClass
   // Une classe abstraite est une classe qui ne peut pas être directement instanciée.
   // Une classe abstraite encapsule des attributs et méthodes qui peuvent être utilisés
   // par les instances des classes qui en héritent.
    private String name;
    private int dureeDeVie;

    public Personnage(String name, int dureeDeVie) {
        this.name = name;
        this.dureeDeVie = dureeDeVie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDureeDeVie() {
        return dureeDeVie;
    }

    public void setDureeDeVie(int dureeDeVie) {
        this.dureeDeVie = dureeDeVie;
    }


//    public void presentation(){
//        System.out.printf("mon nom est %s ,et je suis un personnage\n",this.name);
//    }
    //dans le cas cette presentation est inutile parce qu'on a deja les presentation spécifique pour chaque class,
    // On peut définir cette method abstraite.
    // Une methode abstraite ne contient pas son core.
    // Si on définit une methode abstraite dans le super class. Les subclass doit implementer la method abstraite
    // Si on définit une methode abstraite dans une classe, cette classe doit être abstraite aussi.
    public abstract void presentation();


    //abstraction: les caracteres necessares importants par rapport au probleme qu'on résout pour un objet
    //encapsulationn : L’encapsulation est un mécanisme consistant à rassembler les données et les méthodes au sein d’une structure en cachant l’implémentation de l’objet,
    // C’est-à-dire en empêchant l’accès aux données par un autre moyen que les services proposés
}

