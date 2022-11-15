public class Point9_SuiteContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) { // il va passer les nombres pairs et prendre que des impairs
                continue;
            }
            if (i >80){ // il va prend que des valeur <= 80
                break;
            }
            System.out.println(i);
        }
    }
}
