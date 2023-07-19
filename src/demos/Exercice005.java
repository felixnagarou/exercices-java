package demos;

import java.util.Scanner;

import static java.lang.Math.round;


//exercice 5 p.55 : volume d'un cône
public class Exercice005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rayon;
        double hauteur;
        double volume;

        String messageR = "Saisir un rayon";
        String messageH = "Saisir une hauteur";
        String messageV = "Le volume du cône est de : ";

        System.out.println(messageR);
        rayon = scanner.nextDouble();

        System.out.println(messageH);
        hauteur = scanner.nextDouble();

        volume = (double) 1 /3 * Math.PI * Math.pow(rayon, 2) * hauteur;

        System.out.println(messageV + " " + round(volume));





    }
}
