package TPs_JAVA_POO;

public class Test_tirelire {
    public static void main(String[] args) {
        tireLire A = new tireLire(450);
        System.out.println(A.affichage());
        System.out.println(A.secouer());;
        A.vider();
        A.puiser(549);
        System.out.println(A.affichage());
        A.remplir(590);
        System.out.println(A.affichage());
        System.out.println(A.calculerSold(650));;
    }
}
