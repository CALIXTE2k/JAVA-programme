//bibliotheque
import java.util.Scanner;

public class Exercice9 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        //saisie
        System.out.print("Entrer la note de mathematique :");

        //variable
        int m = sca.nextInt();

    
        //condition
            while(m < 0 || m > 300){
                System.out.print("incorrect veuiller saisir a nouveau :\n");
                m = sca.nextInt();

            }





        System.out.println();


        System.out.print("Entrer la note de physique :");

        //variable
        int p = sca.nextInt();

        //condition
            while(p < 0 || p > 300){
                System.out.print("incorrect veuiller saisir a nouveau :\n");
                p = sca.nextInt();
            }



        System.out.println();

        System.out.print("Entrer la note d'HTML/CSS :");

        //variable
        int h = sca.nextInt();

        //condition
            while(h < 0 || h > 300){
                System.out.print("incorrect veuiller saisir a nouveau :\n");
                h = sca.nextInt();

            }


         System.out.println();

         System.out.print("Entrer la note Base de donne :");

        //variable
        int b = sca.nextInt();

        //condition
            while(b < 0 || b > 100){
                System.out.print("incorrect veuiller saisir a nouveau :\n");
                b = sca.nextInt();

            }


        //traitement
        int somme = m + p + h + b;
        float moy = somme / 10;

        //affichage de la somme
         System.out.println();

        System.out.print("La somme est : "+somme);

        System.out.println();

        //affichage moyenne
        System.out.print("La moyenne de l'etudiant en DUT ESIH est : "+moy);

        //close
        sca.close();


    }
}
