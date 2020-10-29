package principiantes;

import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {

        pregunta3();
    }

    public static void pregunta1() {
        int numero = 2;
        int suma = 0;

        while (numero <= 100) {

            suma = numero + suma;
            numero = numero + 2;

        }
        System.out.println("La suma es : " + suma);

    }

    public static void pregunta2() {
        int numero = 2;
        int medio = 0;
        int total = 0;
        int contador = 0;

        while (numero <= 100) {
            total = numero + total;
            numero = numero + 2;
            System.out.println(numero);
            contador++;

        }
        medio = total / contador;
        System.out.println("El total" + total);
        System.out.println("La media es: " + medio);
    }

    public static void pregunta3() {

        int numero;
        int total = 0;
        int media;
        int contador = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce un numero:");
        numero = teclado.nextInt();
        while (numero != 0) {
            total = numero + total;
            System.out.println("introduce un numero: ");
            numero = teclado.nextInt();
            contador++;
        }

        while (contador == 0) {
            contador++;
        }
        media = total / contador;
        System.out.println("El total es " + total);
        System.out.println("El la media es: " + media);

    }
}
