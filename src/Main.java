import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       
        Adress adr1 = new Adress(425, "nakhile", "NC times", "paris", "france");
        Adress adr2 = new Adress(756, "klo", "sidi momen", "casablanca", "morocco");
        Etudiant e1 = new Etudiant(1,"folane", "3ellane", adr1);
        Etudiant e2 = new Etudiant(2,"parker", "peter", adr2);
        Etudiant e3 = new Etudiant(3,"white", "walter", adr2);

        ArrayList<Etudiant> etudiants = new ArrayList<>();
        etudiants.add(e1);
        etudiants.add(e2);

        InfoS5 dev = new InfoS5("dev", etudiants);

       // dev.afficherFilier();
       dev.afficherTotalEtudiants();
       dev.ajouterEtudiant(e3);



    }
}
