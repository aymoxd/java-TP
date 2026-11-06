import java.util.Objects;

public class Adress {

    private int numero;
    private String rue;
    private String quartier;
    private String ville;
    private String pays;
    
    public Adress(int numero, String rue, String quartier, String ville, String pays){
        this.numero = numero;
        this.rue = rue;
        this.quartier = quartier;
        this.ville = ville;
        this.pays = pays;
    }

    public  Adress(Adress autre){
        this.numero = autre.numero;
        this.rue = autre.rue;
        this.quartier = autre.quartier;
        this.ville = autre.ville;
        this.pays = autre.pays;
    }

    //getters
    public int getNumero(){
        return numero;
    }
    public String getRue(){
        return rue;
    }
    public String getQuartier() {
        return quartier;
    }
    public String getVille() {
        return ville;
    }
    public String getPays() {
        return pays;
    }

    //setters
    public void setNumero(int numero){
        this.numero = numero;
    }
    public void setRue(String rue) {
        this.rue = rue;
    }
    public void setQuartier(String quartier){
        this.quartier = quartier;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }
    public void setPays(String pays) {
        this.pays = pays;
    }

    @Override 
    public String toString(){
      return "Adresse{" +
            "numero=" + numero +
            ", rue='" + rue + '\'' +
            ", quartier='" + quartier + '\'' +
            ", ville='" + ville + '\'' +
            ", pays='" + pays + '\'' +
            '}';
    }

    public void afficher(){
        System.out.println(this);
    }

    @Override 
    public boolean equals(Object obj){

        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        Adress autre = (Adress) obj;

        return numero == autre.numero
               && Objects.equals(rue, autre.rue)
               && Objects.equals(quartier, autre.quartier)
               && Objects.equals(ville, autre.ville)
               && Objects.equals(pays, autre.pays)
               ;


    }
    

}
