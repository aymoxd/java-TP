import java.util.ArrayList;

public class InfoS5 {
    private String nomFiliere;
    private ArrayList<Etudiant> listeEtudiants;

    public InfoS5(String nomFilier, ArrayList<Etudiant> listeEtudiants ){
            this.nomFiliere = nomFilier;
            this.listeEtudiants = new ArrayList<>(listeEtudiants);
    }
    
}
