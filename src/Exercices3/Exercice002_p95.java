package Exercices3;

import java.util.Scanner;

public class Exercice002_p95 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] relative = new int[10];
        int [] absolute = new int[10];

        for (int i = 0; i <= relative.length -1; i++) {
            System.out.println("Saisir nombre numéro " +  (i+1));
            relative[i] = scanner.nextInt();
            if (relative[i] > 0) {
                absolute[i] = relative[i];
            }
            else {
                absolute[i] = 0;
            }

            System.out.println(relative[i] + " " + absolute[i]);

            }





    }
}
