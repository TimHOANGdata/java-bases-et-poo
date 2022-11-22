package TPs_JAVA_POO;

import java.util.ArrayList;

public class bibliotheque {
    private String nom;
    private ArrayList<exemplaire> exemplaires = new ArrayList<>();

    public bibliotheque(String nom, ArrayList<exemplaire> exemplaires) {
        this.nom = nom;
        this.exemplaires = exemplaires;
        System.out.println("La bibliothèque "+nom+" est ouverte !");
    }
    public String getNom(){
        return nom;
    }
    public int getNbExemplaires(){
        int nbExemplaireTotal = 0;
        for(exemplaire a:exemplaires){
            nbExemplaireTotal += a.getNombreExemplaire();
        }return nbExemplaireTotal;
    }



    //stocker
    public String stocker(exemplaire exemplaire1){
        exemplaire exemplaire2 = new exemplaire(null,0,null,null);
        int nombre=0;
        for(exemplaire a : exemplaires){
            if(exemplaire1.getReference() == a.getReference()){
                nombre=a.getNombreExemplaire()+exemplaire1.getNombreExemplaire();
                a.setNombreExemplaire(nombre);
                exemplaire2=a;
            }
        }if(nombre==0){
            exemplaires.add(exemplaire1);
        }else{
            exemplaires.add(exemplaire2);
        }
        return "nouvelle exemplaire =>" + exemplaire1.getReference() + "," + exemplaire1.getAuteur() + " ,en " + exemplaire1.getLangue();
    }

    public String lister(String langue) {
        String text = "";
        for(exemplaire a:exemplaires){
            if(a.getLangue() == langue){
                text += a.getNombreExemplaire() + "exemplaire de" + a.getReference() +","+ a.getAuteur() +", en" +a.getLangue()+'\n';
            }
        }
        return text;
    }
    public String compterExemplaires(String nom){
        int nombre = 0;
        for(exemplaire a : exemplaires){
            if(nom==a.getReference()){
                nombre = a.getNombreExemplaire();
            }
        }if(nombre ==0){
            return "cette exemplaire n'existe pas dans le stock";
        }else{
            return "il y a "+nombre+" exemplaire de "+nom+" dans le stock";
        }
    }
//    public boolean afficheAuteur(String auteur){
//
//    }
}
