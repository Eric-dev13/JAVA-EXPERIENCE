import java.util.Scanner;

public class Application {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Choisir un jeu");

       
        while (true) {
            System.out.println("N°1 :calculSommeMoyenne");
            System.out.println("N°2 :devineLeNombre");
            System.out.println("N°3 :GestionNombreFlottant");
            System.out.println("N°3 :nombrePremier");
            System.out.println("N°4 :sommeDesChiffres");
            System.out.println("N°5 :suiteFibonacci");

            int  jeu = scan.nextInt();

            switch (jeu) {
                case 1:
                    exercices.calculSommeMoyenne.CalculSommeMoyenne.start();
                    break;
            
                case 2:
                    exercices.devineLeNombre.DevineLeNombre.start();
                    break;

                case 3:
                    exercices.gestionNombreFlottant.GestionNombreFlottant.start();
                    break;

                case 4:
                    exercices.nombrePremier.NombrePremier.start();
                    break;

                case 5:
                    exercices.sommeDesChiffres.SommeDesChiffres.start();
                    break;

                case 6:
                    exercices.suiteFibonacci.SuiteFibonacci.start();
                    break;

                default:
                    break;
            }

            System.out.println("Voulez-vous continuer : Oui ou non ?");
            String go = scan.next();
            if ("non".equalsIgnoreCase(go)) {
                break;
            }
        }
    }
}
