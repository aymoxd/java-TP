import java.util.ArrayList;

public class InfoS5 {
    private String nomFiliere;
    private ArrayList<Etudiant> listeEtudiants;

    public InfoS5(String nomFilier, ArrayList<Etudiant> listeEtudiants ){
            this.nomFiliere = nomFilier;
            this.listeEtudiants = new ArrayList<>(listeEtudiants);
    }
    public InfoS5(InfoS5 autre){
        this.nomFiliere = autre.nomFiliere;
        this.listeEtudiants = new ArrayList<>(autre.listeEtudiants);
    }

    public String getNomFiliere() {
        return nomFiliere;
    }
    public ArrayList<Etudiant> getListeEtudiants() {
        return listeEtudiants;
    }

    public void setNomFiliere(String nomFiliere) {
        this.nomFiliere = nomFiliere;
    }
    public void setListeEtudiants(ArrayList<Etudiant> listeEtudiants) {
        this.listeEtudiants = new ArrayList<>(listeEtudiants);
    }

    public void afficherFilier(){
        System.out.println("Filier :" + nomFiliere);
    }

    public void afficherList(){
        for (Etudiant e : listeEtudiants){
            System.out.println(e);
        }
    }

    public void afficherTotalEtudiants() {
        System.out.println("total students : " + listeEtudiants.size());
    }

    public void ajouterEtudiant(Etudiant e) {
         listeEtudiants.add(e);
    }

    public Etudiant chercherEtudiant(int cne) {
           for(Etudiant e : listeEtudiants){
            if(e.getCne() == cne) return e;
           }
           return null;
    }
    

}
