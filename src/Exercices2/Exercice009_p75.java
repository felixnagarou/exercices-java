package Exercices2;

import java.util.Scanner;

//Exercice état de l'eau
public class Exercice009_p75 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir une température en Celsius :");
        double state = scanner.nextDouble();


        if (state < 0.) {
            System.out.println("SOLIDE");

        } else if (state < 100 && state > 0) {
            System.out.println("LIQUIDE");

        }
        else
            System.out.println("GAZEUX");


    }
}
