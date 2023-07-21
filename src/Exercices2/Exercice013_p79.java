package Exercices2;

//afficher les tables de multiplication de 1 à 10;
public class Exercice013_p79 {
    public static void main(String[] args) {


        for (int i = 1; i <= 10; i++ ) {
            System.out.println("Table de multiplication par " + i);
            for (int j = 1; j <=10; j++) {
                System.out.println(i + " * " + j + " = " + (i*j) );
            }
        }
    }
}
