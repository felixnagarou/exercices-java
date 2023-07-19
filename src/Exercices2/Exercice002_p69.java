package Exercices2;

import java.util.Scanner;

public class Exercice002_p69 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nombre;

        System.out.println("Entrer un nombre : ");
        nombre = scanner.nextInt();

        if (nombre % 2 == 0) {
            System.out.println("Le nombre saisi est pair");
        }
        else {
            System.out.println("Le nombre saisi est impair");
        }
    }
}
