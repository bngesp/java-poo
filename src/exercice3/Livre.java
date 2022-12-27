package exercice3;

public class Livre {
    private String titre;
    private String auteur;
    private int nbrPage;
    private static int nbLivre = 0;
    private int numLivre;


    public void afficher () {
        System.out.println("* le numéro de livre : " + this.numLivre + "\n"+
                "le titre : " + this.titre +"\n"+
                "l'auteur : " + this.auteur +"\n"+
                " le nombre de page : " + this.nbrPage);
    }
    public Livre(String titre, String auteur, int nbrPage) {
        this.titre = titre;
        this.auteur = auteur;
        this.nbrPage = nbrPage;
        Livre.nbLivre++;
        this.numLivre = nbLivre;
    }

    public Livre(String titre) {
        this(titre, "inconnu", 1);
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getNbrPage() {
        return nbrPage;
    }

    public void setNbrPage(int nbrPage) {
        this.nbrPage = nbrPage;
    }

    public static int getNbLivre() {
        return nbLivre;
    }

    public static void setNbLivre(int nbLivre) {
        Livre.nbLivre = nbLivre;
    }

    public int getNumLivre() {
        return numLivre;
    }

    public void setNumLivre(int numLivre) {
        this.numLivre = numLivre;
    }
}
