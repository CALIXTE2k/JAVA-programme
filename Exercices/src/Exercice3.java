//bibliotheque
import java.util.Scanner;



public class Exercice3 {
    public static void main(String[] args) {
    //creation d'objet #1 pour le saisie utilisateur
    Scanner scan = new Scanner(System.in);
    //message pour le saisie
    System.out.print("Taper le premier nombre :\n");

    //variable et next.int()
    int Q = scan.nextInt();


    //creation d'objet #1 pour le saisie utilisateur
    Scanner bal = new Scanner(System.in);
    //message pour le saisie
    System.out.print("Taper le deuxieme nombre :\n");

    //variable et next.int()
    int W = bal.nextInt();


    //affichage des differents calcul
    System.out.print("La somme est :\n");
    System.out.print(Q + W);

    System.out.print("\n");

    System.out.print("Le produit est :\n");
    System.out.print(Q * W);

    System.out.print("\n");

    System.out.print("La difference est :\n");
    System.out.print(Q - W);

    System.out.print("\n");

    System.out.print("Le modulo est :\n");
    System.out.print(Q % W);

    System.out.print("\n");

    System.out.print("Le quotient est :\n");
    System.out.print(Q / W);

    System.out.print("\n");


//close objets
scan.close();
bal.close();
    }

}
