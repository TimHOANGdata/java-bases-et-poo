import java.util.HashMap;

public class Point16_HashTable {
    public static void main(String[] args) {
        HashMap<String,String> identite = new HashMap<>();
        //nom: HOANG
        //Prenom: Thanh Nghiem
        //Pays: Vietnam
        //cle : nom, prenom, pays | valeur: hoang, Thanh nghiem, viet nam
        identite.put("nom","Hoang");
        identite.put("prenom","Thanh Nghiem");
        identite.put("pays","Vietnam");
        System.out.println(identite);

        System.out.println(identite.get("nom"));
    }
}
