//bibliotheque
import java.util.Scanner;




public class Produit {

	public static void main (String [] args){
		//creation d'objets scanner pour lire l'entrer de l'utilisateur depuis la console

		//#1
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\n");
		//saisie utilisateur
		System.out.println("Veuiller taper le premier entier : ");
		
		//affectation (nextInt() pour lire un entiers
		int A = scan.nextInt();
		System.out.println("\n");
		
		//objet #2
		Scanner sca = new Scanner(System.in);
		
		System.out.println("Veuiller taper le second entier : ");
		
		
		//affectation (nextInt() pour lire un entiers
		int B = sca.nextInt();
		System.out.println("\n");
		
		//ou 
		int C = A * B;
		//affichage de l'entier
		System.out.println("Le produit est : ");
		System.out.println(C);
		
		//fermeture du scanner
		scan.close();
		sca.close();
	}
}
