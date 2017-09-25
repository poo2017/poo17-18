package poo;

public class Main {

    public static void main(String[] args) {

        Punto puntoUno = new Punto();
        puntoUno.posicion();
        Punto puntoDos = new Punto(3,7);
        puntoDos.posicion();

        System.out.println("\n");

        puntoUno.desplazar(7);
        puntoDos.desplazar(2,4);
        puntoUno.posicion();
        puntoDos.posicion();

        int coordenadaX = puntoUno.coordenadaX();
        System.out.println("\nLa coordenada x del punto uno es: " + coordenadaX);

        System.out.println("\n");

        Punto copia = puntoUno.copia();
        copia.posicion();
        puntoUno.posicion();
    }
}


