package exercise22;

import java.util.Scanner;

public class Vectors3 {

    public static void main(String[] args) {
        
        /*
       Realizar un programa que permita la carga de 15 números en un vector. 
       Una vez cargados, se necesita que el programa cuente e informe por pantalla cuántas veces se cargó el número 3.
         */
        
        int numeros[] = new int [15];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingresa el número para el índice: " + i);
            numeros[i] = teclado.nextInt();
        }
        
        // Contar cuántos "3" hay en el vector.
        int cont3 = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 3 || numeros[i] == -3)
                cont3++;
        }
        
        System.out.println("La calidad de números 3 dentro del vector es de: " + cont3);
    }
}
