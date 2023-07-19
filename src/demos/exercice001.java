package demos;

import java.util.Scanner;

public class exercice001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String prenom;
        String nom;
        String messagePrenom = "Saisir un prénom";
        String messageNom = "Saisir un nom";

        System.out.println(messagePrenom);
        prenom = scanner.nextLine();

        System.out.println(messageNom);
        nom = scanner.nextLine();

        System.out.println("Bonjour " + prenom + " " + nom.toUpperCase() + ".");
    }
}
