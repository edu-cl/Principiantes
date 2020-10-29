/*+
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
public class RepasoBucles {

    public static void main(String[] args) {
        Edades();
    }

    public static void Bucle() {
        char letra = 'a';
        while (letra <= 122) {
            System.out.println("El caracter " + (int) letra + " es :" + letra);
            letra++;
        }
    }

    public static void multiplicar() {
        int numero = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Intoduce un numero");
        numero = teclado.nextInt();

        int tabla = 1;
        System.out.println("Tabla del" + numero);
        while (tabla <= 10) {

            System.out.println(tabla + " x " + numero + "=" + tabla * numero);
            tabla++;

        }
    }

    public static void multiplicarv2() {
        int numero = 0;
        int tabla = 1;
        boolean Funcion = false;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Intrduce un numero");
        numero = teclado.nextInt();
        do {

            if (numero < 10 && numero > 1) {
                System.out.println(tabla + " x " + numero + "=" + tabla * numero);
                tabla++;
                if (tabla > 10) {
                    Funcion = true;
                }
            } else {
                System.out.println("Error Introduce un valor correcto");
                System.out.println("Intrduce un numero");
                numero = teclado.nextInt();
            }
        } while (!Funcion);
    }

    public static void multiplicartodo() {
        int numero = 1;
        Scanner teclado = new Scanner(System.in);
        int tabla = 1;
        System.out.println("Tabla del" + numero);
        while (numero <= 10) {

            System.out.println(tabla + " x " + numero + "=" + tabla * numero);
            tabla++;
            if (tabla >= 10) {
                numero++;
                tabla = 1;
                System.out.println("Tabla del " + numero);
            }
        }
    }

    public static void Edades() {
        int edad=-1;
        int total = 0;
        int contador=1;
        Scanner teclado = new Scanner(System.in);
        while (contador<3) {             
                total+=edad;
                System.out.println("Introduce a edad");
                edad = teclado.nextInt();
                contador++;
            while (edad<0) {              
             System.out.println("Introduce de nuevo la edad correcta");
            edad=teclado.nextInt();
            }

            

        }            
        System.out.println("La suma de la edades es : "+total);
        System.out.println("El promedio de la edad es :" +total/contador);
    }

}
