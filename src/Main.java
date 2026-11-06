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

        InfoS5 info = new InfoS5("dev", etudiants);

       // dev.afficherFilier();
       info.afficherTotalEtudiants();
       info.ajouterEtudiant(e3);

       Etudiant resultat = info.chercherEtudiant(29);

       if(resultat != null){
        System.out.println("student found ");
        System.out.println(resultat);
       }else{
        System.out.println("student not found!!!!");
       }



    }
}
