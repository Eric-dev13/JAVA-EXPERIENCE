package exercices.nombrePremier;

import java.util.Scanner;

public class NombrePremier {

    public static void start() {
        // Création d'un objet Scanner pour la saisie utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir un nombre
        System.out.print("Entrez un nombre entier positif supérieur à 1 : ");
        int nombre = scanner.nextInt();

        // Vérifier si le nombre est premier
        if (estNombrePremier(nombre)) {
            System.out.println(nombre + " est un nombre premier.");
        } else {
            System.out.println(nombre + " n'est pas un nombre premier.");
        }

        // Fermer le scanner
        scanner.close();

        System.out.println("Round 5.5: " + Math.round(5.5));
    }

    // Méthode pour vérifier si un nombre est premier
    private static boolean estNombrePremier(int n) {
        if (n <= 1) {
            return false; // Les nombres inférieurs ou égaux à 1 ne sont pas premiers
        }

        // Vérifier s'il existe un diviseur entre 2 et la racine carrée du nombre
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Le nombre a un diviseur autre que 1 et lui-même
            }
        }

        return true; // Le nombre est premier
    }
}
