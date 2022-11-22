package TPs_JAVA_POO;

public class exemplaire {
    private String reference;
    private int nombreExemplaire;
    private String langue;
    private String auteur;

    public exemplaire(String reference, int nombreExemplaire, String langue, String auteur) {
        this.reference = reference;
        this.nombreExemplaire = nombreExemplaire;
        this.langue = langue;
        this.auteur = auteur;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public int getNombreExemplaire() {
        return nombreExemplaire;
    }

    public void setNombreExemplaire(int nombreExemplaire) {
        this.nombreExemplaire = nombreExemplaire;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
}
