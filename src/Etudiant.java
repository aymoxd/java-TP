import java.util.Objects;

public class Etudiant {

    private int cne;
    private String nom;
    private String prenom;
    private Adress adress;
    private static int counter = 0;

    public Etudiant(int cne, String nom, String prenom, Adress adress){
           this.cne = cne;
           this.nom = nom;
           this.prenom = prenom;
           this.adress = adress;
           counter++;
    }
    public Etudiant(Etudiant autre){
           this.cne = autre.cne;
           this.nom = autre.nom;
           this.prenom = autre.prenom;
           this.adress = new Adress(autre.adress);
           counter++;
    }

    public int getCne(){
        return cne;
    }
    public String getNom() {
        return nom;
    }
    public Adress getAdress() {
        return adress;
    }
    public String getPrenom() {
        return prenom;
    }

    public void setCne(int cne){
        this.cne = cne;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setAdress(Adress adress){
        this.adress = adress;
    }
    //counter
    public static int getCounter(){
        return counter;
    }

    @Override 
    public String toString(){
           return "Etudiant{" +
            "cne='" + cne + '\'' +
            ", nom='" + nom + '\'' +
            ", prenom='" + prenom + '\'' +
            ", adresse=" + adress +
            '}';
    }

    public void afficherCoordonnees(){
        System.out.println("CNE : " + cne);
        System.out.println("nom : " + nom);
        System.out.println("prenom : " + prenom);
        System.out.println("adress : " + adress);
    }

    @Override 
    public boolean equals(Object obj){
        if (this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        Etudiant autre = (Etudiant) obj;
        return Objects.equals(this.cne, autre.cne);
    }



}
