package Exercices2;

import java.util.Scanner;

public class Exercice017_p82 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir nombre notes");

        int nb_notes = scanner.nextInt();
        float [] notes = new float[nb_notes];
        float max;
        float min;

        for (int i = 0; i <= nb_notes; i++ ) {
            System.out.println("Saisir la note numéro " + i+1);
            notes [i] = scanner.nextFloat();
            if (notes [i] <= 20 && notes [i] >= 0) {
                if (i == 0) {
                    max = notes[0];
                    min = notes [0];


                }
            }
            else {
                System.out.println("");
            }

        }


    }
}
