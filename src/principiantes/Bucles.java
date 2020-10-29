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
public class Bucles {

    public static void main(String[] args) {
        do_impares();
    }

    public static void Pares() {
        int numero = 2;
        int contrador = 0;

        while (contrador < 100) {
            System.out.println(numero);
            numero = numero + 2;
            contrador++;
        }
    }

    public static void impares() {
        int numero = 199;
        int contador = 0;
        while (numero > contador) {
            System.out.println(numero);
            numero = numero - 2;
        }
    }

    public static void suma_pares() {
        int numero = 0;
        int contador = 0;

        int total = 0;
        while (contador < 100) {

            total = numero + total;

            numero = numero + 2;
            contador++;

        }
        System.out.println(total);
    }

    public static void Cuenta_Atras() {

        int numero;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero ");
        numero = teclado.nextInt();

        while (numero >= 0) {
            System.out.println(numero);
            numero--;
        }
    }

    public static void factorial() {
        int numero = 0;
        int total = 1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero");
        numero = teclado.nextInt();
        while (0 < numero) {
            total = numero * total;
            numero--;
        }
        if (numero == 0) {
            total = total * 1;
        }
        System.out.println(total);
    }

    public static void Pedi_numero() {
        int numero = 0;
        int total = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un un numero;");
        numero = teclado.nextInt();
        while (numero % 2 == 0) {
            total = numero + total;
            numero = teclado.nextInt();
        }
        System.out.println("La Suma es :" + total);
    }

    public static void Primo() {
        boolean esPrimo = true;
        int numero;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserte un numero :");
        numero = teclado.nextInt();
        int aux = numero - 1;
        while (aux > 1 && esPrimo) {
            if (numero % aux == 0) {
                esPrimo = false;
            }
            aux--;
        }
        
        if (esPrimo == true) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
        
        
    }
    public static void potencia() {
        double potencia;
        double exponente;        
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce la potencia : ");
        potencia=teclado.nextDouble();
        
        System.out.println("Introduce el exponente: ");
        exponente=teclado.nextDouble();
        
        double cuenta=Math.pow(potencia, exponente);
        
        System.out.println("El resultado de la potencia es :"+cuenta);
    }
    
    public static void do_pares(){
        int numero=0;
        int contador = 0;
        do{
            System.out.println(numero);
            numero+=2;
            contador++;
            
        }while(contador<=100);       
    }
    
    public static void do_impares(){
        int numero=199;
        int contador=0;
        
        do{
            System.out.println(numero);
            numero-=2;
            contador++;
            
        }while(contador<100);
    }

}
