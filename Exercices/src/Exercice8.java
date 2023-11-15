//Bibliotheque
import java.util.Scanner;

public class Exercice8 {
    public static void main(String[] args) {
        //creation d'objet
        Scanner scan = new Scanner(System.in);

        //message de saisie
        System.out.println("Taper le premier nombre :\n");

        //variable
        float A = scan.nextFloat();

        //message de saisie
        System.out.println("Taper le deuxieme nombre :\n");

        //variable
        float B = scan.nextFloat();

        //message de saisie
        System.out.println("Taper le troixieme nombre :\n");

        //variable
        float C = scan.nextFloat();
        System.out.println("\n");

        //calcule de la somme
        float somme = A + B + C;

        System.out.println("La somme de ces 3 nombres est :\n");
        System.out.println(somme);

        //calcul de la moyenne de cette somme
        float moy = somme / 3;


        System.out.println("La moyenne arithmetique de cette somme est :\n");
        System.out.println(moy);

        //calcule de la difference
        float dif = A - B - C;

        System.out.println("La difference de ces 3 nombres est :\n");
        System.out.println(dif);

        //calcul de la moyenne de cette difference
        float moye = dif / 3;

        System.out.println("La moyenne arithmetique de cette difference est :\n");
        System.out.println(moye);

        //close
        scan.close();

    }
}