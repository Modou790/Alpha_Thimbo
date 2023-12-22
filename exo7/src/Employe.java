
import java.util.Date;

class Employe extends Personne {
    private static int nombreEmployes = 0;
    private double salaire;
    private final String poste;

    public Employe(String nom, Date dateNaissance, double taille, double salaire, String poste) {
        super(nom, dateNaissance, taille);
        this.salaire = salaire;
        this.poste = poste;
        nombreEmployes++;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "nom='" + nom + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", taille=" + taille +
                ", salaire=" + salaire +
                ", poste='" + poste + '\'' +
                '}';
    }

    public static int getNombreEmployes() {
        return nombreEmployes;
    }
}
