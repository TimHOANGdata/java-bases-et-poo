package TP_Herritage;

public class Maison extends Batiment{
    int nombreDePiece;
    public Maison(){
        adresse = "sdsada";
        nombreDePiece = 1;
    }
    public Maison(String adresse, int nombreDePiece) {
        super(adresse);
        this.nombreDePiece = nombreDePiece;
    }

    public int getNombreDePiece() {
        return nombreDePiece;
    }

    public void setNombreDePiece(int nombreDePiece) {
        this.nombreDePiece = nombreDePiece;
    }

    @Override
    public String toString() {
        return "Maison{" +
                "nombreDePiece=" + nombreDePiece +
                ", adresse='" + adresse + '\'' +
                '}';
    }
}
