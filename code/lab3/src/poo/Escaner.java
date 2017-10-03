package poo;

import java.util.Scanner;

public class Escaner {
    Scanner entradaDelTeclado;
    public Escaner(){
        this.entradaDelTeclado = new Scanner(System.in);
    }

    public String leeCadena(){
        System.out.println("Introduzca cadena de texto: ");
        String cadena = this.entradaDelTeclado.nextLine();
        return cadena;
    }

    public int leeEntero(){
        System.out.println("Introduzca número entero: ");
        int entero = this.entradaDelTeclado.nextInt();
        return entero;
    }

    public double leeReal(){
        System.out.println("Introduzca número real: ");
        double real = this.entradaDelTeclado.nextDouble();
        return real;
    }
}

