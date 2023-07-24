package Exercices2;

import static java.lang.Math.pow;

public class Exercice014_p80 {
    public static void main(String[] args) {
        int startPop = 96809;
        int pop = 96809;
        int year = 2015;
        int yearCount = 0;
        double rate = 0.89;



        while (pop < 120000) {
            pop = (int) (startPop * pow(1 + rate/100, yearCount));
            yearCount++;


        }
        int endYear = year + yearCount;
        System.out.println("La population de Tourcoing dépassera les 120000 habitants en "
                + endYear + " pour environ " + pop + " habitants" );



    }
}
