package Exercise06;

import java.util.Scanner;

public class TernaryOperator {
   
    public static void main(String[] args) {
        
        // Programa que según su promedio, aprobe a un alumno dentro de una materia
        
        
        // Declaración de variables
        double promedioAlumno;
        String condicionFinal;
        Scanner teclado = new Scanner(System.in);
        
        // Pedirle al usuario que ingrese su promedio de notas
        System.out.println("Ingrese el promedio del alumno/a:");
        promedioAlumno = teclado.nextDouble();
        
        condicionFinal = promedioAlumno >= 6 ? "Aprobado" : "Reprobado";
        
        System.out.println("El alumno se encuentra: " + condicionFinal);
    }
}
