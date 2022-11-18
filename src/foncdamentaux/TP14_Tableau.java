package foncdamentaux;

//Le but de cet exercice est d’écrire un programme permettant d’identifier l’élément apparaissant le plus fréquemment dans un tableau d’entiers.
//Ce programme devra également afficher le nombre d’occurrences dans le tableau de cet élément le plus fréquent. Par exemple, pour le tableau suivant :
//{2, 7, 5, 6, 7, 1, 6, 2, 1, 7}
//votre programme devra indiquer que l’élément le plus fréquent est le 7 et que sa fréquence d’apparition est 3.
//Notez à ce propos que si dans un tableau donné il y a plus d’un nombre ayant
//le plus grand nombre d’occurrences, alors votre programme ne retiendra que celui qui apparaît en premier dans le tableau.
public class TP14_Tableau {
    public static void main(String[] args) {
        int[] tab ={2, 7, 5, 6, 7, 1, 6, 2, 1, 7};
        int frequencemax = 0;
        int number = 0;
        for (int i =0; i<tab.length;i++){
            int frequence = 0;
            for(int j =0;j<tab.length;j++){
                if(tab[i]==tab[j]){
                    frequence++;
                }
            }
            if (frequence>frequencemax){
                frequencemax=frequence;
                number = tab[i];
            }
        }
        System.out.println("l’élément le plus fréquent est le "+ number + " et que sa fréquence d’apparition est " + frequencemax);
    }
}
