package poo;

public class Circulo {

    //region ATRIBUTOS

    /*Atributos de la clase. Nótese que uno de ellos es una referencia
    a un objeto de la clase Punto (composición)
    OJO, LA CLASE PUNTO DEBE ESTAR PROGRAMADA Y COMPILADA EN EL MISMO
    PROYECTO Y CARPETA QUE LA CLASE CÍRCULO */

    private int radio;
    private Punto centro;

    //endregion

    //region CONSTRUCTORES

     //Constructor por defecto
    public Circulo() {
        this.radio = 1;
        this.centro = new Punto();
    }

    public Circulo(int radio) {
        this.radio = radio;
        this.centro = new Punto();
    }

    /* LOS CONSTRUCTORES QUE APARECEN A CONTINUACIÓN COMPILAN, PERO NO SON ADECUADOS
    PORQUE SI SE MODIFICA EL PUNTO P, SE MODIFICA TAMBIÉN EL CÍRCULO, Y ESO NO ES CONVENIENTE.
    CADA OBJETO DEBE TENER SU AUTONOMÍA. */

    /*  POR ESO LOS ANULAMOS:
    public Circulo (Punto c, int r){
    radio= r;
    centro = c;
    }

    public Circulo (Punto c){
    radio=1;
    centro = c;
    }
    */

    /* PARA RESOLVER EL PROBLEMA, USAMOS EL MÉTODO COPIA QUE OFRECE EL PUNTO */

     //Constructor con dos argumentos
    public Circulo(Punto centro, int radio) {
        this.radio = radio;
        this.centro = centro.dameCopia();
    }

    //Constructor con un argumento. Al otro se le asigna un valor arbitrario (radio unidad)
    public Circulo(Punto centro) {
        this.radio = 1;
        this.centro = centro.dameCopia();
    }

    //endregion

    //region GET&SET

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return this.radio;
    }

    public Punto getCentro() {
        return this.centro;
    }

    //endregion

    //region MÉTODOS

    //CON DESPLAZAR PASA LO MISMO. SI DESPUÉS DE USAR “DESPLAZAR”
    // SE TOCA EL PUNTO P, SE MOVERÁ EL CÍRCULO. POR ESO ES MUCHO
    // MÁS ADECUADO EL DESPLAZAR2, QUE TRABAJA CON UNA COPIA DE P,
    // ELIMINANDO EL PROBLEMA. SE MANTIENEN LOS DOS MÉTODOS PARA
    // QUE SE PUEDA PROBAR Y OBSERVAR LAS DIFERENCIAS
    //Método que desplaza el círculo, moviendo su centro hasta el punto p
    public void desplazar(Punto destino) {
        this.centro = destino;
    }

     //Método mejorado que desplaza el círculo,
     // moviendo su centro hasta el punto p
    public void desplazar2(Punto destino) {
        this.centro = destino.dameCopia();
    }

    public double calculaArea() {
        return Math.PI * this.radio * this.radio;
    }

    public double calculaLongitudCircunferencia() {
        return Math.PI * 2 * this.radio;
    }

    //Método que devuelve una copia del círculo. El código comentado
    //equivale al programado, aunque es menos eficiente
    public Circulo copia() {
        return new Circulo(centro, radio);

        //Circulo c = new Circulo (centro, radio);
        //return c;
    }

    //Método que devuelve el círculo mayor (mayor radio) entre estos
    // dos: el propio círculo (argumento implícito) y un círculo
    // que se pasa como argumento
    public Circulo esMayor(Circulo circulo) {
        if (this.radio >= circulo.getRadio()) return this;
        else return circulo;
    }

    public void imprimeCirculo(){
        System.out.println("El círculo tiene un radio de " + this.getRadio());
        System.out.println("El círculo tiene el centro en " + this.getCentro().getCoordenadaX() + ", " +
        this.getCentro().getCoordenadaY());
    }

    //endregion

}
