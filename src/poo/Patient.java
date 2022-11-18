package poo;

public class Patient {
    private double poid;
    private double taille;

    public Patient(double taille, double poid){
        this.taille=taille;
        this.poid = poid;
    }
    public double getPoid(){
        return poid;
    }
    public double getTaille() {
        return taille;
    }
    public double setPoid(double poid) {
        if (poid > 0) {
            this.poid = poid;
        } else {
            System.out.println("poid du patient doit etre positif et en kg");
        }
        return poid;
    }
    public double setTaille(double taille) {
        if (taille>0) {
            this.taille = taille;
        }else {
            System.out.println("taille du patient doit etre positif en m");
        }
        return taille;
    }
    public double calculIMC(){
        return poid/taille;
    }
    public String afficheDonnee(){
        return String.format(System.out.printf("Patient: poid: %.1fkg - taille: %.1fm - IMC: %.1f\n",
                poid,taille,calculIMC()).toString());
    }


}
