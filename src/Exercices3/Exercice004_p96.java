package Exercices3;

import java.util.Scanner;

public class Exercice004_p96 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Taille tableau ?");
        int userSetTab = scanner.nextInt();
        int [] tableau = new int[userSetTab];
        int nombreMax = 0;

        for (int i = 0; i <= tableau.length; i++ ) {
            System.out.println("Entrer le nombre numéro " + (i+1));
            tableau[i] = scanner.nextInt();
            if (i == 0) {
                nombreMax = tableau[0];

            } else {
                if (tableau[i] > nombreMax) {
                    nombreMax = tableau[i];
                    System.out.println("Le maximum est " + nombreMax);
                }
            }

        }
    }
}
