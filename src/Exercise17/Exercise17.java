package Exercise17;

import java.util.Scanner;

public class Exercise17 {

    public static void main(String[] args) {
        
        int numeros [] = new int [8];
        /* Tambièn se puede hacer de esta segunda manera
        int numeros [] = {3, 3, 5, 44, 3, 5}
        */
        
        Scanner teclado = new Scanner(System.in);
        
        /* numeros [0] = 35;
        numeros [1] = 34;
        numeros [2] = 33;
        numeros [3] = 32;
        numeros [4] = 31;
        numeros [5] = 30;
        numeros [6] = 29;
        numeros [7] = 28; */
        
        // Mostrar la tercera posición del array
        // System.out.println("El elemento de la tercera posición es: " + numeros[4]);
        
        // Recorrido y carga de datos
        for (int i = 0; i < numeros.length; i++) {
            // System.out.println("Estoy en el indice: " + i + " y el valor es: " + numeros[i]);
            System.out.println("Ingrese el valor para el indice: " + i);
            numeros[i] = teclado.nextInt();
        }

        System.out.println("Los valores ingresados fueron:");
        
        // Recorrido y muestra de datos
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice: " + i + " Valor: " + numeros[i]);
        }
    }
    

}
