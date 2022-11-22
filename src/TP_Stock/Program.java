package TP_Stock;

import java.util.ArrayList;

public class Program extends Article {

    // recherche un article par reference
    public static String rechercheRef(ArrayList<Article> stock, int numRef) {
        Article acticlecherche = new Article();
        for (Article article : stock) {
            if (numRef == article.getNumeroDeReference()) {
                acticlecherche = article;

            }
        }if(acticlecherche.getNumeroDeReference()==0) {
            return "article n'existe pas dans le stock";
        }else{
            return acticlecherche.toString();
        }
    }

    // ajouter un article en verifiant l'unicite de la reference
   public static String ajoute(ArrayList<Article> stock, Article article) {
       int quantite = 0;
       for (Article article1 : stock) {

           if (article.getNumeroDeReference() == article1.getNumeroDeReference()) {
               quantite = article1.getQuantiteEnStock() + article.getQuantiteEnStock();
               article1.setQuantiteEnStock(quantite);
           }
       }
       if(quantite==0){
           stock.add(article);
           return "l'article" + article + " n'est pas dans le stock \nNouveau stock : " + stock;
       }else{
           return "Nouveau stock est " + stock;
       }
   }



    //supprimer un article par reference
    public static ArrayList<Article> supprimeRef(ArrayList<Article> stock, int numRef) {
        Article article1 = new Article();
        for (Article article : stock) {
            if (numRef == article.getNumeroDeReference()) {
                article1 =article;
            }
        }stock.remove(article1);
        return stock;
    }

    // Modifier un article par reference
    public static String modifiyRef(ArrayList<Article> stock, int numRef, String nom, double prix, int quantite) {
        Article article1 = new Article();
        for (Article article : stock) {
            if (numRef == article.getNumeroDeReference()) {
                article1 = article;
            }
        }
        article1.setNom(nom);
        article1.setPrixDeVente(prix);
        article1.setQuantiteEnStock(quantite);
        if (article1.getNumeroDeReference() == 0) {
            return "article n'exist pas dans le stock";
        } else {
            return article1.toString();
        }
    }




    // rechercher un article par nom
    public static String rechercheNom(ArrayList<Article> stock, String nom) {
        Article articlecherche = new Article();
        for (Article article : stock) {
                if (nom.toLowerCase() == article.getNom().toLowerCase()) {
                    articlecherche = article;
                }
            }
            if(articlecherche.getNumeroDeReference()==0) {
                return "article n'exist pas dans le stock";
            }else{
                return articlecherche.toString();
        }
    }



    //recherche un article par intervalle de prix de vente
    public static String  recherchePrix(ArrayList<Article> stock, int prix1, int prix2) {
        ArrayList<Article> articlecherche = new ArrayList<>();
        for (Article article : stock) {
            if (prix1 <= article.getPrixDeVente() && article.getPrixDeVente() <= prix2) {
                articlecherche.add(article);
            }
        }
        if (articlecherche.isEmpty()) {
            return "il n'y a pas d'article dans cette intervalle de prix";
        } else {
            return articlecherche.toString();
        }
    }


    //Afficher tous les articles du list
    public static String affichage(ArrayList<Article> stock){
        return stock.toString();
    }

    //quitting

    public static Object quit(){
        System.exit(0);
        return null;
    }


}

