package exercices.suiteFibonacci;

import java.util.Scanner;

public class SuiteFibonacci {

     public static void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nombre de termes de la suite de Fibonacci à afficher : ");
        int n = scanner.nextInt();

        System.out.println("Les " + n + " premiers termes de la suite de Fibonacci sont :");

        // Appel de la méthode pour afficher les premiers N termes de la suite de Fibonacci
        afficherSuiteFibonacci(n);

        scanner.close();
    }

    // Méthode à compléter : affiche les premiers N termes de la suite de Fibonacci
    private static void afficherSuiteFibonacci(int n) {
        // Complétez le code ici
        // Utilisez une boucle ou une récursion pour générer les termes de la suite de Fibonacci
        // Affichez chaque terme à mesure qu'il est généré
    }
}
