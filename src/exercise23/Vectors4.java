package exercise23;

import java.util.Scanner;

public class Vectors4 {

    public static void main(String[] args) {
        
        /*
        Un empleado desea almacenar en un vector sus 12 salarios del año. 
        A partir de esto, necesita un programa que determine y muestre por pantalla
        la suma total de sus 12 salarios y el promedio de salario que tuvo en el año.
        */
        
        double salarios[] = new double[12];
        Scanner teclado = new Scanner(System.in);

        // Carga de salarios
        for (int i = 0; i < salarios.length; i++) {
            System.out.println("Ingrese el sueldo del mes: " + i);
            salarios[i] = teclado.nextDouble();
        }

        // Suma de salarios
        double suma = 0;

        for (int i = 0; i < salarios.length; i++) {
            suma += salarios[i];
        }

        // Promedio de salarios del año
        double promedio = suma / salarios.length;

        System.out.println("El salario anual es: " + suma + " EUR");
        System.out.println("El promedio de salarios anuales: " + promedio + " EUR");
    }

}
