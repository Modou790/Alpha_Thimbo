import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

class Main {

    //https://waytolearnx.com/2020/04/exercice-java-corrige-sur-les-collections-arraylist-partie-1.html
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employe> employes = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            System.out.println("Donner les informations pour l'employé " + (i + 1) + ":");
            String nom = demanderInfo("Nom", scanner);
            Date dateNaissance = demanderDate(scanner);
            double taille = demanderDouble("Taille", scanner);
            double salaire = demanderDouble("Salaire", scanner);
            String poste = demanderInfo("Poste", scanner);

            Employe employe = new Employe(nom, dateNaissance, taille, salaire, poste);
            employes.add(employe);
        }

        System.out.println("\nEmployés non triés :");
        for (Employe employe : employes) {
            System.out.println(employe);
        }

        employes.sort(Comparator.comparing(Employe::getNom));
        System.out.println("\nEmployés triés par nom :");
        for (Employe employe : employes) {
            System.out.println(employe);
        }
    }

    private static String demanderInfo(String message, Scanner scanner) {
        System.out.print(message + ": ");
        return scanner.nextLine();
    }

    private static Date demanderDate(Scanner scanner) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            System.out.print("Date de naissance (format yyyy-MM-dd)" + ": ");
            return dateFormat.parse(scanner.nextLine());
        } catch (ParseException e) {
            System.out.println("Format de date invalide. Utilisation de la date actuelle.");
            return new Date();
        }
    }

    private static double demanderDouble(String message, Scanner scanner) {
        System.out.print(message + ": ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Veuillez entrer un nombre valide.");
            System.out.print(message + ": ");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}
