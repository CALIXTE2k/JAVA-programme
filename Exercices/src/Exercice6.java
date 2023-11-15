//bibliotheque
import java.util.Scanner;



public class Exercice6 {
    public static void main(String[] args) {
         //creation d'objet #1 pour le saisie utilisateur
         Scanner scan = new Scanner(System.in);
         //message pour le saisie
         System.out.print("Taper le premier nombre :\n");
     
         //variable et next.int()
         int Q = scan.nextInt();
     
        System.out.print("\n");
         //creation d'objet #1 pour le saisie utilisateur
         Scanner bal = new Scanner(System.in);
         //message pour le saisie
         System.out.print("Taper le deuxieme nombre :\n");
     
         //variable et next.int()
         int W = bal.nextInt();

        System.out.print("\n");
         //permutation
         int E = Q, R = W, temp;

         temp = E;
         E = R;
         R = temp;


         //affichage saisie
         System.out.print("Sans permutation on a :\n");
         System.out.print("E = "+Q);
         System.out.print("\n");
         System.out.print("R = "+W);

         //Affichage apres permutation
         System.out.print("Apres permutation on a :\n");
         System.out.print("E = "+E);
         System.out.print("\n");
         System.out.print("R = "+R);

         //close
         scan.close();
         bal.close();

    }
}
