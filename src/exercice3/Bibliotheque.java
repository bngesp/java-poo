package exercice3;

public class Bibliotheque {
    public static void main(String[] args) {
        Livre l1 = new Livre("les etudes au senegal","bassirou ngom",367);
        Livre l2 = new Livre("Programmer en Java");
        l1.afficher();
        l2.afficher();
    }
}
