/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principiantes;

import java.util.Scanner;

/**
 *
 * @author matad
 */
public class EjerciciosBublePDF {

    public static void main(String[] args) {
        ejercicio1();
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
        int n1;
        int n2;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el primer numero");
        n1 = teclado.nextInt();

        System.out.println("introduce el segundo numero;");
    }

}
