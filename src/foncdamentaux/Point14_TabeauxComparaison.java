package foncdamentaux;

public class Point14_TabeauxComparaison {
    public static void main(String[] args) {
        int[] number = {10,15,23};
        int[] number2 = number;

        System.out.printf("number[0] = : %d\n",number[0]);
        System.out.printf("number2[0] = : %d\n\n", number2[0]);

        number2[1] = 67;
        System.out.printf("number[1] = : %d\n",number[1]);
        System.out.printf("number2[1] = : %d\n\n", number2[1]);
    }
}
