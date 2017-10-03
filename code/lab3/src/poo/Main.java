package poo;

public class Main {

    public static void main(String[] args) {

        //region CLASE CIRCULO
        /*
        Circulo circulo = new Circulo(3);
        circulo.imprimeCirculo();
        Punto punto = new Punto(3,4);
        //circulo.desplazar(punto);
        circulo.desplazar2(punto);
        circulo.imprimeCirculo();
        punto.trasladar(2,4);
        circulo.imprimeCirculo();

        System.out.println("Area: " + circulo.calculaArea());
        System.out.println("Longitud de circunferencia: " +
                circulo.calculaLongitudCircunferencia());

        Circulo circuloGrande = new Circulo(6);
        System.out.println("El mayor es: ");
        circulo.esMayor(circuloGrande).imprimeCirculo();

        circuloGrande.setRadio(12);
        circuloGrande.desplazar2(new Punto(4,2));
        circuloGrande.imprimeCirculo();
        */
        //endregion

        //region ESCANER
        /*
        Escaner escaner = new Escaner();

        String lectura = escaner.leeCadena();
        System.out.println("Introducido: " + lectura);

        int entero = escaner.leeEntero();
        System.out.println("Introducido: " + entero);

        double real = escaner.leeReal();
        System.out.println("Introducido: " + real);
        */
        //endregion

        //region CLASE FRACCION
        Fraccion f = new Fraccion(1, 2);
        Fraccion f2 = new Fraccion(4);
        Fraccion f3 = new Fraccion();
        Fraccion f4;
        //suma de 1/2 + 4/1
        f4 = f.suma(f2);
        f4.mostrar();
        //resta de 1/2 - 4
        f4 = f.resta(f2);
        f4.mostrar();
        // 1/2 * 4
        f4 = f.multiplica(f2);
        f4.mostrar();
        // (1/2) / (4)
        f4 = f.divide(f2);
        f4.mostrar();
        // valor entero de 1/8
        int n = f4.calculaEntero();
        System.out.println(n);
        // valor real de 1/8
        double d = f4.calculaReal();
        System.out.println(d);
        //simplificando 12/48
        Fraccion f5 = new Fraccion(12, 48);
        f5.simplifica();
        f5.mostrar();
        //comprobando protección ante valor del denominador = 0
        Fraccion f6 = new Fraccion(12, 0);
        f6.setNumerador(0);
        f6.setDenominador(2);
        f5.divide(f6).mostrar();
        System.out.println(f4.getNumerador());
        System.out.println(f4.getDenominador());
        Fraccion f7 = new Fraccion(2, 4);
        Fraccion f8 = new Fraccion(f7);
        if (f7.esIrreducible()) {
            System.out.print("La fracción: ");
            f7.mostrar();
            System.out.println("es irreducible");
        } else {
            System.out.print("La fracción: ");
            f7.mostrar();
            System.out.println("es simplificable");
        }
        if (f7.esEquivalente(f8)) {
            System.out.print("La fracción:");
            f7.mostrar();
            System.out.print(" es equivalente a: ");
            f8.mostrar();
        } else {
            System.out.print("La fracción:");
            f7.mostrar();
            System.out.print(" NO es equivalente a: ");
            f8.mostrar();
        }
        if (f5.esEquivalente(f8)) {
            System.out.print("La fracción:");
            f5.mostrar();
            System.out.print(" es equivalente a: ");
            f8.mostrar();
        } else {
            System.out.print("La fracción:");
            f5.mostrar();
            System.out.print(" NO es equivalente a: ");
            f8.mostrar();
        }
        Fraccion f9 = new Fraccion(f8);
        f9.mostrar();
        //endregion
    }
}
