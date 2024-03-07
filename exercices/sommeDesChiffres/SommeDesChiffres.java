package exercices.sommeDesChiffres;

import java.util.Scanner;

public class SommeDesChiffres {
    public static void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre entier positif : ");
        int nombre = scanner.nextInt();

        int somme = calculerSommeChiffres(nombre);

        System.out.println("La somme des chiffres de " + nombre + " est : " + somme);

        scanner.close();
    }

    // Méthode pour calculer la somme des chiffres d'un nombre
    private static int calculerSommeChiffres(int n) {
        int somme = 0;

        while (n > 0) {
            somme += n % 10;  // Ajoute le dernier chiffre à la somme
            n /= 10;         // Supprime le dernier chiffre du nombre
        }

        return somme;
    }
}
