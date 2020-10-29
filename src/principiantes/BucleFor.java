/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principiantes;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author matad
 */
public class BucleFor {

    public static void main(String[] args) {
        juego2();

    }

    public static void juego() {
        int numeroAleatorio = (int) Math.floor(Math.random() * 10 + 1);
        boolean bandera = false;
        int numero = 0;
        Scanner teclado = new Scanner(System.in);
        do {

            //ystem.out.println("El numero aleatorio" + numeroAleatorio);
            System.out.println("Bienvenido al juego de acertar un numero "
                    + "aleatorio, Usted tendra tres intentos para acertar, "
                    + "con una pista en el segundo intento, Buena Suerte.");
            System.out.println("------------------------------------------");
            PulsaEnter();
            System.out.println("Introduce un numero:");
            numero = teclado.nextInt();

            if (numero == numeroAleatorio) {
                System.out.println("Has conseguido 100 Puntos el numero era " + numeroAleatorio);
                bandera = true;
            } else {
                if (numeroAleatorio < 5) {
                    System.out.println("El numero es del 1 al 5");
                } else {
                    System.out.println("El numero es del 6 al 10");
                }
                System.out.println("Elige otra numero");
                numero = teclado.nextInt();
                if (numero == numeroAleatorio) {
                    System.out.println("Has conseguido 50 Puntos el numero era " + numeroAleatorio);
                    bandera = true;
                } else {
                    System.out.println("Elige otra numero");
                    numero = teclado.nextInt();
                    if (numero == numeroAleatorio) {
                        System.out.println("Has conseguido 25 Puntos el numero era " + numeroAleatorio);
                        bandera = true;
                    } else {
                        System.out.println("GAME OVER");
                        bandera = true;
                    }

                }

            }

        } while (!bandera);

    }

    public static void juego1() {
        int numeroAleatorio = (int) Math.floor(Math.random() * 10 + 1);
        int contador = 0;
        Scanner teclado = new Scanner(System.in);
        boolean aux = false;

        while (contador < 3 && !aux) {

            System.out.println("Introduce un numero:");
            int numero = teclado.nextInt();
            switch (contador) {
                case 0:
                    if (numero == numeroAleatorio) {
                        System.out.println("Usted ha acertado ha ganado 100 puntos");
                        aux = true;
                    } else {
                        System.out.println("No ha acertado");
                    }
                    break;
                case 1:
                    if (numero == numeroAleatorio) {
                        System.out.println("Usted ha acertado ha ganado 50 puntos");
                        aux = true;
                    } else {
                        System.out.println("No ha acertado");
                    }
                    break;
                case 2:
                    if (numero == numeroAleatorio) {
                        System.out.println("Usted ha acertado ha ganado 25 puntos");
                        aux = true;
                    } else {
                        System.out.println("No ha acertado");
                    }
                    break;
            }
            contador++;
        }
        if (!aux) {
            System.out.println("Usted a perdido el juego");
        }
    }

    public static void juego2() {
        int numeroAleatorio = (int) Math.floor(Math.random() * 10 + 1);
        int contador = 0;
        Scanner teclado = new Scanner(System.in);
        boolean aux = false;

        while (contador < 3 && !aux) {
            System.out.println("Introduce un numero:");
            int numero = teclado.nextInt();
            if (contador == 0 && numero == numeroAleatorio) {
                System.out.println("Usted ha ganado 100 puntos");
                aux = true;
            } else if (contador == 1 && numero == numeroAleatorio) {
                System.out.println("Usted ha ganado 50 puntos");
                aux = true;
            } else if (contador == 2 && numero == numeroAleatorio) {
                System.out.println("Usted ha ganado 25 puntos");
                aux = true;
            }
            contador++;
        }
        if (!aux) {
            System.out.println("Usted a perdido el juego");
        }
    }

    public static void pares() {
        int numero = 0;

        for (int i = 0; i < 100; i++) {
            System.out.println(numero);
            numero += 2;
        }

    }

    public static void impares() {

        int numero = 199;
        for (int i = 99; i > 0; i--) {
            System.out.println(numero);
            numero -= 2;
        }
    }

    public static void suma() {
        int total = 0;
        int numero = 0;

        for (int i = 0; i < 100; i++) {
            numero += 2;
            total += numero;
        }
        System.out.println(total);
    }

    public static void atras() {
        int numero;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero");
        numero = teclado.nextInt();

        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void factorial() {
        int numero = 0;
        int factorial = 1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el factorial de un numero");
        numero = teclado.nextInt();
        for (int i = numero; i > 0; i--) {
            factorial *= i;
        }
        System.out.println(factorial);
    }

    public static void PulsaEnter() {
        Scanner teclado = new Scanner(System.in);
        String enter;
        System.out.println("Pulsa Enter para continuar....");
        enter = teclado.nextLine();

    }
}
