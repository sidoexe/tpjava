
class PPPersonne {
    public static void main(String[] args) {
        Secretaire Sec = new Secretaire("Seba","Zohra","rue des rosiers", "Alger", "A326");
        Enseignant Ens = new Enseignant ("Fridi","Boualem","rue des mimosas", "Alger", "Mathematique");
        Etudiant Etu = new Etudiant ("Smati","Ryad","rue des lilas", "Alger", "Informatique");
        Sec.ecrirePersonne();
        Ens.ecrirePersonne();
        Etu.ecrirePersonne();
        Personne.nbPersonnes();
        System.out.println ("\nAprès modification :\n");
        Sec.modifierPersonne ("rue des orangers ", "Blida");
        Ens.modifierPersonne ("rue des narguerites", "Kouba");
    }
}