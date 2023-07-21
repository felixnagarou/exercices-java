package Exercices2;

import java.util.Scanner;
import java.util.regex.Matcher;

public class Exercice006_p73 {
    public static void main(String[] args) {

//saisir un jour de la semaine
                Scanner scanner = new Scanner(System.in);
                int inputMonth;
                String choice;
                System.out.println("Entrez le numéro du mois");
                inputMonth = scanner.nextInt();

                switch (inputMonth) {

                    case 1, 3, 5, 7, 8, 10, 12 :
                        System.out.println("31 jours");
                        break;
                    case 4, 6, 9, 11 :
                        System.out.println("30 jours");
                        break;
                    case 2 : //cas particulier pour février
                        System.out.println("Année bissextile ? o/n");
                        switch (choice = String.valueOf(scanner.next().charAt(0))) {
                            case "o" :
                                System.out.println("29 jours");
                            case "n" :
                                System.out.println("28 jours");

                        }
                    default:
                        System.out.println("Erreur");
                }




    }
}


