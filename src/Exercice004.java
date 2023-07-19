import java.util.Scanner;

public class Exercice004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = "Saisir un âge : ";
        int age1;
        boolean verification;

        System.out.println(message);
        age1 = scanner.nextInt();

        verification = age1 >= 18;
        System.out.println(verification);
    }

