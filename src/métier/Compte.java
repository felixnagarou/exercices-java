package métier;

public class Compte {
    //Attributs
    private int code;
    protected float solde;

    //Méthodes
    public Compte(int c, float s) {
        code=c;
        solde=s;
    }
    public void  verser(float mt) {
        solde += mt;
    }
    public void retirer(float mt) {
        solde -= mt;
    }
    public String toString() {
        return("Code = " + code + " Solde = " + solde);
    }
}
