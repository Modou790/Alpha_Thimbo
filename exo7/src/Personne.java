import java.util.Date;

class Personne {
    protected String nom;
    protected Date dateNaissance;
    protected double taille;

    public Personne(String nom, Date dateNaissance, double taille) {
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.taille = taille;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", taille=" + taille +
                '}';
    }

    public String getNom() {
        return null;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }
}
