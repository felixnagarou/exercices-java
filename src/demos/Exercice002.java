package demos;

import java.util.Scanner;

//Exercice "permuter deux variables" p.52
public class Exercice002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;
        String message = "Saisir a";
        String message2 = "Saisir b";

        System.out.println(message);
        c = scanner.nextInt();

        System.out.println(message2);
        b = scanner.nextInt();

        a = b;
        b = c;

        System.out.println("a = " + a + " et " + "b = " + b);





    }
}
