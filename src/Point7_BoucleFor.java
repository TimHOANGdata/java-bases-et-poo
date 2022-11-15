public class Point7_BoucleFor {
    public static void main(String[] args) {
//      DRY don't repoeat yourself
//        System.out.printf("le carre de 2 est %f\n",Math.pow(2,2));
//        System.out.printf("le carre de 3 est %f\n",Math.pow(3,2));
//        System.out.printf("le carre de 4 est %f\n",Math.pow(4,2));
//        System.out.printf("le carre de 5 est %f\n",Math.pow(5,2));
//        System.out.printf("le carre de 6 est %f\n",Math.pow(6,2));
//        System.out.printf("le carre de 7 est %f\n",Math.pow(7,2));
//        System.out.printf("le carre de 8 est %f\n",Math.pow(8,2));
//        System.out.printf("le carre de 9 est %f\n",Math.pow(9,2));
//        System.out.printf("le carre de 10 est %f\n",Math.pow(10,2));

//        le nombres evoluent de 2 a 10 avec un pas de 1
//        On sait quand s'arreter
        for (int nombre = 2; nombre <= 10; nombre++) {
            System.out.printf("le carre %d est %.1f\n", nombre, Math.pow(nombre, 2));
        }
    }
}