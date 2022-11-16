//TP2.
//Écrire un programme Java qui demande à l’utilisateur de remplir un tableau d’entiers à partir du clavier.
//Puis le programme devra lui demander d’entrer un nombre à rechercher dans le tableau.
//Si nombre existe, le programme lui dira que le nombre existe et le nombre de fois qu’ils se retrouve dans le tableau
//Sinon le programme lui dira que le nombre recherché n’existe pas dans le tableau
//Ex : tableau saisi à partir du clavier : 12,45,6,7,12,23,33,6,22,3,6
//->Entrer un nombre à rechercher : 6
//->6 existe et se retrouve 3 fois dans le tableau
import java.util.Scanner;
public class TP15_Tableau {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter length of the table");
        int l = input.nextInt();
        int tab[] = new int[l];
        int count = 0;
        for (int i = 0; i<l;i++){
            System.out.printf("enter value %d of the table ",i+1);
            tab[i]= input.nextInt();
        }
        System.out.println("which number are you looking for?");
        int n1 = input.nextInt();
        for (int j =0; j<l; j++){
            if(n1 == tab[j]){
                count++;
            }
        }if(count>0){
            System.out.println( n1 + " existe et se retrouve "+ count+ " fois dans le tableau");
        }else {
            System.out.println("le nombre recherché n’existe pas dans le tableau");
        }
    }

}

