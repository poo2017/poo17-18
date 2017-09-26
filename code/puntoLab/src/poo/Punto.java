package poo;

public class Punto {

    //Atributos
    private int coordenadaX;
    private int coordenadaY;

    //Constructores
    public Punto(){
        coordenadaX = 0;
        coordenadaY = 0;
    }

    public Punto(int coordX, int coordY){
        coordenadaX = coordX;
        coordenadaY = coordY;
    }

    //Métodos
    public void ImprimePunto(){
        System.out.println(coordenadaX);
        System.out.println(coordenadaY);
    }

    public void Trasladar(int desplX, int desplY){
        coordenadaX = coordenadaX + desplX;
        coordenadaY = coordenadaY + desplY;
    }

    public void Trasladar(int desplX){
        coordenadaX = coordenadaX + desplX;
    }

    public int DameCoordX(){
        return coordenadaX;
    }

    public Punto DameCopia(){
        Punto copia = new Punto(coordenadaX, coordenadaY);
        return copia;
    }

}
