package exercice2;

public class MonEntier {
    private int nombre;

    public MonEntier(int nombre) {
        this.nombre = nombre;
    }

    public MonEntier() { this(0);}

    public void ajouter(MonEntier monEntier){
        this.nombre += monEntier.getNombre();
    }
    public void diminuer(MonEntier monEntier){
        this.nombre -= monEntier.getNombre();
    }
    public void multiplier(MonEntier monEntier){
        this.nombre *= monEntier.getNombre();
    }
    public void divEntier(MonEntier monEntier){
        this.nombre /= monEntier.getNombre();
    }
    public void puissance(MonEntier monEntier){
        this.nombre =(int)Math.pow(this.nombre,monEntier.getNombre());
    }
    public void factoriel(){
        int f = 1;
        for (int i = 1; i <= this.nombre; i++)
            f*=i;
        this.nombre = f;
    }
    public void afficher(){
        System.out.println(this.nombre);
    }


    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }
}
