package Exercices2;

import java.util.Scanner;

public class Exercice010_p76 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer un âge :");
        int age = scanner.nextInt();
        System.out.println("Salaire souhaité :");
        int salaire = scanner.nextInt();
        System.out.println("Entrer un nombre d'années d'expérience :");
        int exp = scanner.nextInt();

        if (age > 30) {
            if (salaire < 40000) {
                if ( exp > 5) {
                    System.out.println("Votre profil est élligible au poste.");

                }
                else {
                    System.out.println("Vous manquez d'expérience.");
                }
            }
            else {
                System.out.println("Vous ne pouvez prétendre à ce salaire pour ce poste.");
            }
        }
        else {
            System.out.println("Vous êtes trop jeune");
        }



    }
}
