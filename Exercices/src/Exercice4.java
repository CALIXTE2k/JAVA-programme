//bibliotheque
import java.util.Scanner;

public class Exercice4 {
    public static final double pi= 3.14; 
    public static void main(String[] args) {
       
       
        //creation d'objet
        //creation d'objet pour le saisie utilisateur
Scanner scan = new Scanner(System.in);    

//message pour le saisie
System.out.print("Veuiller taper le diametre du cercle :\n");

int Q = scan.nextInt();
int R = Q / 2;


//message d'affichage
System.out.print("Le rayon du cercle est :\n");
System.out.print(R);

System.out.println("\n");

System.out.print("La surface du cercle est :\n");
System.out.print(pi * (R * R));


//close objet
scan.close();

    }
}
