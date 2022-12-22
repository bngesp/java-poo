package exercice4;

public class TestPile {
    public static void main(String[] args) {
        int e[] = {5,-1,9,33};
        Pile p = new Pile(e);
        System.out.println(p.getSommet());
        //p.depiler();
        p.lister();
    }
}
