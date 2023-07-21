package Exercices2;

import java.util.Scanner;

public class Exercice012_p78 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir le nombre de chapitres");
        int chapters = scanner.nextInt();
        System.out.println("Saisir le nombre de sous-parties");
        int subpart = scanner.nextInt();

        for (int i = 1; i <= chapters; i++) {
            System.out.println("Chapitre " + i);
            for (int j = 1; j <= subpart; j++) {
                System.out.println("Sous-partie " + i + "." + j);
            }
        }
    }
}
