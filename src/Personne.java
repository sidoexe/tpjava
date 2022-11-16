abstract class Personne {
    protected String nom, prenom, rue, ville;
    protected static int nbPersonnes = 0;
    public Personne(){

    }
    public Personne(String nom,String prenom,String rue,String ville){
        this.nom = nom;
        this.prenom = prenom;
        this.rue = rue;
        this.ville = ville;
        nbPersonnes = nbPersonnes + 1;
    }
    public String toString(){
       return(this.nom+" "+this.prenom+" "+this.rue+" "+this.ville);
    }
    public abstract void ecrirePersonne();
    public static void nbPersonnes(){
        System.out.println("Nb employee: "+nbPersonnes+"Nb secretaire "+Secretaire.nbSecretaires()+"Nb enseignants: " + Enseignant.nbEnseignants() +"Nb etudiants: " + Etudiant.nbEtudiants());
    }
    public void modifierPersonne (String rue, String ville) {
        this.rue = rue;
        this.ville = ville;
        ecrirePersonne();
    }
}
