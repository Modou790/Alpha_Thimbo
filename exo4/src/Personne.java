import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.format.DateTimeFormatter;
public class Personne {

    private String nom;
    private String prenom;

    private String matricule;
    private int age;
    private Date dateNaissance;

    public Personne() {
    }
    private static int id = 1;

    public Personne(String nom, String prenom,int age, Date dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.dateNaissance = dateNaissance;
        this.matricule = genererMatricule();
    }

    private String genererMatricule() {
        //Srting matricule = this.prenom.substring(0, 1) + this.nom.substring(0, 3) + this.age + this.dateNaissance;
         String matricule = prenom.substring(0, 1).toUpperCase()
                 + nom.substring(0, 1).toUpperCase();
         matricule += String.format("%04d", id++);
         return matricule;
    }

    public int calculerAge() {
        Date dateAct = new Date();
        int age = dateAct.getYear() - dateNaissance.getYear();
        if (dateAct.getMonth() < dateNaissance.getMonth()) {
            age--;
        } else if (dateAct.getMonth() == dateNaissance.getMonth() &&
                dateAct.getDate() < dateNaissance.getDate()) {
                age--;
            }

        return age;
    }


    public Personne(String nom, String prenom, Date dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.matricule = genererMatricule();
        this.age = calculerAge();
    }
    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", matricule='" + matricule + '\'' +
                ", age=" + age +
                ", dateNaissance=" + dateNaissance +
                '}';
    }
}
