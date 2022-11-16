public class Point11_Portee {
    public static void main(String[] args) {
        int a=9;
        for(var i=0;i<=10;i++){
            int resultat=i*a;
            System.out.println(resultat);
        }

        System.out.println(a);

////        Ces 2 variables sont locales à la boucle for
//        System.out.println(resultat);//erreur
//        System.out.println(i);//erreur
    }
}
