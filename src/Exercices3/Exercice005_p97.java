package Exercices3;

import java.util.Scanner;

public class Exercice005_p97 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Taille du premier tableau ?");
        int userSetTab1 = scanner.nextInt();
        System.out.println("Taille du second tableau ?");
        int userSetTab2 = scanner.nextInt();

        int [] tableau1 = new int[userSetTab1];
        int [] tableau2 = new int[userSetTab2];

        if (userSetTab1 == userSetTab2) {
            for (int i = 0; i <= tableau1.length; i++) {
                System.out.println("Entrée tableau 1 numéro  " + (i+1) );
                tableau1[i] = scanner.nextInt();
                System.out.println("Entrée tableau 2 numéro  " + (i+1) );
                tableau2[i] = scanner.nextInt();
                if (tableau1[i] != tableau2[i]) {
                    System.out.println("Les tableaux ne sont pas égaux");
                    break;

                }
                else {
                    continue;
                }
            }
            System.out.println("Les tableaux sont égaux");

        }
        else {
            System.out.println("La taille des tableaux n'est pas équivalente");
        }




    }
}
