//bibliotheque


//message pour le premier saisie

import java.util.Scanner;

public class Somme 
{
    public static void main(String [] args)
    {
  //creation d'objet #1 pour le premier saisie
System.out.println("\n");

Scanner win = new Scanner(System.in);

//message pour le premier saisie
        System.out.println("Veuiller taper le premier entier :\n");
   //variable pour stocker l'entier et nextint() pour lire
int A = win.nextInt();

//creation objet #2
 //creation d'objet #1 pour le premier saisie

Scanner wer = new Scanner(System.in);

System.out.println("\n");
//message pour le premier saisie
        System.out.println("Veuiller taper le second entier :\n");
   //variable pour stocker l'entier et nextint() pour lire
int B = wer.nextInt();
System.out.println("\n");
//calcul
int C = A+B;

//affichage
System.out.println("Le resultat est :\n");
System.out.println(C);


//fermeture des objets
win.close();   
   wer.close();
    }
    
}


