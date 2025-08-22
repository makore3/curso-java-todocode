package exercise05;

import java.util.Scanner;

public class EnglishSchool {

    public static void main(String[] args) {
        // Declaración de variables
        int edadUsuario;
        Scanner teclado = new Scanner(System.in);

        System.out.println("***** Bienvenid@ a English School 'Pinguinito *****");
        System.out.println("Ingrese la edad del usuario:");
        edadUsuario = teclado.nextInt();

        if (edadUsuario >= 4 && edadUsuario <= 6) {
            System.out.println("El horario del grupo 'Kinder' es: Lunes y Miércoles de 16 a 17 hs");
        } else if (edadUsuario >= 7 && edadUsuario <= 8) {
            System.out.println("El horario del grupo '1st year' es: Martes y Jueves de 16:30 a 17:30 hs");
        } else if (edadUsuario >= 9 && edadUsuario <= 10) {
            System.out.println("El horario del grupo '2nd year' es: Martes y Jueves de 17:30 a 19 hs");
        } else if (edadUsuario >= 11 && edadUsuario <= 13) {
            System.out.println("El horario del grupo '3rd year' es: Lunes y Miércoles de 17 a 18:30 hs");
        } else {
            System.out.println("La edad ingresada no corresponde a ningún grupo disponible.");
        }
    }
}
