package Exercices2;

import java.util.Scanner;

public class Exercice007_p73 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir une année :");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("L'année saisie est bissextile.");
        }
        else {
            System.out.println("L'année saisie n'est pas bissextile.");
        }
    }
}
