package exercices.devineLeNombre;

import java.util.Scanner;

public class DevineLeNombre
{
    public static void start() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Bienvenue dans le jeu Devine le Nombre !");

        int tentative = 0;
        System.out.println("Combien de tentatives pensez-vous avoir besoin pour trouver le nombre secret ?");
        int tentativeMax = scan.nextInt();

      
        // Générer un nombre aléatoire entre 0 et 100
        long nombreMystere = Math.round(Math.random() *100);

        System.out.println("J'ai choisi un nombre entre 1 et 100 (inclus).");
        
        while(true) {
            tentative++;

            System.out.print("Devinez le nombre : ");
            long proposition = scan.nextLong();

            if (proposition == nombreMystere) {
                System.out.println("Félicitation vous avez trouvé la réponse au bout de la " + tentative + " iéme tentative.");
                break;
            } else if (proposition < nombreMystere) {
                System.out.println("Plus grand");
            } else {
                System.out.println("Plus petit");
            }

            if(tentative == tentativeMax) {
                System.out.println("Dommage ! Vous avez atteint le nombre maximal de tentatives. Le nombre mystère était : " + nombreMystere);
                break;
            }
        }
    }
}