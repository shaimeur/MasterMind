package com.shaimeur;

import java.util.*;

public class MasterMind {

    private static final char OK = '#';
    private static final char FAUX = 'O';

    public static void main(String[] args) {

        Scanner  scanner = new Scanner(System.in);

        int taille = 4;
        int max = 6;
        int maxRound = 10 ;
        int[] solution = new int[taille];
        
        Random random = new Random();

        for (int i = 0; i <taille ; i++) {
            solution[i] = random.nextInt(max+1);
        }

        int count = 0 ;

        System.out.println("Le codeBraker doit trouver la combinaison" + taille + "  chiffres entre 1 et " + max + '.');
        System.out.println(OK + "signifie que c'est le bon chiffre à la bonne place et " + FAUX + " signifie que cest le mauvais chiffre " );
        System.out.println("Attention vous avez droit a " + maxRound + " essais");
        System.out.println("------------------------------------------------------------------------------------------------------------");

        int[] chiffres = new int[taille];
        boolean victory = false;

        do {
            System.out.println("\nEssai n°" + (count + 1) + "/" + maxRound + " :"  );
            int nombreSaisi = scanner.nextInt();
                // scan guesses
            for (int i = 0; i < taille; i++) {
                chiffres[i] = (int) (nombreSaisi / (Math.pow(10,taille -1))) % 10;
            }
            //player guess
            for (int i = 0; i <taille ; i++) {
                System.out.println( chiffres[i]+ " ");
                System.out.println(); // retour à la ligne
            }

            victory = true ;
            for (int i = 0; i <taille ; i++) {
                boolean jackpot = chiffres[i] == solution[i];
                System.out.println((jackpot ? OK : FAUX) + " ");
                victory = victory && jackpot;
            }
            System.out.println();
            count++;
            if (count == maxRound){
                System.out.println("vous avez épuiser vos " + maxRound + " essai ,vous avez perdu !! :(");
            }



        }while (!victory && count < maxRound);{
            System.out.println("En seulement " + count + " coups");
            scanner.close();
        }

    }

}
