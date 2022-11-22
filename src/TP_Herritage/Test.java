package TP_Herritage;

public class Test {
    public static void main(String[] args) {
        Batiment batiment1 = new Batiment();
        Batiment batiment2 = new Batiment("cdf");

        batiment1.getAdresse();
        batiment2.getAdresse();
        System.out.println(batiment2);
        System.out.println(batiment1);
        batiment1.setAdresse("abv");
        batiment2.setAdresse("dsn");
        System.out.println(batiment2);
        System.out.println(batiment1);

        Maison maison = new Maison();
        Maison maison1 = new Maison("asdasd",2);
        System.out.println(maison);
        System.out.println(maison1);
        maison1.getAdresse();
        maison1.getNombreDePiece();
        maison1.setAdresse("wqeqweqi");
        maison1.setNombreDePiece(3);
        System.out.println(maison1);



    }
}
