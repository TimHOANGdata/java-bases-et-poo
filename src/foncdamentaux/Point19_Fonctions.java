package foncdamentaux;// une fonction doit etre petite

public class Point19_Fonctions {
    public static String reverseStr(String str){
        String reversed="";
        for(String lettre:str.split("")){
            reversed = lettre + reversed;
        }
        return reversed;
    }
    public static String formatStr(String str){
        String formatted = str.replaceAll("[^A-Za-z]","").toLowerCase();
        return formatted;
    }
    public static boolean isPalindrome(String phrase){
        String text = formatStr(phrase);
        return text.equals(reverseStr(text));
    }
    public static int calculSomme(int nombre1, int nombre2){
        return nombre1+nombre2;
    }
    public static double calculSurfaceCercle(double rayon){
        return Math.pow(rayon,2)*Math.PI;
    }
    public static int sommeTableau(int[] nombres){
        int somme = 0;
        for (int nombre:nombres){
            somme += nombre;
        }
        return somme;
    }
    public static void main(String[] args) {
        String chaine1="Papy et Mamy";
        String chaine1Formatted = formatStr(chaine1);
        System.out.println(formatStr(chaine1Formatted));
        System.out.println(reverseStr(chaine1Formatted));
        System.out.println(isPalindrome(chaine1));
        System.out.println(isPalindrome("papa"));
        System.out.println(isPalindrome("non"));
        System.out.println(calculSomme(4,9));
        System.out.println(calculSurfaceCercle(3.3));
        int[] nombres = {13,323,123,323,123,32};
        System.out.println(sommeTableau(nombres));
    }
}
