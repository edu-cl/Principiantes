/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principiantes;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author matad
 */
public class EjerciciosBublePDF {

    public static void main(String[] args) {
        ejercicio4();
    }

    public static void ejercicio1() {
        final int contador = 100;
        int numero = -1;
        Scanner teclado = new Scanner(System.in);
        int total = 1;
        do {
            try {
                System.out.println("Introducce un numero positivo");
                numero = teclado.nextInt();
            } catch (Exception e) {
                System.out.println("ERROR, HAS INTRODUCIDO UNA LETRA");
                teclado.nextLine();
            }
        } while (numero < 0);
        for (int i = 1; i <= contador; i++) {
            total += numero;
            numero++;
        }
        System.out.println("El total es:" + total);
    }

    public static void ejercicio2() {
        Scanner teclado = new Scanner(System.in);
        int numero1 = -1;
        int numero2 = -1;
        boolean valid = false;

        do {
            try {
                System.out.print("Introduzca número 1: ");
                numero1 = teclado.nextInt();
                System.out.print("Introduzca número 2: ");
                numero2 = teclado.nextInt();

                if (numero1 != numero2) {
                    valid = true;
                    if (numero1 > numero2) {

                        int aux = numero1;
                        numero1 = numero2;
                        numero2 = aux;

                    }
                } else {
                    valid = false;
                }
            } catch (Exception e) {
                valid = false;
                System.out.println("Dato introducido erroneo,Introduzca de nuevo: ");
                teclado.nextLine();
            }
            if (valid) {
                for (int n = numero1; n <= numero2;) {
                    n = n + 7;
                    System.out.println(n);
                }
            } else {
                System.out.println("Rango inválido");
            }
        } while (!valid);
    }

    public static void ejercicio3() {
        Scanner teclado = new Scanner(System.in);
        int numeroIntroducido = -1;
        int nNumeros = 0;
        int mayorPares = -1;
        int nImpares = 0;
        int sumaImpares = 0;
        System.out.print("Inserta el primer número: ");
        numeroIntroducido = teclado.nextInt();
        while (numeroIntroducido > 0) {
            nNumeros++;
            if (numeroIntroducido % 2 == 0) {
                if (numeroIntroducido > mayorPares) {
                    mayorPares = numeroIntroducido;
                }
            } else {
                nImpares++;
                sumaImpares += numeroIntroducido;
            }
            System.out.print("Inserta otro número: ");
            numeroIntroducido = teclado.nextInt();
        }
        System.out.println("Has introducido " + nNumeros + " numeros");
        if (nNumeros > 0) {
            if (nImpares > 0) {
                double mediaImpares = sumaImpares / nImpares;
                System.out.println("La media de los impares es: " + mediaImpares);
            }
            if (mayorPares > -1) {
                System.out.println("El mayor de los pares es: " + mayorPares);
            }
        }

    }

    public static void ejercicio4() {
        System.out.print("Números primos entre 2 y 100: ");

        boolean esPrimo = true;

        for (int n = 2; n <= 100; n++) {

            esPrimo = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    esPrimo = false;
                }
            }

            if (esPrimo) {
                System.out.print(n + " ");
            }

        }

    }

    public static void ejercicio5() {
        Scanner teclado = new Scanner(System.in);
        final int limite = 10000;
        int numero = 0;
        int suma = 0;
        int media;
        int contador = 0;

        do {
            try {
                System.out.println("Introduce un numero");
                numero = teclado.nextInt();
                suma += numero;
                contador++;

            } catch (Exception e) {
                System.out.println("Error.");
                teclado.nextLine();
            }

        } while (suma < limite);

        System.out.println("La suma de todo es: " + suma);
        System.out.println("la media es: " + suma / contador);
        System.out.println("La cantidad de numneros introducidos es: " + contador);
    }

    public static void ejercicio6() {
    }

    public static void ejercicio7() {
        int numero = 0;
        int resto = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero para darle la vuelta");
        numero = teclado.nextInt();

        while (numero > 0) {
            resto = (resto * 10) + (numero % 10);
            numero = numero / 10;
        }
        System.out.println(resto);

    }

    public static void ejercicio8() {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int contador = 0;
        int total = 0;
        System.out.println("Mutliplos de tres hasta un numero: ");
        numero = teclado.nextInt();

        for (int i = 1; i < numero; i++) {
            if (i % 3 == 0) {
                System.out.println(+i + " Es multiplo de 3");
                total += i;
                contador++;
            }
        }
        System.out.println("Un total de : " + contador + " numeros multiplos de 3");
        System.out.println("El total de los numeros es: " + total);
    }

    public static void ejercicio9() {

    }

}
