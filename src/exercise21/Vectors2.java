package exercise21;

import java.util.Scanner;

public class Vectors2 {

    public static void main(String[] args) {
        
        /*
        Realizar un programa que permita la carga de 10 números en un vector. 
        Una vez cargados, se necesita que el programa determine cual es el mayor 
        y cual es el menor de ellos.
        */
        
        int numeros[] = new int [10];
        Scanner teclado = new Scanner(System.in);
        
        // Carga del vector
        for (int  i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el número que quire cargar en la posición: " + i);
            numeros[i] = teclado.nextInt();
        }
        
        // Búsqueda del  mayor
        int mayor = Integer.MIN_VALUE;
         
        for (int  i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            } 
        }
        
        // Búsqueda del menor
        int menor = Integer.MAX_VALUE;
         
        for (int  i = 0; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            } 
        }
        
        System.out.println("El mayor número es: " + mayor);
        System.out.println("El menor número es: " + menor);
    }

}
