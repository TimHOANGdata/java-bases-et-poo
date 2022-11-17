import java.util.Scanner;

public class Point17_CharEtString {
    public static void main(String[] args) {
//        String nom = "Hoang"; // String est table des char
//        char   genre = 'm';
//        char[] noms = {'h','o','a','n','g'};

        var input = new Scanner(System.in);
        System.out.println("Votre pays: ");
        String pays = input.nextLine();

        System.out.println("Votre genre: ");
        char genre = input.next().charAt(0);
        // input.next() prendre tous les input avant l'espace
        // charAt(0) recuperer la character a la position 0
        // example: masculin ,    input.next() -> masculin ,    input.next().charAt(0) -> m

        System.out.printf("nom : %s\ngenre : %c\n",pays, genre);


        String monPays = "Vietnam";
        System.out.println(monPays.charAt(3)); // pour prendre que le t dans vietnam

        for(int i=0;i<monPays.length();i++){
            System.out.println(monPays.charAt(i));
        } // boucle pour prendre chaque charactere d'un mot

    }
}
