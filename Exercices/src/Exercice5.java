import java.util.Scanner;


public class Exercice5 {
public static void main(String[] args) {
        //creation d'objet #1 pour le saisie utilisateur
        Scanner scan = new Scanner(System.in);
        //message pour le saisie
        System.out.println("Taper le premier nombre :\n");
    
        //variable et next.int()
        int Q = scan.nextInt();
    
    
        //creation d'objet #1 pour le saisie utilisateur
        Scanner bal = new Scanner(System.in);
        //message pour le saisie
        System.out.println("Taper le deuxieme nombre :\n");
    
        //variable et next.int()
        int W = bal.nextInt();

        System.out.println("\n");
        
        //calcul
        double R = Q + W;
        double T = 3 * R;
        double I = 1/T;


        //nextline() pour chaine de caractere

        //affichage
        System.out.println("La somme de ces deux nombres est :\n");
        System.out.println(R);

        System.out.println("\n");
        System.out.println("Le triple de cette somme est :\n");
        System.out.println(T);

        System.out.println("\n");
        System.out.println("L'inverse du triple de cette somme est :\n");
        System.out.println(I);


        //close
        scan.close();
        bal.close();

}    
}
