package poo;

public class Punto {

    //regio Atributos
    private int coordenadaX;
    private int coordenadaY;
    //endregion

    //region Constructores
    public Punto() {
        this.setCoordenadaX(0);
        this.setCoordenadaY(0);
    }

    public Punto(int coordX, int coordY) {
        this.setCoordenadaX(coordX);
        this.setCoordenadaY(coordY);
    }
    //endregion

    //region Get&Set

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    //endregion

    //region Métodos
    public void imprimePunto() {
        System.out.println(getCoordenadaX());
        System.out.println(getCoordenadaY());
    }

    public void trasladar(int desplX, int desplY) {
        setCoordenadaX(getCoordenadaX() + desplX);
        setCoordenadaY(getCoordenadaY() + desplY);
    }

    public void trasladar(int desplX) {
        setCoordenadaX(getCoordenadaX() + desplX);
    }

    public Punto dameCopia() {
        Punto copia = new Punto(getCoordenadaX(), getCoordenadaY());
        return copia;
    }

    public boolean esIgual(Punto punto) {
        return (this.getCoordenadaX() == punto.getCoordenadaX() &&
                this.getCoordenadaY() == punto.getCoordenadaY());
    }

    public boolean estaDebajo(Punto punto) {
        return (this.getCoordenadaY() < punto.getCoordenadaY());
    }

    public boolean estaDerecha(Punto punto) {
        return (this.getCoordenadaX() > punto.getCoordenadaX());
    }

    public boolean desplazarXY(int desplazamientoX, int desplazamientoY) {
        if (desplazamientoX >= 0 && desplazamientoY >= 0) {
            this.setCoordenadaX(this.getCoordenadaX() + desplazamientoX);
            this.setCoordenadaY(this.getCoordenadaY() + desplazamientoY);
            return true;
        } else {
            return false;
        }
    }

    //endregion

}
