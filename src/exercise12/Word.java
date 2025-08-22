package exercise12;

import java.util.Scanner;

public class Word {

    public static void main(String[] args) {

        /* Realizar un programa que muestre en pantalla palabras 
    que sean ingresadas por teclado hasta que se ingrese la palabra “salir”. */
        String palabra;
        Scanner teclado = new Scanner(System.in);

        while (true) {
            System.out.println("Ingresa una palabra:");
            palabra = teclado.nextLine();
            if (palabra.equalsIgnoreCase("salir")) {
                System.out.println("Felicidades, haz finalizado el juego.");
                break;
            } else {
                System.out.println("La palabra es: " + palabra);
            }
        }
    }
}
