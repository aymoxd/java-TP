
public class Main {
    public static void main(String[] args) {
       
        Adress a = new Adress(324,"mohammed2","bostan","el jadida" , "morocco");
        Etudiant aymane = new Etudiant("k112345678","aymane","elaroui",a);
        Etudiant rachid = new Etudiant("78","rachid","elaroui",a);
        Etudiant hanmid = new Etudiant("98","hanid","elaroui",a);
        Etudiant hanmisd = new Etudiant("98","hanid","elaroui",a);
        Etudiant handfmid = new Etudiant("98","hanid","elaroui",a);


         // System.out.println(aymane.getPrenom());
        // aymane.getAdress().setVille("Rabat");
       // System.out.println(aymane.getAdress());

      //  aymane.afficherCoordonnees();

        System.out.println(aymane.getCounter());


    }
}
