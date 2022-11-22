package TP_Stock;

import java.util.ArrayList;

import static TP_Stock.Program.*;

public class Test {
    public static void main(String[] args) {
        Article a = new Article(1, "a", 3, 3);
        Article b = new Article(2, "b", 5, 4);
        Article c = new Article(3, "c", 9, 5);
        Article n = new Article(2,"b",3,4);
        Article m = new Article(7,"d",3,3);
        ArrayList<Article> stock = new ArrayList<>();
        stock.add(a);
        stock.add(b);
        stock.add(c);


//        System.out.println(rechercheRef( stock, 1));
//        System.out.println(rechercheRef( stock, 6));

//        System.out.println(rechercheNom(stock,"a"));
//        System.out.println(rechercheNom(stock, "oasdm"));

//        System.out.println(recherchePrix(stock,4,10));
//        System.out.println(recherchePrix(stock,23,59));

//        System.out.println(supprimeRef(stock,4));

//        System.out.println(affichage(stock))

//        System.out.println(modifiyRef(stock,1,"f",5,7));

//        System.out.println(ajoute(stock,n));
//        System.out.println(ajoute(stock,m));
//        System.out.println(stock);
//        quit();
    }
}
