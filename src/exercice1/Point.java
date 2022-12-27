package exercice1;

public class Point {
    private char nom;
    private float x;
    private float y;

    public Point(char nom, float x, float y) {
        this.nom = nom;
        this.x = x;
        this.y = y;
    }

    public void deplacer(float x, float y){
        this.setX(this.getX()+x);
        this.setY(this.getY()+y);
    }

    public void afficher(){
        System.out.println(nom+"("+x+","+y+")");
    }

    public double distance(Point p){
        return  Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2));
    }

    public char getNom() {
        return nom;
    }

    public void setNom(char nom) {
        this.nom = nom;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
}
