//bibliotheque
import java.util.Scanner;


public class Exercice11 {
public static void main(String[] args) {
 
    //creation d'objet
    Scanner scan = new Scanner(System.in);

    //message de saisie
    System.out.println("Veuiller entrer la force electromotrice : ");

    //variable pour le stockage 
    int e = scan.nextInt();

    //message de saisie
    System.out.println("Veuiller entrer la resistance : ");

    //variable pour le stockage 
    int r = scan.nextInt();

    //message de saisie
    System.out.println("Veuiller entrer l'intensite : ");

    //variable pour le stockage 
    int i = scan.nextInt();

    //operations
    int u = r * i ; 
    int p = (e - u)*i;


    //message de saisie
    System.out.println("La tension est : \n");
    System.out.println(u);

    System.out.println(" La puissance du generateur est :\n");
    System.out.println(p);

//close objet
scan.close();

}
}
