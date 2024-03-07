package exercices.calculSommeMoyenne;

import java.util.Scanner;

public class CalculSommeMoyenne {

    public static void start() {
        // Création d'un objet Scanner pour la saisie utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur le nombre de valeurs à saisir
        System.out.print("Entrez le nombre de valeurs : ");
        int nombreDeValeurs = scanner.nextInt();

        // Déclarer un tableau pour stocker les valeurs
        double[] valeurs = new double[nombreDeValeurs];

        // Saisir les valeurs depuis l'utilisateur
        for (int i = 0; i < nombreDeValeurs; i++) {
            System.out.print("Entrez la valeur " + (i + 1) + " : ");
            valeurs[i] = scanner.nextDouble();
        }

        // Calculer la somme des valeurs
        double somme = 0;
        for (double valeur : valeurs) {
            somme += valeur;
        }

        // Calculer la moyenne
        double moyenne = somme / nombreDeValeurs;

        // Afficher la somme et la moyenne
        System.out.println("La somme des valeurs est : " + somme);
        System.out.println("La moyenne des valeurs est : " + moyenne);

        // Fermer le scanner
        scanner.close();
    }
}
