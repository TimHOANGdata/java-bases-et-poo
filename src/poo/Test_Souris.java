package poo;

public class Test_Souris {
    public static void main(String[] args) {
        Souris souris1 = new Souris(50,"blanch",2,false);
        Souris souris2 = new Souris(45,"grise",0,false);
        Souris souris3 = new Souris(souris2);
        System.out.println(souris1);
        System.out.println(souris2);
        System.out.println(souris3);
        System.out.println(souris1.veillir());
        System.out.println(souris2.veillir());
        System.out.println(souris3.veillir());
        System.out.println(souris1.evolue());
        System.out.println(souris2.evolue());
        System.out.println(souris3.evolue());
    }
}
