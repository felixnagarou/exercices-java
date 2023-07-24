package Exercices3;

public class Exercice001_p94 {
    public static void main(String[] args) {
        int[] tableau = new int [100];

        for (int i = 0; i <= tableau.length -1; i += 10 ) {

            //System.out.print(", " + tableau[i]);
            for (int j = 0; j <=  tableau.length/10; j++) {
                tableau[j] =  i + j;
                System.out.print(tableau[j] + ", ");


            }
            System.out.println(" \n");


        }
    }
}
