package Exercise02;

import java.util.Scanner;

public class Operators {
    
    public static void main(String[] args) {
        // declaración de variables
        Scanner teclado = new Scanner(System.in);
        double num1, num2, suma;
        
        System.out.println("Ingrese el primer número que quiero sumar:");
        num1 = teclado.nextDouble();
        
        System.out.println("Ingrese el segundo número que quiero sumar:");
        num2 = teclado.nextDouble();
        
        suma = num1 + num2;
        
        System.out.println("El resultado de la suma es: " + suma);
        
    }
}

