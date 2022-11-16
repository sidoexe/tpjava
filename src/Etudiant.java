
public class Etudiant extends Personne {
    private String diplomeEnCours;
    private static int nbEtudiants = 0; 
    public Etudiant(){

    }
    public Etudiant (String nom, String prenom, String rue, String ville,String diplomeEnCours) {
        super(nom, prenom, rue, ville);
        this.diplomeEnCours = diplomeEnCours;
        nbEtudiants = nbEtudiants + 1;
    }
    public String toString () {
        return super.toString() + "Diplome en cours: "+ diplomeEnCours;
    }
    public void ecrirePersonne () {
        System.out.println ("Etudiant: " + super.toString());
    }
    public String diplomeEnCours () {
        return(diplomeEnCours);
    }
    public static int nbEtudiants (){ 
        return(nbEtudiants);
    }
}
