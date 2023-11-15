import java.util.Scanner;



public class Exercice10 {
    public static final double r = 0.055,r2 = 0.055;

    public static void main(String[] args) {
    Scanner sca = new Scanner(System.in);

    //saisie nom produit
    System.out.print("Taper le nom du premier produit :");
    String n = sca.nextLine();

    System.out.println();


    //saisie prix unitaire
    System.out.print("Entrer le prix unitaire :");
    int p = sca.nextInt();

    //condition
    while (p < 0) {
        System.out.print("Saisie incorrect, essayer encore :\n");
         p = sca.nextInt();
    }

    System.out.println();


    //saisie quantite produit

    System.out.print("Entrer la quantite :");
    int q = sca.nextInt();

    //condition
    while (q < 0) {
        System.out.print("Saisie incorrect, essayer encore :\n");
         q = sca.nextInt();
    }


    //traitement
    int montant = p * q;
    double mr = r * montant;

    //affichage premier montant
    System.out.print("Le montant du premier achat est: "+montant);
    System.out.println();
    System.out.print("Le montant apres rabais du premier achat est: "+mr);



    System.out.println("\n");
    //pour le second produit
    Scanner sca2 = new Scanner(System.in);
        //saisie nom produit
    System.out.print("Taper le nom du second produit :");
    String nom = sca2.nextLine();

    System.out.println();


    //saisie prix unitaire
    System.out.print("Entrer le prix unitaire :");
    int p2 = sca2.nextInt();

    //condition
    while (p2 < 0) {
        System.out.print("Saisie incorrect, essayer encore :\n");
         p2 = sca2.nextInt();
    }

    System.out.println();


    //saisie quantite produit

    System.out.print("Entrer la quantite :");
    int q2 = sca2.nextInt();

    //condition
    while (q2 < 0) {
        System.out.print("Saisie incorrect, essayer encore :\n");
         q2 = sca2.nextInt();
    }


    //traitement
    int montant2 = p2 * q2;
    double mr2 = r2 * montant2;

    //affichage premier montant
    System.out.print("Le montant du premier achat est: "+montant2);
    System.out.println();
    System.out.print("Le montant apres rabais du premier achat est: "+mr2);


    System.out.println("\n");



    //traitement
    double mt = mr + mr2;

    //montant total
    System.out.print("Le montant total apres rabais de l'achat est : "+mt);

    //close
    sca.close();

    }
}
