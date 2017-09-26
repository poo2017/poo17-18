package poo;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Punto puntoUno = new Punto();
        Punto puntoDos = new Punto(2,4);

        System.out.println("Punto 1:");
        puntoUno.ImprimePunto();
        System.out.println("Punto 2:");
        puntoDos.ImprimePunto();

        puntoUno.Trasladar(4,6);
        System.out.println("Punto 1:");
        puntoUno.ImprimePunto();

        puntoDos.Trasladar(6);
        System.out.println("Punto 2:");
        puntoDos.ImprimePunto();

        System.out.println("La x de Punto 1:");
        int coordXdeUno = puntoUno.DameCoordX();
        System.out.println(coordXdeUno);
        //System.out.println(puntoUno.coordenadaX);

        Punto puntoTres = puntoDos.DameCopia();
        System.out.println("Copia de Punto 2:");
        puntoTres.ImprimePunto();



    }
}
