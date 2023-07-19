package Exercices2;

import java.util.Scanner;

public class Exercice003_p70 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] nombres = new int [3];
        int nombreMax = 0;


        for (int i = 0; i <= 2; i++){
            System.out.println("Saisir nombre");
            nombres[i] = scanner.nextInt();
            if (i == 0) {
               nombreMax = nombres[i];
            } else if (nombres[i] > nombreMax) {
                nombreMax = nombres[i];
            }
            System.out.println("Le maximum est : " + nombreMax);

        }




    }
}
