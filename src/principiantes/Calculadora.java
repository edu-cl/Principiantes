package principiantes;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int opcion;
        double num1, num2;
        double resultado = 0.0;
        boolean valido = true;

        System.out.println("1- Sumar");
        System.out.println("2- Restar");
        System.out.println("3- Mutiplicar");
        System.out.println("4- Dividir");
        System.out.println("Introduce la opcion del menu");
        opcion = teclado.nextInt();

        System.out.println("Introduce el primer numero");
        num1 = teclado.nextDouble();
        System.out.println("Introduce el Segundo numero");
        num2 = teclado.nextDouble();

        switch (opcion) {

            case 1:
                resultado = num1 + num2;
                break;

            case 2:
                resultado = num1 - num2;
                break;

            case 3:
                resultado = num1 * num2;
                break;

            case 4:
                if (num2 == 0) {
                    valido = false;
                } else {
                    resultado = num1 / num2;
                }
                break;

        }
        if (valido) {
            System.out.println("La operacion es " + resultado);
        } else {
            System.out.println("Error");
        }
    }

}
