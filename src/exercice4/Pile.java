package exercice4;

import java.util.Arrays;

public class Pile {
    private int[] element;
    private int sommet;

    public Pile(int[] element) {
        this.element = element;
        this.sommet = element[0];
    }

    public void empiler(int e){
        this.element = Arrays.copyOf(this.element, e);
        this.sommet = e;
    }

    public int depiler(){
        int [] newElement= new int[this.element.length-1];
        int e = this.element[0];
        for (int i = 1; i < this.element.length  ; i++) {
            newElement[i] = this.element[i];
        }
        this.setElement(newElement);
        return e;
    }

    public void lister(){
//        for (int i = 0; i < this.element.length; i++) {
//            System.out.println(i);
//        }
        Arrays.stream(this.element).forEach(System.out::println);
    }

    public void vider(){
        this.element = new int[this.element.length-1];
    }

    public boolean isPilevide(){
        int nombreDeZero = 0;
        for (int i = 0; i < this.element.length; i++) {
            if(this.element[i] == 0) nombreDeZero++;
        }
        return  nombreDeZero == this.element.length;
    }

    public int[] getElement() {
        return element;
    }

    public Pile setElement(int[] element) {
        this.element = element;
        return this;
    }

    public int getSommet() {
        return sommet;
    }

    public Pile setSommet(int sommet) {
        this.sommet = sommet;
        return this;
    }
}
