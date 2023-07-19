package demos;

import java.util.Scanner;
//Exercice p.53
public class Exercice003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int squareSum;
        String message = "Saisir a";
        String message2 = "Saisir b";
        String message3 = "La somme des carrés de a et b est: ";

        System.out.println(message);
        a = scanner.nextInt();

        System.out.println(message2);
        b = scanner.nextInt();

        squareSum = a*a + b*b;
        System.out.println(message3 + " " + squareSum);

    }
}
