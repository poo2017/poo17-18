package poo;

public class Fraccion {

    //region Atributos
    private int numerador, denominador;
    //endregion

    //region Constructores
    public Fraccion() {
        this.numerador = this.denominador = 1;
    }

    public Fraccion(int numerador) {
        this.numerador = numerador;
        this.denominador = 1;
    }

    public Fraccion(int numerador, int denominador) {
        if (denominador != 0) {
            this.numerador = numerador;
            this.denominador = denominador;
        } else {
            this.numerador = this.denominador = 1;
            System.out.println("El denominador debe ser distinto de 0");
        }
    }

    public Fraccion(Fraccion fraccion) {
        this.numerador = fraccion.getNumerador();
        this.denominador = fraccion.getDenominador();
    }

    //endregion

    //region GET&SET
    public int getDenominador() {
        return denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int num) {
        numerador = num;
    }

    public void setDenominador(int den) {
        if (den != 0) {
            denominador = den;
        } else {
            System.out.println("El denominador debe ser distinto de cero");
        }
    }

    //endregion

    //region MÉTODOS
    public Fraccion suma(Fraccion fraccion) {
        int numerador = this.getNumerador() * fraccion.getDenominador() +
                this.getDenominador() * fraccion.getNumerador();
        int denominador = this.getDenominador() * fraccion.getDenominador();
        Fraccion resultado = new Fraccion(numerador, denominador);
        return resultado;
    }

    public Fraccion resta(Fraccion fraccion) {
        int numerador = (this.getNumerador() * fraccion.getDenominador()) -
                (this.getDenominador() * fraccion.getNumerador());
        int denominador = this.getDenominador() * fraccion.getDenominador();
        Fraccion resultado = new Fraccion(numerador, denominador);
        return resultado;
    }

    public Fraccion multiplica(Fraccion fraccion) {
        int numerador = this.getNumerador() * fraccion.getNumerador();
        int denominador = this.getDenominador() * fraccion.getDenominador();
        Fraccion resultado = new Fraccion(numerador, denominador);
        return resultado;
    }

    public Fraccion divide(Fraccion fraccion) {
        int numerador = this.getNumerador() * fraccion.getDenominador();
        int denominador = this.getDenominador() * fraccion.getNumerador();
        Fraccion resultado = new Fraccion(numerador, denominador);
        return resultado;
    }

    public void mostrar() {
        System.out.println(this.getNumerador() + "/" + this.getDenominador());
    }

    public int calculaEntero() {
        int resultado = this.getNumerador() / this.getDenominador();
        return resultado;
    }

    public double calculaReal() {
        double resultado = (double) this.getNumerador() / (double) this.getDenominador();
        return resultado;
    }

    public boolean esEquivalente(Fraccion fraccion) {
        return (this.numerador * fraccion.getDenominador() ==
                this.denominador * fraccion.getNumerador());
    }

    public void simplifica() {
        int mcd = this.mcd(this.getNumerador(), this.getDenominador());
        this.setNumerador(this.getNumerador() / mcd);
        this.setDenominador(this.getDenominador() / mcd);
    }

    public boolean esIrreducible() {
        if (this.mcd(this.getNumerador(), this.getDenominador()) == 1) {
            return true;
        } else {
            return false;
        }
    }

    /*método privado, lo pueden usar los métodos públicos que lo necesiten,
    pero es inaccesible desde fuera de la clase */
    private int mcd(int a, int b) {
        int resultado;
        if (b == 0) {
            resultado = a;
        } else {
            resultado = mcd(b, a % b);
        }
        return resultado;
    }
}