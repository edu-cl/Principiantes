/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principiantes;

import java.io.Reader;
import java.util.Scanner;

/**
 *
 * @author matad
 */
public class Facil {

    public static void main(String[] args) {

        /**
         * int n1=0;
         *
         * Scanner teclado=new Scanner(System.in);
         *
         * System.out.println("Introduce un numero "); n1=teclado.nextInt();
         *
         * if(n1%5==0){ System.out.println(n1+" Es multiplo de 5"); }else{
         * System.out.println(n1+" No es multiplo"); }
         *
         */
        nota();

    }

    public static void DosNumeros() {

        int n1 = 0;
        int n2 = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el primer numero");
        n1 = teclado.nextInt();
        System.out.println("Introduce el segundo numero");
        n2 = teclado.nextInt();

        if (n1 > n2) {
            if (n1 % n2 == 0) {
                System.out.println(n1 + " Es multiplo de " + n2);
            } else {
                System.out.println("No es multiplo de " + n2);
            }
        } else if (n2 > n1) {
            if (n2 % n1 == 0) {
                System.out.println(n2 + " Es multiplo de " + n1);
            } else {
                System.out.println("No es multiplo de " + n2);
            }
        }

    }

    public static void letra() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una letra");
        char letra = teclado.next().charAt(0);

        if (letra >= 65 && letra <= 90) {
            System.out.println("Es mayuscula");
        } else if (letra >= 97 && letra <= 122) {
            System.out.println("Es minuscula");

        } else {
            System.out.println("Es otro caracter");
        }
    }

    public static void hora() {
        int segundos = -1;
        int minutos = -1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la hora: ");
        int hora = teclado.nextInt();
        if (hora >= 0 && hora < 24) {
            System.out.println("Introduce los minutos: ");
            minutos = teclado.nextInt();
            if (minutos < 60 && minutos >= 0) {
                System.out.println("Intoduce los segundos: ");
                segundos = teclado.nextInt();
                if (segundos < 60 && segundos >= 0) {
                    System.out.println("La hora es: " + hora + ":" + minutos + ":" + segundos);
                } else {
                    System.out.println("Introduce un segundo valido");
                }
            } else {
                System.out.println("Introduce un minuto valido");
            }
        } else {
            System.out.println("Introduce una hora valida");
        }
    }

    public static void nota() {
        int nota = 0;
        boolean opcion = false;
        Scanner teclado = new Scanner(System.in);
        do {
            try {
                System.out.println("Introduce una nota");
                nota = teclado.nextInt();
                if (nota >= 0 && nota < 11) {
                    if (nota < 4) {
                        System.out.println("Muy deficiente");
                    } else if (nota < 5) {
                        System.out.println("Insuficinte");
                    } else if (nota < 8) {
                        System.out.println("Aprobado");
                    } else if (nota < 9) {
                        System.out.println("Notable");
                    } else if (nota < 11) {
                        System.out.println("Sobresaliente");
                    }
                    opcion = true;
                } else {
                    System.out.println("Intoduce una nota correcta");
                    PulsaEnter();
                }
            } catch (Exception ex) {
                System.out.println("No metas una letra");
                nota();
                opcion=true;
            }
        } while (!opcion);

    }

    public static void PulsaEnter() {
        Scanner teclado = new Scanner(System.in);
        String frase;

        System.out.println("Pulsa Enter para continuar...");
        frase = teclado.nextLine();

    }
}
