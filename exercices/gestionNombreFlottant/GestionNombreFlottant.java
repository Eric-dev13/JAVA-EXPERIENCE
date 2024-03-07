package exercices.gestionNombreFlottant;

import java.util.Scanner;

public class GestionNombreFlottant {

    public static void start() {
        // Création d'un objet Scanner pour la saisie utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir un nombre à virgule flottante
        System.out.print("Entrez un nombre à virgule flottante : ");
        double nombre = scanner.nextDouble();

        // Afficher la partie entière du nombre
        int partieEntiere = (int) nombre;
        System.out.println("Partie entière : " + partieEntiere);

        // Afficher l'arrondi à la valeur absolue la plus proche
        long arrondi = Math.round(nombre);
        System.out.println("Arrondi : " + arrondi);

        // Fermer le scanner
        scanner.close();
    }
}
