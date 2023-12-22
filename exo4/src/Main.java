import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Donneer le nom : ");
        String nom = scanner.nextLine();
        System.out.println(" Donneer le prenom : ");
        String prenom = scanner.nextLine();
        System.out.println(" Donner la date de naissance : (format : yyyy)");
        String date = scanner.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
        Date dateNaissance = null;
        try {
            dateNaissance = dateFormat.parse(date);
        } catch (ParseException e) {
            System.out.println("Format de date invalide. Le programme se termine.");
        }
        Personne p = new Personne(nom, prenom, dateNaissance);
        System.out.println(p);

    }
}