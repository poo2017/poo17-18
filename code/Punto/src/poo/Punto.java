package poo;

//Clase Punto
public class Punto {
    //Atributos de la clase
    private int x, y;

    //Constructor por defecto
    public Punto() {
        x = 0;
        y = 0;
    }

    //Constructor con dos argumentos
    public Punto(int coordenadaX, int coordenadaY) {
        x = coordenadaX;
        y = coordenadaY;
    }

    //Método que desplaza un punto, modificando los atributos
    public void desplazar(int desplazamientoX, int desplazamientoY) {
        x += desplazamientoX;  //x = x+desplazamientoX;
        y += desplazamientoY;  //y = y+desplazamientoY;
    }

    //Método que desplaza un punto, modificando uno de sus atributos
    public void desplazar(int desplazamientoX) {
        x += desplazamientoX;  //x = x+desplazamientoX;
    }

    /*
    * Método que imprime por pantalla la posición del punto.
    * Nótese que no tiene argumentos, trabaja con el propio punto, el argumento implícito.
    */
    public void posicion() {
        System.out.println("El valor de la coordenada x es: " + x + "\nEl valor de la coordenada y es: " + y);
    }

    //Método que devuelve la coordenada X del punto.
    public int coordenadaX() {
        return x;
    }

    /*
    * Método que devuelve una copia del punto.
    * El código comentado es equivalente al programado
    */
    public Punto copia() {

        Punto c = new Punto(x, y);
        return c;
        //return new Punto (x,y);
    }
}
