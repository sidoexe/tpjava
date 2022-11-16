
public class Enseignant extends Personne {
    private String specialite;
    private static int nbEnseignants = 0;
    public Enseignant(){

    }
    public Enseignant (String nom, String prenom, String rue, String ville,String specialite) {
        super (nom, prenom, rue, ville);
        this.specialite = specialite;
        nbEnseignants = nbEnseignants + 1;
    }
    public String toString () {
        return (super.toString() + "Specialite: "+specialite);
    }
    public void ecrirePersonne () {
    System.out.println("Eenseignant: " + super.toString());
    }
    public static int nbEnseignants (){ 
        return(nbEnseignants);
    }
}


