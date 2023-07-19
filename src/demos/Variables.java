package demos;



public class Variables {
    public static void main(String[] args) {
        // Déclaration d'une variable

        int age;

        long indice;

        float distance;

        double monnaie;

        boolean estVrai;

        char lettre;

        // Chaîne de charactère
        //String n'est pas considéré comme un type primitif
        String prenom;

        //<type> <nom> = <valeur>;
        int jour = 5;

        //Affectation
        age = 25;
        indice = 100_000_000;
        distance = 12.74f;
        monnaie=15.5;
        estVrai = false;
        lettre = 'a';
        prenom = "Félix";

        double resultat = age + monnaie;
        //raccourci sout
        System.out.println(resultat);

        System.out.println(prenom + " a " + age + " ans. ");

        //types énumérés

        enum JourSemaine{
            Lundi, Mardi, Mercredi

        }
        JourSemaine today = JourSemaine.Mardi;

        System.out.println(today);


    }
}
