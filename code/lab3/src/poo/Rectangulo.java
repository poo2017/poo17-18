package poo;

public class Rectangulo {

    //region Atributos
    private Punto inferiorIzquierdo;
    private Punto superiorDerecho;
    //endregion

    //region Constructores
    public Rectangulo() {
        this.inferiorIzquierdo = new Punto(0, 0);
        this.superiorDerecho = new Punto(1, 1);
    }

    public Rectangulo(int base, int altura) {
        this.inferiorIzquierdo = new Punto(0, 0);
        this.superiorDerecho = new Punto(0, 0); //provisional
        if (base > 0 && altura > 0) {
            this.superiorDerecho.setCoordenadaX(base);
            this.superiorDerecho.setCoordenadaY(altura);
        } else {
            this.superiorDerecho.setCoordenadaX(1);
            this.superiorDerecho.setCoordenadaY(1);
        }
    }

    public Rectangulo(Punto p1, Punto p2) {
        if (p1.estaDebajo(p2) && p2.estaDerecha(p1)) {
            this.inferiorIzquierdo = p1;
            this.superiorDerecho = p2;
        } else {
            this.inferiorIzquierdo = new Punto(0, 0);
            this.superiorDerecho = new Punto(1, 1);
        }
    }

    public Rectangulo(Rectangulo r) {
        this.inferiorIzquierdo = r.getInferiorIzquierdo();
        this.superiorDerecho = r.getSuperiorDerecho();
    }
    //endregion

    //region Get&Set
    public Punto getInferiorIzquierdo() {
        return this.inferiorIzquierdo;
    }

    public Punto getSuperiorDerecho() {
        return this.superiorDerecho;
    }

    public void setInferiorIzquierdo(Punto p) {
        if (p.estaDebajo(this.superiorDerecho) && this.superiorDerecho.estaDerecha(p))
            this.inferiorIzquierdo = p;
    }

    public void setSuperiorDerecho(Punto p) {
        if (this.inferiorIzquierdo.estaDebajo(p) && p.estaDerecha(this.inferiorIzquierdo))
            this.superiorDerecho = p;
    }

    //endregion

    //region Métodos
    public String toString() {
        return ("Inferior Izquierdo " + this.inferiorIzquierdo.toString() + " Superior Derecho " +
                this.superiorDerecho.toString());
    }

    public int calculaBase() {
        return (this.superiorDerecho.getCoordenadaX() - this.inferiorIzquierdo.getCoordenadaX());
    }

    public int calculaAltura() {
        return (this.superiorDerecho.getCoordenadaY() - this.inferiorIzquierdo.getCoordenadaY());
    }


    public int calculaArea() {
        return this.calculaBase() * this.calculaAltura();
    }

    public void desplazarX(int desplazamientoX) {
        if (this.inferiorIzquierdo.desplazarXY(desplazamientoX, 0))
            this.superiorDerecho.desplazarXY(desplazamientoX, 0);
    }

    public boolean esIgual(Rectangulo r) {
        return (this.inferiorIzquierdo.esIgual(r.getInferiorIzquierdo()) &&
                this.superiorDerecho.esIgual(r.getSuperiorDerecho()));
    }

}
