package Exercices2;


import java.util.Scanner;

import static java.lang.Character.*;

public class Exercice008_p74 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un caractère");
        char inputChar = scanner.next().charAt(0);

        if (isLetter(inputChar)) {
            System.out.println("Le caractère saisi est une lettre.");
        } else if (isDigit(inputChar)) {
            System.out.println("Le caractère saisi est un chiffre");
            
        }
        else {
            System.out.println("Le caractère saisi est un caractère spécial");
        }
    }
}
