package TPs_JAVA_POO;

import java.util.Scanner;

public class tireLire {
    private double montant;

    public tireLire(double montant) {
        this.montant = montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public double getMontant() {
        return montant;
    }

    public String affichage(){
        if(montant>0){
            return montant + "€ dans votre tirelire";
        }else{
            return "Vous êtes sans le sou";
        }
    }
    public String secouer(){
        if(this.montant>0){
            return "Bing bing";
        }else{
        return null;
        }
    }
    public void remplir(double montantRemplir){
        if(montantRemplir>0){
            montant += montantRemplir;
        }
    }
    public void vider(){
        montant = 0;
    }

    public void puiser(double montantPuiser){
        while(montantPuiser>0){
            if(montantPuiser<montant){
                montant = montant-montantPuiser;
                break;
            }else{
                montant =0;
                break;
            }
        }
    }
    public String calculerSold(double budget){
        String text ="donnez le budget de vos vacances:" + budget+'\n';
        Scanner input = new Scanner(System.in);
        if(budget < montant){
            double diff = montant - budget;
            text += "vous etes assez riche pour partir en vacances! il vous restera" + diff + "euros";
        }else if(budget<0){
            text =text;
        }
        else{
            double diff = budget -montant;
            text += "il vous manque " +diff+" euros pour partir en vacances";
        }return text;
    }
}
