package exercise24;

import java.util.Scanner;

public class StudentScores {

    public static void main(String[] args) {
        
        /*En una tabla de 4 filas y 3 columnas se guardan las notas de 4 alumnos de secundario. 
        Cada fila corresponde a las notas de cada alumno.
        
        Se necesita un programa que permita a un profesor cargar en las 3 primeras 
        posiciones de cada fila las notas del alumno y que en un vector diferente se calculen los promedios.
        */
        
         double notas[][] = new double [4][3];
         double promedios[] = new double [4];
        Scanner teclado = new Scanner(System.in);
        
        // Carga de notas
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese las 3 notas del alumno: " + (i+1));
            for (int j = 0; j < notas[0].length; j++) {
                notas[i][j] = teclado.nextDouble();
            }
        }
        // Calcular los promedios
        double total = 0;
        
        for (int i = 0; i < notas.length; i++) {
            total = 0;
            for (int j = 0; j < notas[0].length; j++) {
                total += notas[i][j];
                        
            }
            promedios[i] = total / notas[0].length;
        }
        
        // Muestra de notas y promedios
        System.out.println("------------------------------------------------");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Las notas del alumno " + (i+1) + " son: ");
            for (int j = 0; j < notas[0].length; j++) {
                System.out.println(notas[i][j]);
            }
            System.out.println("El promedio fue de: " + promedios[i]);
            System.out.println("------------------------------------------------");
        }
        
    }

}
