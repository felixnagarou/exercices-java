package Exercices2;


//Le programme permet de déterminer si un caractère est une voyelle ou une consonne, peut importe l'entrée de l'utillisateur
import java.text.Normalizer;
import java.util.Scanner;

import static java.lang.Character.*;

public class Exercice004_p71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char inputChar;
        //tableau contenant les voyelles
        char [] voyelles = {'a', 'e', 'i', 'o', 'u', 'y'};

        boolean check = false; // boolean qui servira à sauter ou non la ligne précisant si la lettre saisie est une consonne

        System.out.println("Saisir un et un seul caractère :");
        inputChar = scanner.next().charAt(0);


        //Déclaration d'une chaîne de caractère formatée; récupération du caractère sans accent
        String s = String.valueOf(toLowerCase(inputChar));
        s = Normalizer.normalize(s, Normalizer.Form.NFKD);
        //s.replaceAll("^[a-z]", "");
        inputChar = s.charAt(0);

        if (isLetter(inputChar)) {
            for (char voyelle : voyelles) { //parcours du tableau
                if (voyelle == inputChar) {
                    System.out.println("Le caractère saisi est une voyelle");
                    check = true; //il y a correspondance, check est vrai
                    break; //fin de la boucle si il y a correspondance
                }
                else { //continuer le parcours du tableau jusqu'à trouver la voyelle correspondante
                    continue;

                }
            }// sortie de la boucle for; soit le programme est fini, soit il reste à évaluer la cas "consonne"
            if (check == false) { //récupération du booléen check pour ne pas afficher la ligne ci-dessous automatiquement
                System.out.println("Le caractère saisi est une consonne");
            }
        }
        else {
            System.out.println("Le caractère saisi n'est pas une lettre latine");
        }
    }
}
