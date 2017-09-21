package poo;

import java.util.Random;

public class sintaxis {

    /*
    MAIN: hola mundo
    public static void main(String[] args) {
    System.out.println("¡Hola, mundo!");
    }
    */

    //MAIN: lanza los diferentes ejercicios
    public static void main(String[] args) {
        // write your code here
        //HolaMundo();
        //ParOImpar();
        //Calendario();
        //OperacionesMatematicas();
        //CircunferenciaYArea();
        //FactorialConBucleFor();
        //FactorialConBucleWhile();
        //FactorialConBucleDoWhile();
        //GeneradorDeFechas();
        //ConvertidorABinario();
        //ConvertidorAHexadecimal();
        //MediaArray();
        ComprobarVersionDeJava();
    }

    //1.- Hola Mundo desde un método
    public static void HolaMundo() {
        System.out.println("¡Hola, mundo!");
    }

    //2.- Bucles e if: par o impar
    public static void ParOImpar() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("El número: " + i + " es par.");
            } else {
                System.out.println("El número: " + i + " es impar.");
            }
        }
    }

    //3.- Calendario
    public static void Calendario() {
        for (int i = 1; i <= 31; i++) {
            switch (i % 7) {
                case 1:
                    System.out.println("El día " + i + " es lunes.");
                    break;
                case 2:
                    System.out.println("El día " + i + " es martes.");
                    break;
                case 3:
                    System.out.println("El día " + i + " es miércoles.");
                    break;
                case 4:
                    System.out.println("El día " + i + " es jueves.");
                    break;
                case 5:
                    System.out.println("El día " + i + " es viernes.");
                    break;
                case 6:
                    System.out.println("El día " + i + " es sábado.");
                    break;
                case 0:
                    System.out.println("El día " + i + " es domingo.");
                    break;
            }
        }
    }

    //Método que devuelve un número aleatorio
    private static int getRandomInt(int limite) {
        Random generadorDeNumerosAleatorios = new Random();
        int numeroAleatorio = generadorDeNumerosAleatorios.nextInt(limite);
        System.out.println("El número aleatorio es: " + numeroAleatorio);
        return numeroAleatorio;
    }

    //4.- Operaciones matemáticas básicas
    public static void OperacionesMatematicas() {

        int numeroAleatorioUno = getRandomInt(100);
        int numeroAleatorioDos = getRandomInt(100);

        int suma = numeroAleatorioUno + numeroAleatorioDos;
        int resta = numeroAleatorioUno - numeroAleatorioDos;
        int multiplicacion = numeroAleatorioUno * numeroAleatorioDos;
        int divisiónSinCambioDeTipo = numeroAleatorioUno / numeroAleatorioDos;
        int resto = numeroAleatorioUno % numeroAleatorioDos;

        double divisionConCambioDeTipo = (double) numeroAleatorioUno / (double) numeroAleatorioDos;

        System.out.println("SUMA: " + numeroAleatorioUno + " + " + numeroAleatorioDos + " = " + suma);
        System.out.println("RESTA: " + numeroAleatorioUno + " - " + numeroAleatorioDos + " = " + resta);
        System.out.println("PRODUCTO: " + numeroAleatorioUno + " * " + numeroAleatorioDos + " = " +
                multiplicacion);
        System.out.println("DIVISIÓN SIN CAMBIO DE TIPO: " + numeroAleatorioUno + " / " +
                numeroAleatorioDos + " = " + divisiónSinCambioDeTipo);
        System.out.println("RESTO DE LA DIVISIÓN SIN CAMBIO DE TIPO: " + numeroAleatorioUno + " % " +
                numeroAleatorioDos + " = " + resto);
        System.out.println("DIVISIÓN CON CAMBIO DE TIPO: " + numeroAleatorioUno + " / " +
                numeroAleatorioDos + " = " + divisionConCambioDeTipo);
    }

    //5.- Longitud de circunferencia y área de un círculo
    public static void CircunferenciaYArea() {
        Random generadorDeNumerosAleatorios = new Random();
        int radioAleatorio = generadorDeNumerosAleatorios.nextInt(100);

        System.out.println("El radio es: " + radioAleatorio);

        double longitudDeCircunferencia = 2 * Math.PI * radioAleatorio;
        double areaDelCirculo = Math.PI * Math.pow(radioAleatorio, 2);

        System.out.println("La longitud de la circunferencia es: " + longitudDeCircunferencia);
        System.out.println("El área del círculo es: " + areaDelCirculo);
    }

    //6.- Factorial con bucle for
    public static void FactorialConBucleFor() {
        int numeroAleatorio = getRandomInt(10);
        int factorial = 1;
        for (int idx = 1; idx <= numeroAleatorio; idx++) {
            factorial = factorial * idx;
        }
        System.out.println("El factorial de " + numeroAleatorio + " es " + factorial);
    }

    //7.- Factorial con bucle while
    public static void FactorialConBucleWhile() {
        int numeroAleatorio = getRandomInt(10);
        int factorial = 1;
        int idx = 1;
        while (idx <= numeroAleatorio) {
            factorial = factorial * idx;
            idx = idx + 1;
        }
        System.out.println("El factorial de " + numeroAleatorio + " es " + factorial);
    }

    //8.- Factorial con bucle do-while
    public static void FactorialConBucleDoWhile() {
        int numeroAleatorio = getRandomInt(10);
        int factorial = 1;
        int idx = 1;
        do {
            factorial = factorial * idx;
            idx = idx + 1;
        } while (idx <= numeroAleatorio);
        System.out.println("El factorial de " + numeroAleatorio + " es " + factorial);
    }

    //9.- Boolean
    public static void GeneradorDeFechas() {
        int dia = getRandomInt(31);
        int mes = getRandomInt(12);
        int year = getRandomInt(3099);

        String fecha = dia + "/" + mes + "/" + year;

        boolean esCorrectaLaFecha = false;
        boolean esCorrectoElDia = false;
        boolean esCorrectoElMes = false;

        boolean esDelFuturoLaFecha = false;

        if (dia == 0) {
            esCorrectoElDia = false;
        } else {
            esCorrectoElDia = true;
        }

        if (mes == 0) {
            esCorrectoElMes = false;
        } else {
            esCorrectoElMes = true;
        }

        boolean esBisiesto = ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)));

        if (mes == 2 && dia > 29) {
            esCorrectoElDia = false;
        } else if (mes == 2 && dia == 29) {
            if (esBisiesto) {
                esCorrectoElDia = true;
            } else {
                esCorrectoElDia = false;
            }
        }

        esCorrectaLaFecha = esCorrectoElDia && esCorrectoElMes;

        if (year > 2017) {
            esDelFuturoLaFecha = true;
        } else if (year < 2017) {
            esDelFuturoLaFecha = false;
        } else if (year == 17) {
            if (mes < 9) {
                esDelFuturoLaFecha = false;
            } else if (mes > 9) {
                esDelFuturoLaFecha = true;
            } else if (mes == 9) {
                if (dia > 19) {
                    esDelFuturoLaFecha = true;
                } else {
                    esDelFuturoLaFecha = false;
                }
            }
        }

        if (esCorrectaLaFecha) {
            System.out.println("La fecha generada es: " + fecha);
            if (esDelFuturoLaFecha) {
                System.out.println("que resulta que es del futuro");
            } else {
                System.out.println("que resulta que es del pasado");
            }
        } else {
            System.out.println("La fecha generada es: " + fecha);
            System.out.println("que resulta que es inválida");
        }

    }

    //10.- Conversión de decimal a binario
    public static void ConvertidorABinario() {
        int numeroAleatorio = getRandomInt(64);
        String valorBinario = "";

        int resultado = numeroAleatorio;
        int resto;
        while (resultado > 0) {
            resto = resultado % 2;
            valorBinario = valorBinario + resto;
            resultado = resultado / 2;
        }
        valorBinario = new StringBuilder(valorBinario).reverse().toString();

        System.out.println("La representacion en binario de " + numeroAleatorio + " es " + valorBinario);
    }

    //11.- Conversión de decimal a hexadecimal
    public static void ConvertidorAHexadecimal() {
        int numeroAleatorio = getRandomInt(64);
        String valorHexadecimal = "";

        int resultado = numeroAleatorio;
        int resto;
        while (resultado > 0) {
            resto = resultado % 16;
            if (resto == 10) {
                valorHexadecimal = valorHexadecimal + 'A';
            } else if (resto == 11) {
                valorHexadecimal = valorHexadecimal + 'B';
            } else if (resto == 12) {
                valorHexadecimal = valorHexadecimal + 'C';
            } else if (resto == 13) {
                valorHexadecimal = valorHexadecimal + 'D';
            } else if (resto == 14) {
                valorHexadecimal = valorHexadecimal + 'E';
            } else if (resto == 15) {
                valorHexadecimal = valorHexadecimal + 'F';
            } else {
                valorHexadecimal = valorHexadecimal + resto;
            }
            resultado = resultado / 16;
        }
        valorHexadecimal = new StringBuilder(valorHexadecimal).reverse().toString();

        System.out.println("La representación en hexadecimal de " + numeroAleatorio + " es " + valorHexadecimal);
    }

    //12.- Comprobar versión de Java
    public static void ComprobarVersionDeJava() {
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path"));
    }

    public static void MediaArray(){
        int[] valores = new int[4];
        for (int idx = 0; idx < valores.length; idx++){
            valores[idx] = getRandomInt(100);
        }

        int sumaDeValores = 0;
        for (int idx = 0; idx < valores.length; idx++){
            sumaDeValores = sumaDeValores + valores[idx];
        }

        double media = (double)sumaDeValores / valores.length;
        System.out.println("La media de los valores del array es: " + media);
    }
}


