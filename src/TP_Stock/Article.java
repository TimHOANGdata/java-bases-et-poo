package TP_Stock;
//TP1.
//        Soit à développer une application pour la gestion d’un stock.
//        Un article est caractérisé par son numéro de référence, son nom, son prix de vente et une quantité en stock.
//        Le stock est représenté par une collection d’articles.
//   Travail à faire:
//   Créer la classe article contenant les éléments suivants :
//        Les attributs/propriétés.
//        Un constructeur d’initialisation.
//        La méthode ToString().
//        Dans la classe Program créer :
//        Le stock sous forme d’une collection d’articles de votre choix.
//   Un menu présentant les fonctionnalités suivantes :
//        Rechercher un article par référence.
//        Ajouter un article au stock en vérifiant l’unicité de la référence.
//        Supprimer un article par référence.
//        Modifier un article par référence.
//        Rechercher un article par nom.
//        Rechercher un article par intervalle de prix de vente.
//        Afficher tous les articles.
//        Quitter

public class Article {
    private int numeroDeReference;
    private String nom;
    private double prixDeVente;
    private int quantiteEnStock;

    public Article(int numeroDeReference, String nom, double prixDeVente, int quantiteEnStock) {
        this.numeroDeReference = numeroDeReference;
        this.nom = nom;
        this.prixDeVente = prixDeVente;
        this.quantiteEnStock = quantiteEnStock;
    }

    public Article() {
        this.numeroDeReference = 0;
        this.nom = null;
        this.prixDeVente = 0;
        this.quantiteEnStock = 0;
    }

    public int getNumeroDeReference() {
        return numeroDeReference;
    }

    public void setNumeroDeReference(int numeroDeReference) {
        this.numeroDeReference = numeroDeReference;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrixDeVente() {
        return prixDeVente;
    }

    public void setPrixDeVente(double prixDeVente) {
        this.prixDeVente = prixDeVente;
    }

    public int getQuantiteEnStock() {
        return quantiteEnStock;
    }

    public void setQuantiteEnStock(int quantiteEnStock) {
        this.quantiteEnStock = quantiteEnStock;
    }

    @Override
    public String toString() {
        return  "[" +
                "numeroDeReference=" + numeroDeReference +
                ", nom='" + nom + '\'' +
                ", prixDeVente=" + prixDeVente +
                ", quantiteEnStock=" + quantiteEnStock +
                ']'+'\n';
    }



}

