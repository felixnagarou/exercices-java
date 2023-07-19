package Exercices2;

import java.util.Scanner;

public class Exercice004_p71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char inputChar;
        char [] voyelles = {'a', 'e', 'i', 'o', 'u', 'y'};
        char [] consonnes = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'v',
        'w', 'x', 'z'};

        System.out.println("Saisir un et un seul caractère :");
        inputChar = scanner.next().charAt(0);

        for(char voyelle : voyelles) {

                if (Character.toLowerCase(inputChar) == voyelle) {
                    System.out.println("Le caractère saisi est une voyelle");
                    break;
                } else  {
                    for (char consonne : consonnes) {
                        if (Character.toLowerCase(inputChar) == consonne) {
                            System.out.println("Le caractère saisi est une consonne");
                            break;
                        }
                        else System.out.println("Erreur");
                        break;

                    }
                }
        }//fin de la boucle voyelles
    }
}
