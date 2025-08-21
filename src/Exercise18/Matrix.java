package Exercise18;

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {

        int matrix[][] = new int[3][3];
        Scanner teclado = new Scanner(System.in);
        
        // Recorrido y carga
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.println("Ingrese el valor para la fila: " + i + " y la columna: " + j);
                matrix[i][j] = teclado.nextInt();
            }
        }
        
        // Recorrido y muestra
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.println("Fila: " + i + " / Columna: " + j);
            }
        }
    }
}
