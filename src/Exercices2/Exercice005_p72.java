package Exercices2;

import java.util.Scanner;

//saisir un jour de la semaine
public class Exercice005_p72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputDay;
        String [] jours = {"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"};
        System.out.println("Saisir le chiffre correspondant au jour de la semaine entre 1 et 7 :");
        inputDay = scanner.nextInt();

        if (inputDay >= 1 && inputDay <= 7) {
            System.out.println(jours[inputDay -1]);
        }
        else {
            System.out.println("Erreur. Veuillez entrer un chiffre compris entre 1 et 7.");
        }
    }
}
