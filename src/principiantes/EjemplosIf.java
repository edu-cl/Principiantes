package principiantes;

import java.util.Scanner;

public class EjemplosIf {

    public static void main(String[] args) {
        descuento();
    }

    public static void edad() {
        Scanner teclado = new Scanner(System.in);
        int edad = -1;
        //Try-catch para coger el error.
        try {
            System.out.println("Introduce una edad");
            edad = teclado.nextInt();

            if (edad < 0) {
                System.out.println("Error");
            } else if (edad < 18) {
                System.out.println("Menor de Edad");
            } else {
                System.out.println("Mayor de Edad");
            }

        } catch (Exception ex) {
            System.out.println("Introduce un valor correcto");

        }
    }

    public static void numero() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = teclado.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Es par");
        } else {
            numero++;
        }
        System.out.println(numero);
    }

    public static void descuento() {
        float descuento = 0.0f;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cantidad");
        int cantidad = teclado.nextInt();
        float precio = 2500;
        float descontado = 0;
        if (cantidad <= 9) {
            descuento = 0.0f;
        } else if (cantidad <= 99) {
            descuento = 0.1f;
        } else if (cantidad <= 999) {
            descuento = 0.2f;
        } else {
            descuento = 0.3f;
        }
        precio = cantidad * precio;
        descontado = precio * descuento;
        precio = precio - descontado;

        System.out.println("Tiene " + descuento + " de descuento ");
        System.out.println("Se te ha descontado al producto: " + descontado + " €");
        System.out.println("El precio total es " + precio + " €");

    }
    
    
}
