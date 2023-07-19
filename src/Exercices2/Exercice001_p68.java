package Exercices2;
//Exercice 1 page 68 du diapo
import java.util.Scanner;

public class Exercice001_p68 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age;

        System.out.println("Saisir un age");
        age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Vous êtes majeur, vous pouvez entrer dans le club");
        }
        else {
            System.out.println("Vous êtes mineur, l'accès vous est refusé.");
        }

    }
}