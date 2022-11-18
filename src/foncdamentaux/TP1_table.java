package foncdamentaux;

//foncdamentaux.TP1.
//        Écrivez un programme Tables.java affichant les tables de multiplication de 2 à 10.
//        Votre programme devra produire la sortie suivante à l’écran :
//        Tables de multiplication
//        Table de 2 :
//        1 * 2 = 2
//        ...
//        10 * 2 = 20
//        ...
//        Table de 5 :
//        1 * 5 = 5
//        2 * 5 = 10
//        ... ...
//        Table de 10 :
//        1 * 10 = 10 …
public class TP1_table {
    public static void main(String[] args) {
        for(int i = 2;i<=10; i++){
            System.out.printf("table de %d\n",i);
            for(int j = 1;j<=10;j++){
                System.out.printf("%d * %d = %d\n",i,j,Math.multiplyExact(i,j));
            }
        }
    }
}
