package exercice1;

public class TestPoint {
    public static void main(String[] args) {
        Point p = new Point('m', 3, 4);
        p.afficher();
        System.out.println("Distance de p par rapport à l'origine : "+ p.distance(new Point('O', 0, 0)));

        p.deplacer(1, 2);

        p.afficher();
        System.out.println("Distance de p par rapport à l'origine : "+ p.distance(new Point('O', 0, 0)));

    }
}
