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
public class Principiantes {

    public static void main(String[] args) {
        int total;
        logo();
        System.out.println("Bienvenido al juego para mejorar inteligencia");
        Menu();
    }

    public static void logo() {
        System.out.println(" __  .__   __. .___________. _______  __       _______   _______  __  .__   __. ");
        System.out.println("|  | |  \\ |  | |           ||   ____||  |     |   ____| /  _____||  | |  \\ |  |");
        System.out.println("|  | |   \\|  | `---|  |----`|  |__   |  |     |  |__   |  |  __  |  | |   \\|  |");
        System.out.println("|  | |  . `  |     |  |     |   __|  |  |     |   __|  |  | |_ | |  | |  . `  |");
        System.out.println("|  | |  |\\   |     |  |     |  |____ |  `----.|  |____ |  |__| | |  | |  |\\   |");
        System.out.println("|__| |__| \\__|     |__|     |_______||_______||_______| \\______| |__| |__| \\__| ");

    }

    public static void Menu() {
        int numero = 0;
        boolean pregunta_1 = true;
        boolean pregunta_2 = true;
        boolean pregunta_3 = true;
        boolean pregunta_4 = true;

        do {
            Scanner teclado = new Scanner(System.in);

            System.out.println("Indice de preguntas");
            System.out.println("1) Historia");
            System.out.println("2) Geografia");
            System.out.println("3) Economia");
            System.out.println("4) Deportes");
            System.out.println("0) Exit");

            System.out.println("Introduce una de las opciones: ");

            numero = teclado.nextInt();

            switch (numero) {
                case 1:
                    if (pregunta_1 == true) {
                        Historia();
                        pregunta_1 = false;

                    } else if (pregunta_1 == false) {
                        System.out.println("Pregunta no disponible");
                    }
                    break;

                case 2:
                    if (pregunta_2 == true) {
                        geografia();
                        pregunta_2 = false;
                    } else if (pregunta_2 == false) {
                        System.out.println("Pregunta no disponible");
                    }

                    break;

                case 3:
                    if (pregunta_3 == true) {
                        economia();
                        pregunta_3 = false;
                    } else if (pregunta_3 == false) {
                        System.out.println("Pregunta no disponible");
                    }
                    break;
                case 4:
                    if (pregunta_4 == true) {
                        deporte();
                        pregunta_4 = false;
                    } else if (pregunta_4 == false) {
                        System.out.println("Pregunta no disponible");
                    }
                    break;
                case 0:
                    System.out.println("Espero que haya disfrutado del juego :D");
                    break;

            }

        } while (numero != 0);
    }

    public static boolean Historia() {
        int puntuacion = 0;

        int opcion;
        boolean resultado = false;

        do {
            Scanner teclado = new Scanner(System.in);

            System.out.println("La pregunta es :En que año colon llego a america");
            System.out.println("1) 1492");
            System.out.println("2) 2005");
            System.out.println("3) 1977");
            System.out.println("0) No tengo ni idea");

            System.out.println("Introduce una de las opciones:");
            opcion = teclado.nextInt();

            if (opcion == 1) {
                System.out.println("Respuesta correcta");
                puntuacion++;
                resultado = true;
            } else if (opcion == 0) {
                System.out.println("Elige otra pregunta.");

                resultado = true;
            } else {
                System.out.println("Respuesta incorrecta");
                puntuacion--;
            }
            System.out.println("Has conseguido " + puntuacion + " punto");
            pulsarEnter();

        } while (!resultado);
        return resultado;

    }

    public static boolean geografia() {
        int puntuacion = 0;

        int opcion;
        boolean resultado = false;

        do {
            Scanner teclado = new Scanner(System.in);

            System.out.println("La pregunta es : ¿ Donde está la rioja?");
            System.out.println("1) Logroño");
            System.out.println("2) Sevilla");
            System.out.println("3) Malaga");
            System.out.println("0) No tengo ni idea");

            System.out.println("Introduce una de las opciones: ");
            opcion = teclado.nextInt();
            if (opcion == 1) {
                System.out.println("Respuesta correcta");
                puntuacion++;
                resultado = true;
            } else if (opcion == 0) {
                System.out.println("Respuesta incorrecta elegir otra pregunta.");

                resultado = true;

            } else {
                System.out.println("Respuesta incorrecta");
                puntuacion--;
            }
            System.out.println("Has conseguido" + puntuacion + "punto");
            pulsarEnter();

        } while (!resultado);
        return resultado;

    }

    public static boolean economia() {
        int contador_pruebas = 0;
        int total = 0;
        int puntuacion = 0;
        int opcion;
        boolean resultado = false;
        do {
            Scanner teclado = new Scanner(System.in);

            System.out.println("La pregunta es: ¿En que año entro el euro?");
            System.out.println("1) 2002");
            System.out.println("2) 1999");
            System.out.println("3) 2000");
            System.out.println("0) No tengo ni idea");

            System.out.println("Introduce una de las opciones: ");
            opcion = teclado.nextInt();
            if (opcion == 3) {
                System.out.println("Respuesta correcta ");
                puntuacion++;
                resultado = true;
            } else if (opcion == 0) {
                System.out.println("Elegir otra Pregunta.");
                resultado = true;

            } else {
                System.out.println("Resultado incorrecto");

                puntuacion--;
            }
            System.out.println("Has conseguido " + puntuacion + " punto");

            pulsarEnter();
        } while (!resultado);
        return resultado;
    }

    public static boolean deporte() {
        int puntuacion = 0;
        int opcion = 0;
        boolean resultado = false;

        do {
            Scanner teclado = new Scanner(System.in);

            System.out.println("La pregunta es: ¿En que año ganó españa el mundial");
            System.out.println("1) 2005");
            System.out.println("2) 2010");
            System.out.println("3) 2019");
            System.out.println("0) No tengo ni idea");

            if (opcion == 2) {
                System.out.println("Respuesta correcta");
                puntuacion++;
                resultado = true;
            } else if (opcion == 0) {
                System.out.println("Elegir otra pregunta");
                resultado = true;
            } else {
                System.out.println("Respuesta incorrecta");
                puntuacion--;
            }
            System.out.println("Has conseguido " + puntuacion + " punto");
            pulsarEnter();
        } while (!resultado);
        return resultado;
    }

    public static void pulsarEnter() {
        System.out.print("Pulsa Enter para continuar...");
        Scanner teclado = new Scanner(System.in);
        teclado.nextLine();
    }

}
