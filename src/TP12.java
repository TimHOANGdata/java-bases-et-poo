import java.util.Scanner;

//Écrire un programme Java qui génère un nombre(entier) aléatoire entre 1 et 100 et qui ensuite demandera
//à l’utilisateur de deviner le nombre jusqu’à ce que la réponse convienne.
//En cas de réponse supérieure à la valeur générée,
//le programme affichera“Entrer un plus petit nombre”.En cas de valeur inférieur, le programme affichera “Entrer un plus grand nombre”.
public class TP12 {
    public static void main(String[] args) {
        double n1 = Math.random();
        double n2 = n1*100;
        int r = (int)n2 + 1; //Add 1 to change the range to 1 - 100 instead of 0 - 99
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("veuillez deviner un nombre: ");
        do{
            int n3 = keyboardInput.nextInt();
            if(n3>r){
                System.out.println("entrer un plus petit nombre");
            }else if(n3<r){
                System.out.println("entrer un plus grand nombre");
            }else{
                System.out.println("bon");
                break;
            }
        }while(true);
    }
}
