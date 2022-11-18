package poo;

public class Rectangle { // rectangle est un class
    // definir le concept d'un objet qui est rectangle
    private double longeur;
    private double largeur; // private permet d'interdir l'access de l'exterieur


    //Creer un constructeur permet de la class initialiser avec un autre valeur que
    // 0.0 null 0 ou false du constructor "par defaut par defaut"
    //nom du constructor = nom de la class
    public Rectangle(double longeur, double largeur){
        this.longeur = longeur;
        this.largeur = largeur;
    }



    // Methode permettre d'acceder aux variables privees : getters, setters
    // getters ( accesseurs) : permettre de consulter les attributes
    // convention : il faut tjrs le prefix "get" dans son nom - Ex: getSomething
    public double getLongeur(){
        return longeur;
    }
    public double getLargeur(){// public : ctd cette methode est possible d'acceder par l'exterieurs.
        return largeur;
    }

    // setters (manipulateurs): permettre de modifier les attributes
    //convention : prefix "set" dans son nom - Ex setSomething
    public void setLongeur(double longeur){ //void : cette methode va rien retourner
        if(longeur>0){
            this.longeur = longeur;
        }else{
            System.out.println("la longeur doit tjs etre un positif");
        }
    }
    public void setLargeur(double largeur){
        if(largeur>0){
            this.largeur = largeur;
        }else{
            System.out.println("la largeur doit tjs etre un positif");
        }
    }
    // dans la nomination, le variable should avoir le meme nom qu'attribute
    // => probleme de masqage
    // => use this.variable

    public double calculSurface(){ //methode lie a la class rectangle
        return longeur*largeur;
    }
    public double calculPerimetre(){
        return 2*(longeur+largeur);
    }



}
