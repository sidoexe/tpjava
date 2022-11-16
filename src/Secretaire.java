
class Secretaire extends Personne {
    private String numeroBureau;
    private static int nbSecretaires = 0;
    public Secretaire(){

    }
    public Secretaire (String nom, String prenom, String rue, String ville,String numeroBureau) {
        super (nom, prenom, rue, ville);
        this.numeroBureau = numeroBureau;
        nbSecretaires = nbSecretaires + 1;
    }
    public String toString () {
        return super.toString() + "\n Numero bureau : " + numeroBureau;
    }
    public void ecrirePersonne() {
        System.out.println ("Secretaire: " + super.toString());
    }
    static int nbSecretaires () { 
        return (nbSecretaires); 
    }
}