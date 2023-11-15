//bibliotheque
import java.util.Scanner;


public class Exercice2 {
public static void main(String[] args) {

//creation d'objet pour le saisie utilisateur
Scanner scan = new Scanner(System.in);    

//message pour le saisie
System.out.println("Taper un nombre :\n");
System.out.println("\n");
//variable pour le stockage et next.int() pour la lecture

int Q = scan.nextInt();

//message d'affichage
System.out.println("Le carre de ce nombre est :\n");
System.out.println(Math.pow(Q, 2));

System.out.println("\n");

System.out.println("Le cube de ce nombre est :\n");
System.out.println(Math.pow(Q, 3));


//close objet
scan.close();
}
}


