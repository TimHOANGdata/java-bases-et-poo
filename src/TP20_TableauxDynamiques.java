import java.util.ArrayList;
import java.util.Scanner;

import static java.util.Arrays.copyOf;

//Écrire un programme Java demande à l’utilisateur de saisir  liste de langages de programmations à partir du clavier.
//Une fois le tableau rempli, l’utilisateur sera appelé à saisir les noms des langages qu’il souhaite retirer de liste.
//Le programme devra ensuite retirer ces langages et afficher l’état du tableau avant et après la suppression.
public class TP20_TableauxDynamiques {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> tabInitial = new ArrayList<>();
        ArrayList<String> tab = new ArrayList<>();
        System.out.println("entrez votre list de langages, entrez \'done\' pour finir");
        while (true) {
            String langage = input.nextLine();
            if (langage.equals("done")){
                break;
            }
            tab.add(langage);
        }
        for(String a:tab){
            tabInitial.add(a);
        }
        System.out.println("entrez les langages que vous voulez retirer, entrez \'done\' pour finir");
        while (true){
            String remove = input.nextLine();
            if (remove.equals("done")){
                break;
            }
            tab.remove(remove);
        }
        System.out.println(tabInitial);
        System.out.println(tab);
    }
}

